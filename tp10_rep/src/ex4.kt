fun afficher(resultat: Int) {
    println("Résultat : $resultat")
}
fun calcul(x: Int, y: Int, callback: (Int) -> Unit) {
    val resultat = x + y
    callback(resultat)
}
fun main(){
    calcul(5, 3, ::afficher)
}