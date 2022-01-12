
fun main() {
    println("== ✊(r) ✋(p) ✌️(s) から選択 (終了: e) ==")
    val user_answer_before = readLine()

    when (user_answer_before) {
        "r" -> {
            val user_answer_after = user_answer_before.replace("r", "✊")
            print("You: ${user_answer_after} (Rock)")
        }
        "p" -> {
            val user_answer_after = user_answer_before.replace("p", "🖐")
            print("You: ${user_answer_after} (Paper)")
        }
        "s" -> {
            val user_answer_after = user_answer_before.replace("s", "✌️")
            print("You: ${user_answer_after} (Scissors)")
        }
        "e" -> {
            println("プログラムを終了しました。")
        }
        else -> {
            println("💡: ✊(r) ✋(p) ✌️(s) の中から選択してください...")
            return main()
        }
    }
}
