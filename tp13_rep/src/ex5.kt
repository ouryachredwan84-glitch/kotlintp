inline fun processList(list: List<Int>,
                       predicat:(Int)-> Boolean,
                       noinline operation:(Int)-> Int,): List<Int>{
    var filtredlist= mutableListOf<Int>()
        for (x in list){

            if(predicat(x)){

                var res = operation(x)
                filtredlist.add(res)

            }

        }
    return filtredlist
}

fun main(){
    val list = listOf(1,2,3,4,5)

    var result = processList(list,{it % 2 == 0}){x->x+2}

    println(result)
}
