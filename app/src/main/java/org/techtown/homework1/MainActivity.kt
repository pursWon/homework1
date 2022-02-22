package org.techtown.homework1 /// package

import java.util.* // (date: Date) ???
import java.text.SimpleDateFormat

var data = 10 ///

fun formatData(date: Date): String {
    val sdformat = SimpleDateFormat("1995-09-04")
    return sdformat.format(date)
}
class User {
    var name = "hello"

    fun sayHello() {
        println("name : $name")
    }
}