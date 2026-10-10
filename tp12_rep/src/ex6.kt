
fun convertToIntList(list:List<String>):List<Int>{
    var convertedlist= mutableListOf<Int>()
    for(i in list){

        try{
            var nbr = i.toInt()

            convertedlist.add(nbr)

        }catch(e:Exception){
            println("Erreur :$i nest pas valid pour la conversion")
        }

    }
    return convertedlist
}

fun main(){
    var list = listOf<String>("0","3ef","40","2","f3e","20")
    val result = convertToIntList(list)
    println(result)

}