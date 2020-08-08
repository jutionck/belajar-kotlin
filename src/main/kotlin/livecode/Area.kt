package livecode

class Area(x:Int = 0,y:Int = 0){

    private val antenna = Antenna()
    private val coverage = antenna.coverage(x,y)

    fun antennaPosition(AntennaPosition: Array<String>): Area {
        return Area(
                AntennaPosition[0].toInt(),
                AntennaPosition[1].toInt()
        )
    }

    fun coverArea(listAntenna: MutableList<Area>){

        val intersection: MutableSet<Antenna> = mutableSetOf()
        for (i in 0 until listAntenna.size){
            for (j in 0..i) {
                if (i == j) {
                    break
                } else {
                    intersection.plusAssign(listAntenna[i].coverage.intersect(listAntenna[j].coverage))
                }
            }
        }

        print(intersection.joinToString())
    }
}

