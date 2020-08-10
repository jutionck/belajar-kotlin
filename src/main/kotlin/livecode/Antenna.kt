package livecode


class Antenna(private val x: Int = 0, private val y: Int=0) {

    fun coverage(x:Int, y:Int):MutableSet<Antenna>{
        var x = x-1
        var y = y+1
        val coverage = mutableSetOf<Antenna>()
        for(i in 1..3){
            for (j in 1..3){
                coverage.add(Antenna(x,y))
                x+=1
            }
            x-=3
            y-=1
        }
        return coverage
    }

    override fun toString(): String {
        return "($x, $y)"
    }
}
