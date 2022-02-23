package org.techtown.homework1

class Holy {
    constructor(name: String) {
        println("constructor(name: String) call...")
    }
    constructor(name: String, count:Int) {
        println("constructor(name: String, count: Int) call...")
    }
}
fun main() {
    val user1 = Holy("kkang")
    val user2 = Holy("kkang , 10")
}