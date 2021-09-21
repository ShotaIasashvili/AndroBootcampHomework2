package com.example.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

//დავალება 1
fun main(){
    val list = listOf('a', 'A', 'b', 'B', 'A', 'a')
    println(list.distinct()) // [a, A, b, B]
    println(list.distinctBy { it.uppercaseChar() }) // [a, b]
}

import java.util.*

fun main(args: Array) {
    //1
    val firstArray = arrayOf(1,2,3,4,5)
    val secondArray = arrayOf(2,3,1,7,8,9)

    //2
    println(Arrays.toString(firstArray))
    println(Arrays.toString(secondArray))

    //3
    val iArray = firstArray.intersect(secondArray.toList()).toIntArray()

    //4
    println(Arrays.toString(iArray))
}

// დავალება 3

fun main(args: Array<String>) {

    val first: Int = 30
    val second: Int = 20

    val sum = first + second

    println("გაერთიანება $first$second")
}

// დავალება 4

fun main(args: Array<String>) {
    val numArray = doubleArrayOf(45.3, 67.5, -45.6, 20.34, 33.0, 45.6)
    var sum = 0.0

    for (num in numArray) {
        sum += num
    }

    val average = sum / numArray.size
    println("საშუალო არის  %.2f".format(average))
}


//დავალება 5


fun main() {

    val arrayname = Array(5, { i -> i * 1 })
    for (i in 0..arrayname.size-1)
    {



        val nums = intArrayOf(Arrays.asList(arrayname.))

        val maxValue = nums.maxOrNull ()
        println("The maximum is $maxValue")

        val minValue = nums.minOrNull()
        println("The minimum is $minValue")
    }
}
