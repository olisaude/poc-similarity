import org.apache.commons.lang3.mutable.Mutable
import reactor.core.publisher.Flux
import java.time.LocalDate
import java.time.format.DateTimeFormatter

val expectedObject = Pessoa(
    "MARIA DOS SANTOS LIMA",
    "ADRIANA LIMA GOMES",
    "1971-12-19".toLocalDate(DateTimeFormatter.ofPattern("yyyy-MM-dd")),
    "123456789"
)
val pessoaByCpf = mutableListOf(
    Pessoa(
        "MARIA SANTOS LIMA", "ADRIANA LIMA",
        "1998-07-19".toLocalDate(DateTimeFormatter.ofPattern("yyyy-MM-dd")), "123456789"
    ), Pessoa(
        "CICLANA SANTOS SANTOS", "MARIA APARECIDA SANTOS",
        "1950-12-18".toLocalDate(DateTimeFormatter.ofPattern("yyyy-MM-dd")), "123456789"
    )
)

val pessoaByName = mutableListOf(
    Pessoa(
        "MARIA DOS SANTOS LIMA", "ADRIANA L GOMES",
        "1971-12-19".toLocalDate(DateTimeFormatter.ofPattern("yyyy-MM-dd")), "43745985705"
    ), Pessoa(
        "MARIA DOS SANTOS LIMA",
        "ADRIANA LIMA GOMES",
        "1971-12-19".toLocalDate(DateTimeFormatter.ofPattern("yyyy-MM-dd")),
        "123456789"
    )
)

val pessoaByMotherName = mutableListOf(
    Pessoa(
        "MARIA SANTOS", "ADRIANA LIMA GOMES",
        ("1985-09-23").toLocalDate(DateTimeFormatter.ofPattern("yyyy-MM-dd")), ""
    )
)

val pessoaByBirthdate = mutableListOf(
    Pessoa(
        "MARIA DOS SANTOS LIMA", "ADRIANA L GOMES",
        "1971-12-19".toLocalDate(DateTimeFormatter.ofPattern("yyyy-MM-dd")), "43745985705"
    ),
    Pessoa(
        "MARIA DOS S LIMA",
        "CLAUDINEIA LIMA GOMES",
        "1971-12-19".toLocalDate(DateTimeFormatter.ofPattern("yyyy-MM-dd")),
        "123456789"
    )

)

fun inputsOfObject() = mutableMapOf(
    QueryType.CPF to pessoaByCpf,
    QueryType.NAME to pessoaByName,
    QueryType.BIRTHDATE to pessoaByMotherName,
    QueryType.MOTHERNAME to pessoaByBirthdate
)

fun String.toLocalDate(formatter: DateTimeFormatter): LocalDate =
    LocalDate.parse(this, formatter)