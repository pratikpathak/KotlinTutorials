package ExceptionHandling

/*
1. Checked Exceptions - These are exceptions checked at compile time.
        The compiler requires us to handle them using try-catch blocks or
        declare them using throws. Examples: IOException,
        FileNotFoundException
2. Unchecked Exceptions - These are exceptions that occur at run-time,
        often due to logical errors in the program.
        They are not checked at compile time. Examples:
        NullPointerException, ArrayIndexOutOfBoundsException,
        ArithmeticException
*  This class is an example for Arithmetic Exception
* */
fun main(){

    try {
        val number = 10/0
       println(number)
    } catch (e: ArithmeticException) {
        println("devide by 0 is not allowed")
    } finally {
        println("Always execute")
    }
}