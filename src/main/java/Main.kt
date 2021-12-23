import com.github.vickumar1981.stringdistance.util.StringDistance
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun <A> Collection<A>.forEachParallel(f: suspend (A) -> Unit): Unit =
    runBlocking {
        map { async { f(it) } }.forEach { it.await() }
    }

fun Double.format(digits: Int): Double = "%.${digits}f".format(this).replace(",", ".").toDouble()

fun main() {

    val x = StringDistance.damerau("expected", "expected")
    val inputName = expectedObject.name
    val inputMotherName = expectedObject.motherName
    val inputCpf = expectedObject.cpf
    val inputBirthdate = expectedObject.birthdate
    val listObj = inputsOfObject()
    val scoreList = mutableMapOf<Pessoa, Double>()
    var bigScore = 0.0
    var objectSelected: Pessoa? = null

    fun calculateScore(
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

    listObj.forEach {
        for (i in it.value) {
            val scoreName = StringDistance.tversky(inputName, i.name.uppercase())
            val scoreMotherName = StringDistance.tversky(inputMotherName, i.motherName.uppercase())
            val scoreCpf = 1.0.takeIf { i.cpf == inputCpf } ?: 0.0
            val birthdate = 1.0.takeIf { i.birthdate == inputBirthdate } ?: 0.0
            val totalScore = calculateScore(scoreName, scoreMotherName, scoreCpf, birthdate, it.key)
            println("total score que veio do metodo = " + totalScore)
            scoreList[i] = totalScore
        }
    }

    scoreList.forEach {

        if (it.value > bigScore) {
            bigScore = it.value
            objectSelected = it.key
        }
    }

    println("maior score é: $bigScore e seu objeto é o: $objectSelected")
}
