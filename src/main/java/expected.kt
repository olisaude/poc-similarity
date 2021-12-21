
const val expected =  "EMANUELLE DE ARAUJO ALVES"
fun inputsOfName() = listOf(
    "Emanuelle de Araujo Alves",
    "Emanuelle de Araújo Alves",
    "EMANUELLE DE ARAUJO ALVES",
    "EMANUELLE DE ARAÚJO ALVES",
    "Emanuelle Araujo Alves",
    "Emanuelle A Alves",
    "Emanuelle",
    "Enzo Soares Alves",
    "Emanuele Alves Araujo",
    "Manuela des Araujo Alves",
    "fulaninho Alves Alves"
)

const val expectedText =  "O RATO ROEU A ROUPA DO REI DE ROMA"
fun inputsOfText() = listOf(
    "o rato roeu a roupa do rei de roma",
    "O RATO ROEU ROUPA ROMA REI",
    "a roupa do rei, o rato roeu",
    "rei de roma, o rato roeu a roupa",
    "rato roeu roupa rei roma"
)
