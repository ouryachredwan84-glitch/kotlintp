class Personne {

    lateinit var name: String

    val description: String by lazy {
        "Nom: $name"
    }
}

fun main() {

    val personne = Personne()

    personne.name = "Ouryach"

    println(personne.description)
}