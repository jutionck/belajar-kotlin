package pertemuanlima

fun main() {

    print(">Input jumlah antenna: ")
    val inputJumlahAntenna = readLine()!!

    var dataAntenna: List<String> = listOf()
    for (i in 1..inputJumlahAntenna.toInt()) {
        print("Koordinat antenna ke $i: ")
        val inputKoordinat = readLine()!!.split(",")
        dataAntenna = inputKoordinat
    }

    val axisX = dataAntenna[0].trim().toInt() - 1
    val axisY = dataAntenna[1].trim().toInt() - 1
    val area: MutableList<List<Int>> = mutableListOf()
//    val coverage: MutableList<MutableList<List<Int>>> = mutableListOf()
    for (sumbuX in axisX..axisX+2) {
        for (sumbuY in axisY..axisY+2) {
            val coordinate = listOf(sumbuX, sumbuY)
            area.add(coordinate)
        }
    }

    print(area)

//    var result:Set<List<Int>> = setOf()
//    for (i in 0 until coverage.size) {
//        for (j in i+1 until coverage.size) {
//            val temp = coverage[i].intersect(coverage[j])
//            result = result.plus(temp)
//        }
//    }
//
//    println("Area yang dicover lebih dari 1 antenna: $result")
//    println("Maka outputnya adalah $result")
}

private fun <E> MutableList<E>.add(element: List<Int>) {

}

