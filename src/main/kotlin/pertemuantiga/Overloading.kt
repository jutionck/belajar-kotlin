package pertemuantiga

import kotlin.math.pow

class Circle(var radius: Double) {

    fun getArea(pi: Double): Double {
        return pi*radius.pow(2)
    }

    fun getArea(): Double {
        return radius.pow(2)*22/7
    }
}

fun main() {
    val circle = Circle(7.0)
    println("Area dengan phi ditentukan: ${circle.getArea(3.14)}")
    println("Area dengan phi 22/7: ${circle.getArea()}")
}

/*
overriding: memperbaharui isi method parent
overloading: membuat method nama sama dengan parameter yg berbeda
supaya seolah" kita punya method yg dinamis
 */