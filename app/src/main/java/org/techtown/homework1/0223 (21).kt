package org.techtown.homework1

class Ace(val name: String, val count: Int) {
    fun someFun() {
        println("name : $name, count : $count")
    }
}
fun main() {
    val ace = Ace("kkang", 10)
    ace.someFun()
}


