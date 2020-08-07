package pertemuanempat

fun main() {

    val maul = Student("Maulana", 22, "M")

    val studentList = mutableListOf<Student>()

    studentList.add(maul)

    println(studentList.joinToString())

    val wanted = Student("Maulana", 22, "M")
    println(maul == wanted)
}