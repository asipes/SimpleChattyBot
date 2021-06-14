fun isVowel(letter: Char): Boolean {
    val array = charArrayOf('a', 'e', 'i', 'o', 'u')
    return array.contains(letter.toLowerCase())
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}