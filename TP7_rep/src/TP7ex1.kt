fun main(){
val rayan = "rayan"
    rayan.containsSubstring("an")
    println(rayan.containsSubstring("or"))
}
fun String. containsSubstring(substring: String): Boolean{
    return this.contains(substring)
}