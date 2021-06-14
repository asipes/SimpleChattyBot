import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numbers: Array<Int?> = arrayOfNulls(6)
    for (i in numbers.indices) {
        numbers[i] = scanner.nextInt()
    }

    println("${numbers[0]}:${numbers[1]}:${numbers[2]} ${numbers[3]}/${numbers[4]}/${numbers[5]}")
}