open class Personne(var nom : String ,
                var prenom : String,
                var email : String){

    fun afficherinfo(){
        println("$nom - $prenom - $email")
    }

}

class Utilisateur(nom: String,
                  prenom: String,
                  email: String,
                  var idUtilisateur: Int,
                  var emprunts : MutableList<Emprunt>) :Personne(nom,prenom,email){

    fun emprunterLivre(livre: Livre, dateEmprunt: String){
        emprunts.add(livre,dateEmprunt)
    }

    fun afficherEmprunts(){
        println("voici les Emprunts de utilisateur $idUtilisateur")
        for(i in emprunts){
            println(i)
        }
    }
}

class Livre(var titre : String ,
            var auteur : String ,
            var isbn : String ,
            var nombreExemplaires : Int){

    fun  afficherDetails(){
        println("titre: $titre\n auteur: $auteur\n isbn: $isbn\n nombreExemplaires:$nombreExemplaires")
    }

    fun disponiblePourEmprunt(): Boolean{

        if(nombreExemplaires < 1){
            return true
        }else{
            return false
        }
    }
}

class Emprunt(var utilisateur : Utilisateur,
              var livre : Livre,
              var dateEmprunt : String,
              var dateRetour : String?){

    fun afficherDetails(){
        println("utilisateur: $utilisateur \n livre: $livre \n date: $dateEmprunt \n dateRetour: $dateRetour")
    }

    fun  retournerLivre(){

    }
}



fun main(){

}
