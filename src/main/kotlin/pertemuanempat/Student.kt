package pertemuanempat

class Student(val name: String, val age:Int, val gender:String) {

    override fun toString(): String {
        return "Student(name='$name', age=$age, gender='$gender')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Student

        if (name != other.name) return false
        if (age != other.age) return false
        if (gender != other.gender) return false

        return true
    }


}