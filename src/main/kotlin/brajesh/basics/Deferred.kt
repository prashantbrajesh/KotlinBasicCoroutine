package brajesh.basics

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

/*In order to get the result of the deferred value
, async returns a convenient Deferred object,
which is the equivalent of Future or Promise*/

fun main() {
    val deferredResult: Deferred<String> = GlobalScope.async {
        delay(1000L)
        "World!"
    }

    runBlocking {
        println("Hello, ${deferredResult.await()}")
    }
}
