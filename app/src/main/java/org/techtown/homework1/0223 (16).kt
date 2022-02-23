package org.techtown.homework1

fun main() {
    var data: Any = 10
    when (data) {
    is String -> println("data is String")
    40, 50 -> println("data is 40 or 50")
    in 1..10 -> println("data is 1..10")
    else -> println("data is not valid")

    }
}