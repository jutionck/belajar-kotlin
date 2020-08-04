package pertemuansatu

fun main() {
    print("Input nama: ")
    val name = readLine()
    println("Nama yang diinput $name")
    print("Input umur: ")
    val age = readLine()?.toInt()
    println(age?.minus(3))
}