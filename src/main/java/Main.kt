import com.github.vickumar1981.stringdistance.util.StringDistance
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import reactor.core.publisher.Flux

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

    Flux.just(pessoaByCpf, pessoaByName, pessoaByMotherName, pessoaByBirthdate)
    .flatMapIterable { it }
    .map { ps ->
        val scoreName = StringDistance.tversky(inputName, ps.name.uppercase())
        val scoreMotherName = StringDistance.tversky(inputMotherName, ps.motherName.uppercase())
        val scoreCpf = 1.0.takeIf { ps.cpf == inputCpf } ?: 0.0
        val birthdate = 1.0.takeIf { ps.birthdate == inputBirthdate } ?: 0.0
        val totalScore = calculateScore(scoreName, scoreMotherName, scoreCpf, birthdate, ps.queryType!!)
        PessoaSelect(
            ps,
            totalScore
        )
    }
    .sort { o1, o2 ->
        o2.score.compareTo(o1.score)
    }.take(1)
    .subscribe {
        println(it)
    }
}

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
