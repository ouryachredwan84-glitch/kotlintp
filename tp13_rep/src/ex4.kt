inline fun  filterList(list: List<Int>,lambda:(Int)-> Boolean): List<Int> {
    var listfiltred = mutableListOf<Int>()
    for (i in list) {
        if(lambda(i)){
            listfiltred.add(i)
        }
    }
    return listfiltred
}

fun main(){
    val list = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    var result = filterList(list){x->
        if (x%2 == 0){
            true

            
        }else false
    }

    println(result)
}