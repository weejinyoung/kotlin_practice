package practice.kotlin_practice

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class KotlinTest {

    @Test
    fun testKotlin() {
        val a: Int = 1;
        println(a);
    }

    @Test
    fun testKotlin2() {
        var a: Int = 3;
        a = 234
        println(a);
    }

    @Test
    fun testKotlin3() {
        var a: Int? = 3;
        a = null
    }

}