package org.techtown.homework1

open class Sun {
    open var someData = 10
    open fun someFun() {
        println("i am super class function : $someData")
    }
}
class Sub: Sun() { // sub부분이 왜 오류가 나는지 모르겠습니다
    override var someData = 20
    override fun someFun() {
        println("i am sub class function : $someData")
    }
}
fun main() {
    val obj = Sub()
    obj.someFun() // someFun부분이 왜 오류가 나는지 모르겠습니다
}