fun main() {
    val cup = readLine()!!.toInt()
    val weekend = readLine().toBoolean()

    print(cup in 10..20 && !weekend || cup in 15..25 && weekend)
}