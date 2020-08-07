package pertemuantiga

class Robot(sumbuX: Int = 0, sumbuY: Int = 0) {
    var sumbuX: Int = sumbuX
        private set
    var sumbuY: Int = sumbuY
        private set

    fun moving() {
        println("F: Forwaard || B: Backward || R: Right || L: Left")
        print(">Input perintah: ")
        var inputPerintah = readLine()
        if (inputPerintah != null) {
            for(move in inputPerintah.toUpperCase()) {
                when (move) {
                    'F' -> {
                        sumbuY+=1
                        println(">$move-> ($sumbuX,$sumbuY)")
                    }
                    'L' -> {
                        sumbuX-=1
                        println(">$move-> ($sumbuX,$sumbuY)")
                    }
                    'R' -> {
                        sumbuX+=1
                        println(">$move-> ($sumbuX,$sumbuY)")
                    }
                    'B' -> {
                        sumbuY-=1
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

fun main() {

    var robot = Robot(2,3)
    robot.moving()


}