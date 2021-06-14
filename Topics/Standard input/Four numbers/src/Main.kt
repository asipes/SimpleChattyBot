import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val numbers: Array<Int?> = arrayOfNulls<Int>(4)
    for (i in numbers.indices) {
        numbers[i] = scanner.nextInt()
    }

    for (num in numbers) {
        println(num)
    }
}