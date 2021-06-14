import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val words: Array<String?> = arrayOfNulls(5)
    words[0] = scanner.next()
    words[1] = scanner.next()
    words[2] = scanner.next()
    words[3] = scanner.next()
    words[4] = scanner.next()

    for (word in words) {
        println(word)
    }

}