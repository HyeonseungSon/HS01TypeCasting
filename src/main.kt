fun main() {
    val a1 = "감사합니다."


    // val chk1 = a1 is Int
    val chk2 = a1 is String

    // println("chk1 : $chk1")
    println("chk2 : $chk2")
    println("a1 : $a1")

    val a2:SuperClass1 = SuperClass1()
    val a3:SubClass2 = SubClass2()

    a2.superMethod1()
    a3.superMethod1()
    a3.subMethod2()

    val chk3 = a2 is SubClass2
    val chk4 = a3 is SuperClass1

    println("chk3 : $chk3") /* 결과값 : false
                => 부모 Class 를 자식 Class 형으로 형변환 할 수 없다. */

    println("chk4 : $chk4") /* 결과값 : true
                => 자식 Class 를 부모 Class 형으로 형변환할 수 있다.
                             */
    a2.superMethod1()
    a3.superMethod1()
    a3.subMethod2()

    if (a3 is SuperClass1) {
        a3.superMethod1()
        a3.subMethod2()
    }

    if (a2 is SubClass2) {
        a2.superMethod1()
        a2.subMethod2()
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