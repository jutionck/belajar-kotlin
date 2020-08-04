package pertemuansatu

fun main() {
    var x: Any = 13

    when {
        x in 3..7 -> println("it's in 3 until 7")
        x is Int -> println("its a Int")
        x == 13 -> println("Lucky Number")
        else -> println(x)
    }
}