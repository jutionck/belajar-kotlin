package pertemuanempat

fun main() {

    val direction = Direction()
    println(direction.turnLeft("EAST")) //output: NORTH
    println(direction.turnLeft("NORTH")) //output: WEST
    println(direction.turnRight("WEST")) //output: NORTH
}

class Direction {
    val directions = arrayOf("NORTH", "EAST", "SOUTH", "WEST")

    fun turnRight(position: String): String{
        val find = (directions.indexOf(position) + 1)  % 4
        return directions[find]
    }

    fun turnLeft(position: String): String{
        val find = (directions.indexOf(position) + 3)  % 4
        return directions[find]
    }
}