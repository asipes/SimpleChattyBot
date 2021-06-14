fun main() {
    val words: Array<String?> = arrayOfNulls<String>(5)

    for (i in words.indices) {
        words[i] = readLine()
    }

    for (item in words) {
        print("$item ")
    }
}