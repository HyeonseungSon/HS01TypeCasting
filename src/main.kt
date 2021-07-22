fun main() {

    val a1 = "감사합니다."

    // val chk1 = a1 is Int // 오류 발생
    val chk2 = a1 is String

    // println("chk1 : $chk1")
    println("chk2 : $chk2") // chk2 : true
    println("a1 : $a1") // a1 : 감사합니다.

    val a2:SuperClass1 = SuperClass1() // 부모 Class
    val a3:SubClass2 = SubClass2() // 자식 Class

    a2.superMethod1()
    a3.superMethod1()
    a3.subMethod2()

    val chk3 = a2 is SubClass2 // 부모 Class 를 자식 Class Type 으로 변경 => 불가능
    val chk4 = a3 is SuperClass1 // 자식 Class 를 부모 Class Type 으로 변경 => 가능

    println("chk3 : $chk3") /* chk3 : false
                => 부모 Class 를 자식 Class 형으로 형변환 할 수 없다. */
    println("chk4 : $chk4") /* chk4 : true
                => 자식 Class 를 부모 Class 형으로 형변환할 수 있다. */

    a2.superMethod1()
    a3.superMethod1()
    a3.subMethod2()

    println("------------------------------")

    // 아래 if 문은 false 이기 때문에 실행되지 않습니다.
    if (a2 is SubClass2) {
        a2.superMethod1()
        a2.subMethod2()
    } else {
        println("if (a2 is SubClass2) 은 실행되지 않습니다.")
    }

    println("------------------------------")

    if (a3 is SuperClass1) {
        a3.superMethod1()
        a3.subMethod2()
    }
}


open class SuperClass1 () {
    fun superMethod1() {
        println("SuperClass1 - superMethod1")
    }
}

class SubClass2 : SuperClass1 () {
    fun subMethod2 () {
        println("SubClass2 - subMethod2")
    }
}