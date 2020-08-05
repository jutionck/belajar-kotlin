package pertemuandua

fun main() {
    var captainAmerica = Hero("Captain America", 100, 20)
    var ironMan = Hero("Iron Man", 200, 15)

    ironMan.attack(captainAmerica)

    println(ironMan.getInfo())
    println(captainAmerica.getInfo())
}

class Hero (var name:String, var hp:Int, var damage:Int) {

    fun attack(enemy: Hero) {
        enemy.receiveDamage(this)
    }

    fun receiveDamage(striker: Hero) {
        this.hp = this.hp - striker.damage
//        println("${this.name} receive damage from ${striker.name}")
    }

    fun getInfo(): String {
        return "Hero(name='$name', hp=$hp, damagae=$damage)"
    }
}