package pertemuanempat

data class Student(val name: String, val age:Int, val gender:String) {

    //cara manual euy
//    //override constructor, untuk mencetak value
//    override fun toString(): String {
//        return "name='$name', age=$age, gender='$gender'"
//    }
//
//    //override persamaan, perbandingan
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        //casting, si order ambil data dari class student
//        //S&K:
//        other as Student
//
//        if (name != other.name) return false
//        if (age != other.age) return false
//        if (gender != other.gender) return false
//
//        return true
//    }


}