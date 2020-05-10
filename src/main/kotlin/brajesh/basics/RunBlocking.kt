package brajesh.basics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking {
    GlobalScope.launch {
           delay(1000)
           print(" world!")
       }
       print("Hello")
       Thread.sleep(1500)
}



//// having there on coroutine scope
//fun main() = runBlocking {  // this: CoroutineScope
//    val job = launch {// launch a new coroutine in the scope of runBlocking
//           delay(1000)
//           print(" world!")
//       }
//       print("Hello")
//    job.join() // without join also it works why  ******
////       Thread.sleep(1500)
//}
