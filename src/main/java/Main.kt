import com.github.vickumar1981.stringdistance.util.StringDistance
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import reactor.core.publisher.Flux
import reactor.core.publisher.toMono
import java.time.LocalDate

fun <A> Collection<A>.forEachParallel(f: suspend (A) -> Unit): Unit =
    runBlocking {
        map { async { f(it) } }.forEach { it.await() }
    }

fun Double.format(digits: Int): Double = "%.${digits}f".format(this).replace(",", ".").toDouble()

fun main() {

    val x = StringDistance.tversky("expected", "expected")
    val inputName = expectedObject.name
    val inputMotherName = expectedObject.motherName
    val inputCpf = expectedObject.cpf
    val inputBirthdate = expectedObject.birthdate
    val inputsObj = inputsOfObject()
    val scoreList = mutableMapOf<Pessoa, Double>()
    var bigScore = 0.0
    var objectSelected: Pessoa? = null
    val inputs = Flux.fromIterable(inputsObj.toList())

    val similarPair = findSimilarOne(
        inputs,
        inputName,
        inputMotherName,
        inputCpf,
        inputBirthdate,
        scoreList,
        bigScore,
        objectSelected
    )

    println("o maior score é o = " + similarPair.first)
    println("o objeto relaionado ao maior score é o = "+ similarPair.second)

    // println("o maior score é o = " +bigScore)
    // println("o objeto relaionado ao maior score é o = "+objectSelected)
}

private fun findSimilarOne(
    inputs: Flux<Pair<QueryType, MutableList<Pessoa>>>,
    inputName: String,
    inputMotherName: String,
    inputCpf: String,
    inputBirthdate: LocalDate,
    scoreList: MutableMap<Pessoa, Double>,
    bigScore: Double,
    objectSelected: Pessoa?
): Pair<Double, Pessoa?>{
    var bigScore1 = bigScore
    var objectSelected1= objectSelected


    inputs.map {
        for(i in it.second){
            val scoreName = StringDistance.tversky(inputName, i.name.uppercase())
            val scoreMotherName = StringDistance.tversky(inputMotherName, i.motherName.uppercase())
            val scoreCpf = 1.0.takeIf { i.cpf == inputCpf } ?: 0.0
            val birthdate = 1.0.takeIf { i.birthdate == inputBirthdate } ?: 0.0
            val totalScore = calculateScore(scoreName, scoreMotherName, scoreCpf, birthdate, it.first)
            println("total score que veio do metodo = $totalScore")
            scoreList[i] = totalScore
            // if (totalScore > bigScore) {
            //     bigScore1 = totalScore
            //     objectSelected1 = i
            // }
        }
    }


    scoreList.forEach {
        if (it.value > bigScore) {
            bigScore1 = it.value
            objectSelected1 = it.key
        }
    }

    return Pair(bigScore1,objectSelected1)
}



private fun calculateScore(
    scoreName: Double,
    scoreMotherName: Double,
    scoreCpf: Double,
    scoreBirthdate: Double,
    type: QueryType
): Double {

    val peso = when (type) {
        QueryType.CPF -> pesoCpf
        QueryType.MOTHERNAME -> pesoMotherName
        QueryType.BIRTHDATE -> pesoBirthdate
        else -> pesoName
    }
    val countScore =
        ((scoreName + scoreMotherName + scoreCpf + scoreBirthdate) * peso) / (4.0 * peso)

    return countScore.format(5)
}
