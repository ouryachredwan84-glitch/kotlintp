
fun readNumber() {
    while (true) {
        try {
            println("Entrez un nombre entier :")
            val nombre = readln().toInt()

            println("Le nombre entré est : $nombre")
            break

        } catch (e: NumberFormatException) {
            println("Erreur : veuillez entrer un nombre entier valide.")
        }
    }
}

fun main() {
    readNumber()
}
