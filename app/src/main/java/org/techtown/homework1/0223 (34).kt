package org.techtown.homework1

fun main() {
    var data: String? = "kkang"
    println("data = $data : ${data?.length ?: -1}")
    data = null
    println("data = $data : ${data?.length ?: -1}")
}