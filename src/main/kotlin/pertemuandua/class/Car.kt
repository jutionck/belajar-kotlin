package pertemuandua.`class`

class Car(color: String, name: String, brand: String) {

    var color:String = color
    var name:String = name
    var brand:String = brand

    var fuel:Int = 0
        private set
    var engineStatus = "OFF"
        private set

    fun startEngine(){

        if(fuel>0) {
            println("Engine starting...")
            engineStatus = "ON"
            println("Engine status: $engineStatus")
        } else {
            println("Engine fail to start")
            return
        }
    }

    fun addFuel(fuel:Int) {
        this.fuel.plus(fuel)
    }

    fun getInfo(): String{
        return "The car is ${this.brand} ${this.name}, " +
                "with color ${this.color} Engine Status = ${this.engineStatus}, fuel=${this.fuel} "
    }
}