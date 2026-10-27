
import kotlinx.coroutines.*

fun main() = runBlocking {

    println("Début du programme")

    // 1. GlobalScope
    val globalJob = GlobalScope.launch {
        delay(1000)
        println("GlobalScope : téléchargement terminé")
    }

    // 2. Scope personnalisé
    val downloadScope = CoroutineScope(Dispatchers.Default)

    downloadScope.launch {
        try {
            repeat(5) {
                delay(500)
                println("Téléchargement en cours...")
            }
        } finally {
            println("Téléchargement : fin")
        }
    }

    downloadScope.launch {
        try {
            delay(2000)
            println("Traitement des données terminé")
        } finally {
            println("Traitement : fin")
        }
    }

    // Laisser les tâches démarrer
    delay(1200)

    // Annuler les coroutines du scope personnalisé
    println("Annulation du scope personnalisé")
    downloadScope.cancel()

    // Attendre la fin de la coroutine globale
    globalJob.join()

    println("Fin du programme")
}
