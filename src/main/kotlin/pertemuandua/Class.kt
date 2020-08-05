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

//hasilnya
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