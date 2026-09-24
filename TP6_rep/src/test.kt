data class Livre(val titre: String, val auteur: String)

fun main() {
    val monLivre = Livre("Les Misérables", "Victor Hugo")

    // Appel implicite via println
    println(monLivre)
    // Affiche : Livre(titre=Les Misérables, auteur=Victor Hugo)

    // Appel explicite
    val texte = monLivre.toString()
    println(texte)
}
