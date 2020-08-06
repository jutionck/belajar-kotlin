package pertemuandua.`class`

//fun main() {
////    var captainAmerica = Heroes("Captain America", 100, 20)
////    var ironMan = Heroes("Iron Man", 200, 15)
////
////    //mencoba set hp
////    println(captainAmerica.hp)
//////    captainAmerica.hp = 9999 //tidak akan bisa di set
////    println(captainAmerica.hp)
////    captainAmerica.damage = 100
////    println(captainAmerica.damage)
//
//    val mycar = Car("Brown", "HRV", "Honda")
//    mycar.startEngine()
//    mycar.addFuel(10)
//    mycar.startEngine()
//
//}

fun main(){
//    val field = Rectangle(4.0,3.0)
//    println(field.getInfo())
    val aquarium = Block(7.0)
    aquarium.lenght=7.0
    aquarium.width=4.0
    println(aquarium.getInfo())
    println(aquarium.lenght)
    println(aquarium.width)
}
open class Rectangle(var lenght:Double = 0.0, var width: Double = 0.0){
    fun getCircumference():Double{
        return 2*lenght+2*width
    }
    fun getArea(): Double{
        return lenght*width
    }

    fun getInfo(): String {
        return "Rectangle(lenght=$lenght, width=$width arround=${getCircumference()}, area=${getArea()})"
    }

}
class Block(var height: Double) :Rectangle(){
    fun panggilParent(){
        getInfo()
    }
}