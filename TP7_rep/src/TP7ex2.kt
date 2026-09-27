fun main(){
    var list = mutableListOf("rayan","saad","amine")

    list.add("radouan")
    list.removeAt(1)
    list.remove("rayan")
    println(list.contains("radouan" ))
    println(list.size)
    println(list)

}

