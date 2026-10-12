inline fun measureTime(nomTache: String, tache: () -> Unit) {
    val debut = System.currentTimeMillis()

    tache()

    val fin = System.currentTimeMillis()
    val duree = fin - debut

    println("Tâche : $nomTache")
    println("Temps d'exécution : $duree ms")
}

fun main() {
    measureTime("Calcul") {
        var somme = 0
        for (i in 1..1_000_000) {
            somme += i
        }
    }

    measureTime("Affichage") {
        println("Bonjour Kotlin !")
    }
}