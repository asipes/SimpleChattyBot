import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var max = Int.MIN_VALUE
    var count = 1
    var position = 1

    while (scanner.hasNext()) {
        val next = scanner.nextInt()
        if (next > max) {
            max = next
            position = count
        }
        count++
    }

    println("$max $position")
}