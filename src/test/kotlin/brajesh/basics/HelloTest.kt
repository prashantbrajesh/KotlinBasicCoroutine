package brajesh.basics

import kotlinx.coroutines.runBlocking
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class HelloTest {

    @Test
    fun `test my suspend function`() {
        val result = runBlocking {  testSuspend()}
        assertTrue ("Testing suspend function "){
            result !is Unit
        }
    }

    @Test
    fun `test my first fn`() {
        assertTrue ("calling function should return 22 returning ${testThis()}" ){
            22== testThis()
        }
    }

}

