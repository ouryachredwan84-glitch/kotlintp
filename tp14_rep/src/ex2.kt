
import kotlinx.coroutines.*

fun main() = runBlocking {

    println("Début du programme")

    launch(Dispatchers.Default) {
        delay(1000)
        println("Calcul des données terminé")
    }

    launch(Dispatchers.IO) {
        delay(2000)
        println("Lecture du fichier terminée")
    }

    launch(Dispatchers.Main) {
        delay(3000)
        println("Troisième tâche terminée")
    }

    println("Les coroutines ont démarré")
}
