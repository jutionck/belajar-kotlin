package pertemuantiga

class Robot(sumbuX: Int = 0, sumbuY: Int = 0) {
    var sumbuX: Int = sumbuX
        private set
    var sumbuY: Int = sumbuY
        private set//

    fun forwardMove(): Int {
        return sumbuY++
    }

    fun backwarddMove(): Int {
        return sumbuY--
    }

    fun rightMove(): Int {
        return sumbuX++
    }

    fun leftMove(): Int {
        return sumbuX--
    }

    fun moving() {
        println("F: Forwaard || B: Backward || R: Right || L: Left")
        print(">Input perintah: ")
        var inputPerintah = readLine()
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
                        backwarddMove()
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
