package pertemuantiga

import kotlin.math.pow

abstract class AbstractClass {

    abstract fun getCircumference(): Double

    abstract fun getArea(): Double
}


class Rectangles(var lenght:Double, var width: Double): AbstractClass() {

    override fun getCircumference(): Double {
        return 2*lenght+width
    }

    override fun getArea(): Double {
        return lenght*width
    }
}

class Circles(var radius: Double, val pi: Double = 3.14): AbstractClass() {

    override fun getCircumference(): Double {
        return 2*pi*radius
    }

    override fun getArea(): Double {
        return pi*radius.pow(2)
    }
}

class Square(var side: Double): AbstractClass() {
    override fun getCircumference(): Double {
        return side * 4
    }

    override fun getArea(): Double {
        return side.pow(2)
    }
}