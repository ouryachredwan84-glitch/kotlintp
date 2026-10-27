
import kotlinx.coroutines.*

suspend fun verifierDisponibilite() {
    delay(2000)
    println("Les ingrédients sont disponibles")
}

suspend fun preparerCommande() {
    delay(5000)
    println("Préparation de la commande terminée")
}

suspend fun livrerRepas() {
    delay(3000)
    println("Livraison du repas terminée")
}

fun main() = runBlocking {
    launch {
        verifierDisponibilite()
    }.join()

    launch {
        preparerCommande()
    }.join()

    launch(Dispatchers.IO) {
        livrerRepas()
    }.join()

    println("Commande livrée avec succès !")
}
//suspend katsmeh lina ndiro wahed delay f les function dylna