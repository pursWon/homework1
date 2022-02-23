package org.techtown.homework1

val obj = object {
    var data = 10
    fun some() {
        println("data : $data")
    }
}
fun main() {
    obj.data  = 20
    obj.some() // object 키워드로 클래스를 선언했지만 타입을 명시하지 않았으므로 이 객체는 코틀린의 최상위 타입인 Any로 취급하며
    // data, some()이라는 멤버가 없어서 오류가 발생
}