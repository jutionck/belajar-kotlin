package pertemuanempat

fun main() {

    val direction = Direction()
    println(direction.turnLeft("EAST"))
    println(direction.turnLeft("NORTH"))
    println(direction.turnRight("WEST"))
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