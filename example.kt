@file:JvmName("B4AKotlin")

package demo
import java.util.Random;
class b4akotlin
val random = Random()

fun rand(from: Int, to: Int) : Int {
    return random.nextInt(to - from) + from
}

fun sum(a: IntArray): Int {
	    var result=0
	      for (number in a)
	    	result += number
	    return result
	}
	
fun main(args: Array<String>) {
    println("Hello World!")
}

fun findPairless(a: IntArray) = a.fold(0, {accum, x -> accum xor x})
