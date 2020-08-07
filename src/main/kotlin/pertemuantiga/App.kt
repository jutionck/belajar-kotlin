package pertemuantiga


fun main(){
    val rectangle = Rectangles(7.0, 8.0)
    val circle = Circles(7.0, 8.0)
    val square = Square(7.0)

//    println(rectangle.getArea())
    val shapes : Array<AbstractClass> = arrayOf(rectangle, circle, square)
////    printInfo(rectangle)
//
    sumArea(shapes)
}
//mencari total seluruh luas bangunData
fun sumArea(shapes: Array<AbstractClass>) {
    var tot = 0.0
    for(i in shapes) {
        println(" Area: ${i.getArea()}")
        tot += i.getArea()
    }
    println("Total Area: $tot")
}



//
//fun printInfo(abstractClass: AbstractClass) {
//    println("----- Polymorphism -----")
//    println("Area: ${abstractClass.getArea()}")
//    println("Circumference : ${abstractClass.getCircumference()}")
//}