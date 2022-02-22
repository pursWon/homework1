package org.techtown.ch3

val data1: Int // 오류
val data2 = 10 // = 10이 초깃값 인가요?

fun someFun() {
    val data3: Int
    println("data3 : $data3") // 오류
    data3 = 10
    println("Data3: $data3")
}

class User {
    val data4: Int // 오류
    val data5: Int = 10
}