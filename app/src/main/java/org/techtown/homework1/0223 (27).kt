package org.techtown.homework1

open class Juice {
    open var data = 10
    open fun some() {
        println("i am super some() : $data")
    }
}
val obj = object: Juice() {
    override var data = 20
    override fun some() {
        println("i am object some() : $data")
    }
}
fun main() {
    obj.data = 30
    obj.some()
}