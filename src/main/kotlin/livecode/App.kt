package livecode

fun main(){

    val dataAntenna= mutableListOf<Area>()
    val area = Area()
    print(">Input jumlah antenna: ")
    val inputJumlahAntenna = readLine()!!
    for (i in 1..inputJumlahAntenna.toInt()) {
        print("Koordinat antenna ke $i: ")
        val inputKoordinat = readLine()!!
        val antenna = area.antennaPosition(inputKoordinat.split(",").toTypedArray())
        dataAntenna.add(antenna)
    }

    if (inputJumlahAntenna.toInt() > 1) {
        print("Area yang dicover lebih dari 1 antenna: ")
        area.coverArea(dataAntenna)
    } else {
        area.coverArea(dataAntenna)
    }

}




