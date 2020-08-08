package pertemuantiga

class Robot(private var sumbuX: Int, private var sumbuY: Int) {

    private fun forwardMove(): Int {
        return sumbuY++
    }

    private fun backwardMove(): Int {
        return sumbuY--
    }

    private fun rightMove(): Int {
        return sumbuX++
    }

    private fun leftMove(): Int {
        return sumbuX--
    }

//    fun titikAwal()

    fun moving() {
        println("F: Forwaard || B: Backward || R: Right || L: Left")
        print(">Input perintah: ")
        val inputPerintah = readLine()
        if (inputPerintah != null) {
            for(move in inputPerintah.toUpperCase()) {
                when (move) {
                    'F' -> {
                        forwardMove()
                        println(">$move-> ($sumbuX,$sumbuY)")
                    }
                    'L' -> {
                        leftMove()
                        println(">$move-> ($sumbuX,$sumbuY)")
                    }
                    'R' -> {
                        rightMove()
                        println(">$move-> ($sumbuX,$sumbuY)")
                    }
                    'B' -> {
                        backwardMove()
                        println(">$move-> ($sumbuX,$sumbuY)")
                    }
                    else -> {
                        println("Gak ada pilihan")
                    }
                }
            }
        }
    }
}
