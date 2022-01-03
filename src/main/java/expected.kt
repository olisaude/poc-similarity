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
    ,QueryType.CPF
    ), Pessoa(
        "CICLANA SANTOS SANTOS", "MARIA APARECIDA SANTOS",
        "1950-12-18".toLocalDate(DateTimeFormatter.ofPattern("yyyy-MM-dd")), "123456789"
        ,QueryType.CPF
    )
)

val pessoaByName = mutableListOf(
    Pessoa(
        "MARIA DOS SANTOS LIMA", "ADRIANA L GOMES",
        "1971-12-19".toLocalDate(DateTimeFormatter.ofPattern("yyyy-MM-dd")), "43745985705"
        ,QueryType.NAME
    ), Pessoa(
        "MARIA DOS SANTOS LIMA",
        "ADRIANA LIMA GOMES",
        "1971-12-19".toLocalDate(DateTimeFormatter.ofPattern("yyyy-MM-dd")),
        "123456789"
        ,QueryType.NAME
    )
)

val pessoaByMotherName = mutableListOf(
    Pessoa(
        "MARIA SANTOS", "ADRIANA LIMA GOMES",
        ("1985-09-23").toLocalDate(DateTimeFormatter.ofPattern("yyyy-MM-dd")), ""
        ,QueryType.MOTHERNAME
    )
)

val pessoaByBirthdate = mutableListOf(
    Pessoa(
        "MARIA DOS SANTOS LIMA", "ADRIANA L GOMES",
        "1971-12-19".toLocalDate(DateTimeFormatter.ofPattern("yyyy-MM-dd")), "43745985705"
        ,QueryType.BIRTHDATE
    ),
    Pessoa(
        "MARIA DOS S LIMA",
        "CLAUDINEIA LIMA GOMES",
        "1971-12-19".toLocalDate(DateTimeFormatter.ofPattern("yyyy-MM-dd")),
        "123456789"
        ,QueryType.BIRTHDATE
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