package org.techtown.homework1

fun main() {
    val some = {no1: Int, no2: Int ->
        println("in lamda function")
        no1 * no2
    }
    println("result : ${some(10, 20)}")

}