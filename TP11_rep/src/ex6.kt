fun convertToInt(string: String): Int {

    try {
        val nbr = string.toInt()
        if (nbr < 0) {
            throw NegativeNumberException("ERROR entier est négatif")
        }
        return nbr
    } catch (e:Exception) {
        println("error numberFormat ${e.message}")
        return 0
    }
}
class NegativeNumberException(message: String): Exception(message)

fun main() {

    val valeurs = listOf(
        "25",
        "0",
        "-10",
        "abc",
        "12.5",
        "100"
    )

    for (valeur in valeurs) {
        try {
            val resultat = convertToInt(valeur)
            println("Conversion réussie : $valeur -> $resultat")

        } catch (e: NegativeNumberException) {
            println("Erreur : ${e.message}")
        }

        println("--------------------")
    }
}