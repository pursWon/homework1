package org.techtown.homework1

fun hotFun(arg: (Int) -> Boolean) : () -> String {
    val result = if (arg(10)) {
        "valid"
    } else {
        "invalid"
    }
    return { "hotFun result : $result" }
}

fun main() {
    val result = hotFun({no -> no > 0})
    println(result())
}