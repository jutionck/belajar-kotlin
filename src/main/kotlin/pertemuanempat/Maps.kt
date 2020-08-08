package pertemuanempat

fun main() {

    val pairs = mutableMapOf<Int, String>()

    pairs.put(1, "Januari")
    pairs.put(2, "Februari")
    pairs.put(3, "Maret")
    pairs.put(4, "April")
    pairs.put(5, "Mei")
    pairs.put(6, "Juni")
    pairs.put(7, "Juli")

    pairs.put(1, "Agustus")

    for (pair in pairs) {
        println("${pair.key}, ${pair.value}")
    }

    println(pairs.get(4))
}