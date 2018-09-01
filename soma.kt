fun main(args: Array<String>) {
   // println(soma(2,6))
   // println(div(2,4))
   // println(mult(3,5))
   // println(sub(5,3))
    println(foo(2,5))
}

fun soma(a: Int, b: Int): Int=
	a + b

fun div(a: Int, b: Int): Int=
	a / b

fun mult(a: Int, b: Int): Int=
	a * b

fun sub(a: Int, b: Int): Int=
	a - b

fun foo (num1: Int, num2: Int, num3: Int= 0): Int=
		num1 + num2 * num3