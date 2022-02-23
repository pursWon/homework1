package org.techtown.homework1

fun some(data: String?): Int {
    return data!!.length
}
fun main() {
    println(some("kkang"))
    println(some(null))
}