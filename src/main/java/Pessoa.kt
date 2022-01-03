
import java.time.LocalDate

data class Pessoa(
    val name: String,
    val motherName: String,
    val birthdate: LocalDate,
    val cpf: String,
    val queryType: QueryType? = null
)

data class PessoaSelect(
    val pessoa: Pessoa,
    val score: Double
)

const val pesoName: Double = 1.0
const val pesoMotherName: Double = 2.0
const val pesoBirthdate: Double = 2.5
const val pesoCpf: Double = 3.0

enum class QueryType {
    CPF,
    NAME,
    BIRTHDATE,
    MOTHERNAME;
}