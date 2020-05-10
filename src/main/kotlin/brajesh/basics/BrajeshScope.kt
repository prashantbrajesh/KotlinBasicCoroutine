package brajesh.basics

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.asContextElement
import kotlin.coroutines.AbstractCoroutineContextElement
import kotlin.coroutines.CoroutineContext


//class BrajeshScope(override val coroutineContext: CoroutineContext,//                CoroutineName(coroutineContext.id) +
////                coroutineContext +
//                   override @property:Suppress("LeakingThis") val coroutineContext: CoroutineContext = Dispatchers.Default +
//                       SupervisorJob() +
////                CoroutineName(coroutineContext.id) +
////                coroutineContext +
//                       ctxTLS.asContextElement(ScopedElement(this))
//) : CoroutineScope{
//
//
//}
private val ctxTLS = ThreadLocal<ScopedElement>()
private data class ScopedElement(val scope: CoroutineScope): AbstractCoroutineContextElement(ScopedElement) {
    override fun toString(): String = "ScopedElement(${this.scope.hashCode()})"

    companion object Key : CoroutineContext.Key<ScopedElement>
}



class BrajeshContext(key: CoroutineContext.Key<*>) : AbstractCoroutineContextElement(key)
