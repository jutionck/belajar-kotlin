package pertemuandua

fun main() {
    var odetto = Hero("Odette", 100, 20)
    var johson = Hero("Johsnon", 200, 10)

    johson.attack(odetto)
}

class Hero (var name:String, var hp:Int, var damage:Int) {

    fun attack(enemy: Hero) {
        println("${this.name} attack ${enemy.name}")
        enemy.receiveDamage(this)
    }

    fun receiveDamage(striker: Hero) {
        println("${this.name} receive damage from ${striker.name}")
    }
}