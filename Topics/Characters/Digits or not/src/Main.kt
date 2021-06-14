fun main() {
    val characters = arrayOfNulls<Char>(4)

    for (i in characters.indices) {
        characters[i] = readLine()!!.first()
    }

    for (character in characters) {
        println(character?.isDigit())
    }
}