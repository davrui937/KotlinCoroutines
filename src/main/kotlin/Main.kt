import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    println("Empiezo main")

    //Empieza la coroutine
    GlobalScope.launch{
        println("Corrutina a dormir")
        delay(1000)
        println("Corrutina despierta")
    }

    println("Main sigue a lo suyo")
    Thread.sleep(2000) //espera 2 segundos
    println("Termina")
}
