package pertemuandua

fun main() {
    val myBlueRush = Car()
    //kita pindahkan menjadi function
    //intance class
    myBlueRush.color = "Blue"
    myBlueRush.name = "Rush"
    myBlueRush.brand = "Toyota"

    var myRedFerrariEnzo = Car()
    //intance class
    myRedFerrariEnzo.color = "Red"
    myRedFerrariEnzo.name = "Ferrari"
    myRedFerrariEnzo.brand = "Enzo"

    //Print Result
    printInfo(myBlueRush)
    printInfo(myRedFerrariEnzo)

    //copy alamat memori
    val someOneCar = myRedFerrariEnzo
    printInfo(someOneCar)

    //ubah nilai color nya
    someOneCar.color = "Yellow"
    printInfo(someOneCar) //isinya ikut berubah yang aslinya karena alamat memori sama
}

//hasilnya yang udah di jadiin function
private fun printInfo(myCar: Car) {
    println(myCar)
    myCar.color
    println("MyBlueCar is a ${myCar.brand} ${myCar.color}, with color ${myCar.color}")
}

class Car {
    var color: String = ""
    var name: String = ""
    var brand: String = ""
}


// Catatan:
// kalau primitive data type/ variable biasa itu passing value nya
// myFerrari -> myCar@8efb846 <- someoneCar = myFerrari
// myCar@8efb846 -> color
//               -> name
//               -> brand
// kalau object yang dipassing reference alamat memory nya