package pertemuansatu //remove

fun main() {
    println("[CHALLENGE - 8.1] Cut The Bamboo\n Jution Candra Kirana")
    println()
    print("Input Jumlah Bamboo: ")
    val jmlBamboo = readLine()
    var dataBamboo: Array<Int> = arrayOf()
    for(i in 1..jmlBamboo?.toInt()!!) {
        print("Panjang bamboo ke $i : ")
        val indexOfBamboo = readLine()!!.toInt()
        dataBamboo += indexOfBamboo
    }

    print("Jumlah cycle: ")
    var jumCycle = readLine()!!.toInt()
    for(item in 0..jumCycle) {
        var printResult = if ("Cycle ke $item: " == "Cycle ke 0: ") ">Initial :" else ">Cycle ke $item: "
        println(printResult)
        for(item2 in dataBamboo.indices) {
            for (item3 in 1..dataBamboo[item2]!!) print("- ")
            dataBamboo[item2] = dataBamboo[item2]?.minus(1)
            println()
        }
    }
}