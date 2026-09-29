fun main(){
    val or1 = Ordinateur("Windows","windows-11")
    val tel1 = Telephone("samsung","0611223344")
}
open class Appareil(open var marque:String,var allume: Boolean=false){
    init{
        println("Création de l'appareil de marque : $marque")
    }
    fun allumer():Boolean{
        allume=true
        return allume
    }

}
class Telephone( override var marque:String,var numeroDeTelephone:String,):Appareil(marque){
    init{
        println("Création du téléphone avec le numéro : $numeroDeTelephone")
    }
}
class Ordinateur(override var marque: String,var os :String):Appareil(marque){
    init{
        println("Création du Ordinateur avec le systèmeDExploitation : $os")
    }
}
//pour la redéfinition des propriter en construceur du classe on fait open dans la classe maere
// et override dans classe fille avant declaration du varibale comme ce exercice