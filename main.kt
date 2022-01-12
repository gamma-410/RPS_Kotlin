fun main() {
    println("ゲームを開始します。(開始: s) (終了: e)")
    val text = readLine()
    when (text) {
        "s" -> {
            start()
        }
        "e" -> {
            return
        }
        else -> {
            println("💡: (開始: s) (終了: e) から選択してください...")
            return main()
        }
    }
}

fun start() {
    println("== ✊(r) ✋(p) ✌️(s) から選択 (終了: e) ==")
    val user_answer_before = readLine()

    when (user_answer_before) {
        "r" -> {
            val user_answer_after = user_answer_before.replace("r", "✊")
            println("You: ${user_answer_after} (Rock)")
        }
        "p" -> {
            val user_answer_after = user_answer_before.replace("p", "🖐")
            println("You: ${user_answer_after} (Paper)")
        }
        "s" -> {
            val user_answer_after = user_answer_before.replace("s", "✌️")
            println("You: ${user_answer_after} (Scissors)")
        }
        "e" -> {
            println("プログラムを終了しました。")
            return
        }
        else -> {
            println("\n💡: ✊(r) ✋(p) ✌️(s) の中から選択してください...\n")
            return start()
        }
    }

    return start()
}
