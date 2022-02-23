package org.techtown.homework1

class spam {
 companion object { //클래스 내부에 companion object 형태로 선언하면 이 클래스를 감싸는 이름으로 멤버에 접근할 수 있다
     var data = 10
     fun some() {
         println(data)
     }
 } 
     
}
fun main() {
   spam.data = 40 
   spam.some( )


}