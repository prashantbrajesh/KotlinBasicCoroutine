package brajesh.basics
import javafx.application.Application.launch
import kotlinx.coroutines.*
import java.time.LocalDateTime
import kotlin.concurrent.thread


// job.jon had to make it suspended
suspend fun main(args: Array<String>) {


    run{
        print("kahsdhas")
    }
//    thread{
//        Thread.sleep(1000)
//        println(" world!")
//    }
//    println("Hello")
//    Thread.sleep(1500)

    val job = GlobalScope.launch {
//        delay(1000)
//        print(" world!")
        someBusyFunction()
    }
//    print("Hello")
    job.join()
    Thread.sleep(3000)

}


suspend fun someNetworkCallReturningSomething(): String {
    // some networking operations making use of the suspending mechanism
    coroutineScope {
        launch {
            delay(1000L)
            println(" someNetworkCallReturningSomething second ${LocalDateTime.now()}")
            println(" someNetworkCallReturningSomething second ${Thread.currentThread().name}")
        }
    }

    return "http"
}

suspend fun someBusyFunction(): Unit {
    delay(1000L)
    println(" someBusyFunction second ${LocalDateTime.now()}")
    val something: String = someNetworkCallReturningSomething()
    GlobalScope.launch{someNetworkCallReturningSomething()}
    GlobalScope.launch{someNetworkCallReturningSomething()}
    GlobalScope.launch{someNetworkCallReturningSomething()}
    GlobalScope.launch{someNetworkCallReturningSomething()}
    GlobalScope.launch{someNetworkCallReturningSomething()}

    println("Received $something from network ${LocalDateTime.now()}")
}


suspend fun testSuspend(){
    GlobalScope.launch {
           delay(1000)
           print(" world!")
       }
}
 fun testThis():Int{
   return 10
}

