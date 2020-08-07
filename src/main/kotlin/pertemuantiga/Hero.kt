package pertemuantiga

interface Hitable{
    fun receiveDamage(attackers: Attackers)
}

interface Attackers {
    val damage: Int
    fun attack(hitable: Hitable)
}

class Building(var hp: Int): Hitable{
    override fun receiveDamage(attackers: Attackers) {
        this.hp = this.hp-attackers.damage
    }
}

class Monster(var hp: Int, damage: Int): Hitable, Attackers {

    override var damage = damage

    override fun receiveDamage(attackers: Attackers) {
        this.hp = this.hp - attackers.damage
    }

    override fun attack(hitable: Hitable) {
        hitable.receiveDamage(this)
    }
}

class Hero(name: String, hp: Int, damage: Int): Hitable, Attackers {
    val name: String = name
    var hp: Int = hp
        private set
    override var damage:Int = damage

    override fun attack(hitable: Hitable) {
        hitable.receiveDamage(this)
    }

    override fun receiveDamage(attackers: Attackers) {
        this.hp = this.hp - attackers.damage
    }
}

fun main(){
    val captainAmerica = Hero("Captain America", 300, 35)

    val ironMan = Hero("Tony Stark", 300, 30)
    val tower = Building(1000)
    val kaiju = Monster(500, 15)

    captainAmerica.attack(ironMan)
    captainAmerica.attack(tower)
    captainAmerica.attack(kaiju)
}