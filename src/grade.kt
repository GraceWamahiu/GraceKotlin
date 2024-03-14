import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    print("Enter mark score: ")
    val marks = input.nextInt()

    when(marks) {
        in 80..100 -> println("Grade is: A")
        in 65..79 -> println("Grade is: B")
        in 40..59 -> println("Grade is: C")
        in 20..39 -> println("Grade is: D")
        in 0..19 -> println("Grade is: E")
        else -> println("Invalid mark")
    }

    }