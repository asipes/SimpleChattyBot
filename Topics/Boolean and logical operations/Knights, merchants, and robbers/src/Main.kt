fun main() {
    val answers: Array<Boolean?> = arrayOfNulls<Boolean>(3)
    for (i in answers.indices) {
        answers[i] = readLine().toBoolean()
    }

    println(answers[0] == answers[1] && answers[2] == false)
}