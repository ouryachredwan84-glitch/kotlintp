fun main(){
//    var avion1= Avion("tiyara","A93F72",2,3)
//    avion1.Afficher_details()
//    avion1.se_deplacer()
//
//    println("############################")
//
//    var car1= Voiture("dacia","sandero",2007,4)
//    car1.se_deplacer()
//    car1.Afficher_details()
//
//    println("############################")
//
//    var velo1 = Velo("bitwin","XXXX",2)
//    velo1.Afficher_details()
//    velo1.se_deplacer()

    voitures.forEach {
        it.Afficher_details()
        it.se_deplacer()
    }

    avions.forEach {
        it.Afficher_details()
        it.se_deplacer()
    }
    velos.forEach {
        it.Afficher_details()
        it.se_deplacer()
    }
}
open class Vehicule(var marque : String, var modele: String){

    fun Afficher_details(){
        println("marque: $marque")
        println("modele: $modele")
    }
    open fun se_deplacer(){
        println("$marque se déplace en")
    }
}
class  Avion(marque : String,modele: String,
             var ailes:Int,
             var nbrRoues:Int):Vehicule(marque,modele){
    override fun se_deplacer(){
        println("$marque se déplace en voler")
    }

}

class  Voiture(marque : String,modele: String,
             var annee:Int,
             var nbrRoues:Int):Vehicule(marque,modele){
    override fun se_deplacer(){
        println("$marque se déplace en rouler")
    }

}

class  Velo(marque : String,modele: String,
            var nbrRoues:Int):Vehicule(marque,modele){
    override fun se_deplacer(){
        println("$marque se déplace en rouler")
    }

}
val voitures = listOf(
    Voiture("Toyota", "Corolla", 2020, 4),
    Voiture("BMW", "Serie 3", 2022, 4),
    Voiture("Mercedes", "Classe C", 2021, 4),
    Voiture("Audi", "A4", 2019, 4),
    Voiture("Volkswagen", "Golf", 2023, 4),
    Voiture("Renault", "Clio", 2018, 4),
    Voiture("Peugeot", "208", 2022, 4),
    Voiture("Ford", "Focus", 2020, 4),
    Voiture("Hyundai", "i30", 2021, 4),
    Voiture("Kia", "Sportage", 2023, 4),
    Voiture("Dacia", "Logan", 2019, 4),
    Voiture("Honda", "Civic", 2020, 4),
    Voiture("Tesla", "Model 3", 2024, 4),
    Voiture("Fiat", "Panda", 2017, 4),
    Voiture("Nissan", "Qashqai", 2022, 4)

)
val avions = listOf(
    Avion("Boeing", "737", 2, 6),
    Avion("Airbus", "A320", 2, 6),
    Avion("Boeing", "747", 2, 18),
    Avion("Airbus", "A380", 2, 22),
    Avion("Boeing", "787", 2, 10),
    Avion("Airbus", "A350", 2, 14),
    Avion("Embraer", "E190", 2, 6),
    Avion("Bombardier", "CRJ900", 2, 6),
    Avion("Cessna", "172", 2, 3),
    Avion("Dassault", "Falcon 900", 2, 3),
    Avion("Gulfstream", "G650", 2, 3),
    Avion("Antonov", "An-225", 2, 32),
    Avion("Lockheed", "C-130", 2, 6),
    Avion("Concorde", "Supersonic", 2, 9),
    Avion("Boeing", "777", 2, 14)

)
val velos = listOf(
    Velo("Btwin", "Riverside 500", 2),
    Velo("Giant", "Escape 3", 2),
    Velo("Trek", "Marlin 5", 2),
    Velo("Specialized", "Rockhopper", 2),
    Velo("Cannondale", "Trail 7", 2),
    Velo("Scott", "Aspect 950", 2),
    Velo("Cube", "Aim Pro", 2),
    Velo("Bianchi", "Via Nirone 7", 2),
    Velo("Merida", "Big Nine", 2),
    Velo("Orbea", "Alma H30", 2),
    Velo("Decathlon", "Elops 500", 2),
    Velo("Rockrider", "ST 530", 2),
    Velo("Brompton", "C Line", 2),
    Velo("Kona", "Dew Plus", 2),
    Velo("Lapierre", "Edge 2.9", 2)

)