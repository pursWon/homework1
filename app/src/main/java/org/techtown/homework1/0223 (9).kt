package org.techtown.homework1

fun main() {

fun some(data1: Int, data2: Int = 10): Int {
    return data1 * data2
}
    println(some(10))
    println(some(10, 20))
}

