fun main(){
    open class Personne(
        var nom: String,
        var age: Int
    ) {
        fun afficher() {
            println("Nom : $nom")
            println("Age : $age")
        }
    }

    class Etudiant(
        nom: String,
        age: Int,
        var filiere: String
    ) : Personne(nom, age) {

        fun afficherFiliere() {
            println("Filière : $filiere")
        }
    }

    val etudiant1 = Etudiant("Rayan", 20, "Informatique")


}