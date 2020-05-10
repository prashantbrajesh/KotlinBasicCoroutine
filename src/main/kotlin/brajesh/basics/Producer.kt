package brajesh.basics

import javafx.application.Application.launch
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.concurrent.*

fun main() {
    val orderStatusPairChannel = Channel<Int>()

    var i:Int=1
    val map = ConcurrentHashMap<Long,Int>()
    val timeSliceChosen: Long = 15 // this is time in minutes
    var timeFrames = 0L..(1440L - timeSliceChosen) step timeSliceChosen
    
    timeFrames.chunked(24).parallelStream().forEach{
        println(it);it.forEach{
        Thread.sleep(1000)
        map.put(it,1)}}

    for ((k,v) in map){
        println("$k -> $v")
    }
//    for (k in 1..10)
//    GlobalScope.launch (CoroutineName("orderServiceClient")) {
//
//            println("sending {$k}")
//            orderStatusPairChannel.send(k)
////            delay(100)
//        println("exiting {$k}")
//
//    }

//    GlobalScope.launch (CoroutineName("orderServiceClient")) {
//        orderStatusPairChannel.close()
//               for (a in orderStatusPairChannel)
//                   println(a)
//       }
//
//Thread.sleep(10000)
//    val timeSliceChosen = 15L // this is time in minutes
//    // fetch for yesterday midnight night till next 24hr i.e  24*60 = 1440min total minutes
//    for (nextTimeFrame in 0L..(1440L - timeSliceChosen) step timeSliceChosen) {
//
//    }
}
