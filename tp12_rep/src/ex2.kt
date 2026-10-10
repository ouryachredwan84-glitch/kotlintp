import java.sql.ResultSet

fun countElements(list: List<Int>, lambda:(Int)-> Boolean){
    var countPAIRE = 0
    var countplusque10 = 0
    for (element in list) {
       if(lambda(element)){
          countPAIRE++

       }else{
           countplusque10++
       }

    }

    println("count paire: $countPAIRE")
    println("count les nombre plus que 10: "+countplusque10)
}

fun main(){
    val list = listOf(1,40,3,4,100,6,7,8,9,10,5)
    var Resultat = countElements(list,{
        a-> if(a%2==0) true else false

    })

}

