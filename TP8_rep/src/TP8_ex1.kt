fun main(){
    val chien = Terrestre("jiraf","jirqf",Animaux.TERRESTRE)
    val oiseau = VolantAnimal("CANAR","CANAR",Animaux.VOLANT)
    val daulphin = AquatiqueAnimal("daulphine","daulphine",Animaux.AQUATIQUE)
    ajouteranimal(chien)
    ajouteranimal(oiseau)
    ajouteranimal(daulphin)
    println(oiseau.voler())
    println(daulphin.nager())


}
enum class Animaux{
    TERRESTRE,VOLANT,AQUATIQUE
}

interface Volant{
    fun voler(): String
}

interface Aquatique{
    fun  nager(): String
}

sealed class Animal(var nom:String,
                    var espece: String,
                    var type:Animaux)

//class Terrestre(nom:String, espece: String, type: animaux) :Animal(nom,espece,type)

data class Terrestre(
    var nomAnimal: String,
    var especeAnimal: String,
    var typeAnimal: Animaux
) : Animal(nomAnimal, especeAnimal, typeAnimal)


//class VolantAnimal(nom:String, espece: String, type: animaux)
//                    :Animal(nom,espece,type),Volant{
//    override fun voler(): String {
//        return "animal vole"
//    }
//}
data class VolantAnimal(
    var nomAnimal: String,
    var especeAnimal: String,
    var typeAnimal: Animaux
) : Animal(nomAnimal, especeAnimal, typeAnimal), Volant {

    override fun voler(): String {
        return "$nomAnimal est un animal qui vole."
    }
}

//class AquatiqueAnimal(nom:String,
//                      espece: String,
//                      type: animaux): Animal(nom,espece,type), Aquatique{
//    override fun nager(): String {
//        return "animal nager"
//    }
//}
data class AquatiqueAnimal(
    var nomAnimal: String,
    var especeAnimal: String,
    var typeAnimal: Animaux
) : Animal(nomAnimal, especeAnimal, typeAnimal), Aquatique {

    override fun nager(): String {
        return "$nomAnimal est un animal qui nage."
    }
}

val parcanimaux = mutableListOf<Animal>()

fun ajouteranimal(obj:Animal){
    parcanimaux.add(obj)
}