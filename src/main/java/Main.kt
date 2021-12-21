import com.fasterxml.jackson.databind.ObjectMapper
import com.github.vickumar1981.stringdistance.util.StringDistance
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import java.security.MessageDigest

fun <A> Collection<A>.forEachParallel(f: suspend (A) -> Unit): Unit =
    runBlocking {
        map { async { f(it) } }.forEach { it.await() }
    }

fun ByteArray.toHex(): String {
    return joinToString("") { "%02x".format(it) }
}

fun main (){
    val mapper = ObjectMapper()
    val x = StringDistance.damerau("expected", "expected")

    val map = mutableListOf<Map<String, Any>>()
    val input = expectedText
    val listObj = inputsOfText()
    listObj.map { it.uppercase() }.forEachParallel{
        var init = System.currentTimeMillis()
        map.add(mapOf(
            "algorithm" to "demerau",
            "score" to (StringDistance.damerau(input, it) ),
            "input" to it,
            "time" to ((System.currentTimeMillis() - init)  / 1000.0)
        ))

        init = System.currentTimeMillis()
        map.add(mapOf(
            "algorithm" to "cosSimilarity",
            "score" to (StringDistance.cosine(input, it) ),
            "input" to it,
            "time" to ((System.currentTimeMillis() - init) / 1000.0)
        ))

        init = System.currentTimeMillis()
        map.add(mapOf(
            "algorithm" to "diceCoefficient",
            "score" to (StringDistance.diceCoefficient(input, it) ),
            "input" to it,
            "time" to ((System.currentTimeMillis() - init) / 1000.0)
        ))

        init = System.currentTimeMillis()
        map.add(mapOf(
            "algorithm" to "hamming",
            "score" to (StringDistance.hamming(input, it) ),
            "input" to it,
            "time" to ((System.currentTimeMillis() - init) / 1000.0)
        ))

        init = System.currentTimeMillis()
        map.add(mapOf(
            "algorithm" to "jaccard",
            "score" to (StringDistance.jaccard(input, it) ),
            "input" to it,
            "time" to ((System.currentTimeMillis() - init) / 1000.0)
        ))

        init = System.currentTimeMillis()
        map.add(mapOf(
            "algorithm" to "jaro",
            "score" to (StringDistance.jaro(input, it) ),
            "input" to it,
            "time" to ((System.currentTimeMillis() - init) / 1000.0)
        ))

        init = System.currentTimeMillis()
        map.add(mapOf(
            "algorithm" to "jaroWinkler",
            "score" to (StringDistance.jaroWinkler(input, it) ),
            "input" to it,
            "time" to ((System.currentTimeMillis() - init) / 1000.0)
        ))

        init = System.currentTimeMillis()
        map.add(mapOf(
            "algorithm" to "levenshtein",
            "score" to (StringDistance.levenshtein(input, it) ),
            "input" to it,
            "time" to ((System.currentTimeMillis() - init) / 1000.0)
        ))

        init = System.currentTimeMillis()
        map.add(mapOf(
            "algorithm" to "needlemanWunsch",
            "score" to (StringDistance.needlemanWunsch(input, it) ),
            "input" to it,
            "time" to ((System.currentTimeMillis() - init) / 1000.0)
        ))

        init = System.currentTimeMillis()
        map.add(mapOf(
            "algorithm" to "nGram",
            "score" to (StringDistance.nGram(input, it) ),
            "input" to it,
            "time" to ((System.currentTimeMillis() - init) / 1000.0)
        ))

        init = System.currentTimeMillis()
         map.add(mapOf(
            "algorithm" to "overlap",
            "score" to (StringDistance.overlap(input, it) ),
            "input" to it,
            "time" to ((System.currentTimeMillis() - init) / 1000.0),
             "memory" to Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()
        ))

        init = System.currentTimeMillis()

        map.add(mapOf(
            "algorithm" to "smithWaterman",
            "score" to (StringDistance.smithWaterman(input, it) ),
            "input" to it,
            "time" to ((System.currentTimeMillis() - init) / 1000.0)
        ))

        init = System.currentTimeMillis()
         map.add(mapOf(
            "algorithm" to "smithWatermanGotoh",
            "score" to (StringDistance.smithWatermanGotoh(input, it) ),
            "input" to it,
            "time" to ((System.currentTimeMillis() - init) / 1000.0),
             "memory" to Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()
        ))

        init = System.currentTimeMillis()
        map.add(mapOf(
            "algorithm" to "tversky",
            "score" to (StringDistance.tversky(input, it) ),
            "input" to it,
            "time" to ((System.currentTimeMillis() - init) / 1000.0)
        ))

        init = System.currentTimeMillis()
        map.add(mapOf(
            "algorithm" to "tversky-2",
            "score" to (StringDistance.tversky(input, it,  0.5) ),
            "input" to it,
            "time" to ((System.currentTimeMillis() - init) / 1000.0)
        ))

        init = System.currentTimeMillis()
        map.add(mapOf(
            "algorithm" to "damerauDist",
            "score" to (StringDistance.damerauDist(input, it) ),
            "input" to it,
            "time" to ((System.currentTimeMillis() - init) / 1000.0)
        ))

    }

    println(mapper.writeValueAsString(map))
}

object Utils {

    fun sha1(input: String) = hashString("SHA-1", input)
    fun md5(input: String) = hashString("MD5", input)
    fun sha256(input: String) = hashString("SHA-256", input)

    private fun hashString(type: String, input: String): String {
        val bytes = MessageDigest
            .getInstance(type)
            .digest(input.toByteArray())
        return bytes.toHex().uppercase()
    }
}