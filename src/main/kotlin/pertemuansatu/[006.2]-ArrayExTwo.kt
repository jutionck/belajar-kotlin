package pertemuansatu

fun main() {
//    var numbers: Array<Int> = arrayOf(9,2,2,3,3)

    //forEach, bisa menampilkan perulangan juga
    //bedanya sama for, foreach itu udah jelas untuk tiap element,
    //tapi foreach tidak merubah apapun si element aslinya
//    numbers.forEach { element -> println(element+1) }
//
//    //joinToString, juga bisa untuk menampilkan perulangan juga
//    println(numbers.joinToString())

    //addition two array
    var numbers = arrayOf(9,5,3,2)
    var numbers2 = arrayOf(77,99,11)

    //beda isi array tidak bisa di gabung
//    var allOfThem = numbers+numbers2

    //harus gini
    var allOfThem = numbers+numbers2
    println(allOfThem.joinToString())
}