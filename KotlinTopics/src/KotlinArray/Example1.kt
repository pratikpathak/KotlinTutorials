package KotlinArray

/*
* We can use the library function arrayOf()
* to create an array by passing the values of
* the elements to the function.
*/

class Example1 {}

fun main() {
    val number1 = arrayOf(1,2,3,4,5)
    val number2 = arrayOf<Int>(1,2)

    for (i in number1.indices) {
        println(number1[i])
    }

    for (i in number2.indices) {
        println(number2[i])
    }
}