package pertemuanempat

fun main() {

    val integerSet = setOf(1, 7, 2, 4, 2, 1, 5)

    println("A: $integerSet")
    // Output: [1, 2, 4, 5]

    val setA = setOf(1, 2, 4, 2, 1, 5)
//    val setB = setOf(1, 2, 4, 5)
//
//    println(setA == setB)
//    // Output: true

//    print(5 in setA)
//    // Output: true

    val setC = setOf(1, 5, 7)
    println("C: $setC")
    val union = setA.union(setC) //gabungin
    val intersect = setA.intersect(setC) //irisan
    val complement = setA.subtract(setC) //comploment

    println("UNION: $union")
    // union: [1, 2, 4, 5, 7]
    println("INTERSECT: $intersect")
    // intersect: [1, 5]
    println("COMPLEMEMT: $complement")
    //comploment: [2, 4]

    //integerSet.add(6) // tidak bisa mengubah set immutable
    //mutableSet.add(6) // menambah item di akhir set
    //mutableSet.remove(1) //menghapus item yang memiliki nilai 1
}