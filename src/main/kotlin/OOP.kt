//data disini langsung print value nya
//data class Kucing(
//        var color: String = "",
//        var height: Double = 0.0,
//        var length: Double = 0.0,
//        var weight: Double = 0.0
//)

//class Kucing (
//        var color: String,
//        var height: Double,
//        var length: Double,
//        var weight: Double
//) {
//
//    fun purring() {
//        println("Meow ..")
//    }
//
//    fun eat() {
//        println("Kasih makan...")
//        weight = weight + 1
//    }
//}

//fun main() {
//    val persian = Kucing("coklat", 22.0, 39.0,2.3)
//    persian.purring()
//    println("Kucing Persian mempunyai warna ${persian.color} dengan tinggi ${persian.height} panjang ${persian.length} dan berat ${persian.weight}")
//
//    //makan
//    persian.eat()
//    println("Kucing Persian mempunyai warna ${persian.color} dengan tinggi ${persian.height} panjang ${persian.length} dan berat ${persian.weight}")
//
////    persian.color = "Putih"
////    persian.height = 24.0
////    persian.length = 46.0
////    persian.weight = 2.0
////    val bengal = Kucing("Coklat", 22.0, 39.0, 2.3)
////    val anggora = Kucing("Abu-abu", 25.0, 41.0, 2.4)
////    println(bengal)
////    println(anggora)
//}

//Inheritance
//1. Single Inheritance
//Yang pertama adalah cara terumum yang mana class yang dibuat hanya mewarisi satu class.
//Contohnya adalah seperti berikut:
//open class Animal {
//    open fun walk() {
//        println("${javaClass.simpleName} walk!")
//    }
//}
//
//class Cat : Animal(){
//    override fun walk() {
//        println("Yeay! ${javaClass.simpleName} walked!")
//    }
//}

//2. Multilevel Inheritance
//Lanjut dengan multilevel inheritance. Cara ini mengacu pada mekanisme OOP, di mana SubClass dapat mewarisi SuperClass yang di mana merupakan sebuah SubClass dari SuperClass lain.
//Contohnya seperti kode di bawah ini:
//open class Animal{
//    fun walk(){
//        println("${javaClass.simpleName} walk!")
//    }
//}
//
//open class Carnivore: Animal(){
//    fun eat(){
//        println("${javaClass.simpleName} eat!")
//    }
//}
//
//class Cat: Carnivore()

//3. Multiple Inheritance
//Sama seperti sebelumnya, multiple inheritance mengacu pada konsep OOP di mana sebuah class
//dapat mewarisi lebih dari satu SuperClass.
//Namun perlu diketahui bahwa beberapa bahasa pemrograman seperti Java tidak mendukungnya secara penuh,
//dengan alasan suatu SubClass harus bisa mengatur ketergantungan dari 2 (dua) SuperClass-nya.
//Tapi jika ingin menerapkannya, kita dapat memanfaatkan interfaces seperti berikut:
//interface Ovipar
//
//interface Vivipar
//
//interface Ovovivipar: Ovipar, Vivipar
//
//class Snake: Ovovivipar
//Multiple inheritance sendiri sangat jarang digunakan dalam pengembangan perangkat lunak
//karena sering menyebabkan permasalahan, terutama pada hirarki class yang berpotensi
//menyebabkan terjadinya kompleksitas tinggi. Worst case scenario-nya,
//permasalahan ini malah menghambat pengembangan.

//4. Hierarchical Inheritance
//Sama seperti penerapan inheritance pada umumnya, jenis ini merupakan sebuah SuperClass yang
// diwarisi oleh beberapa SubClass. Misalnya seperti berikut:
//open class Animal{
//    fun walk(){
//        println("${javaClass.simpleName} walk!")
//    }
//}
//
//open class Carnivore: Animal(){
//    fun eat(){
//        println("${javaClass.simpleName} eat!")
//    }
//}
//
//class Cat: Carnivore()
//
//class Lion: Carnivore()
//
//class Dog: Carnivore()

//ENCAPSULATION
//Encapsulation merupakan proses di mana sebuah penanganan data ditempatkan di dalam wadah tunggal
// yang disebut sebagai class. Saat menggunakan encapsulation, data dapat diisolasi dan tidak dapat
// diakses langsung dari luar. Dengan begini, kita cukup menggunakan data tersebut tanpa harus tahu
// bagaimana proses yang terjadi sampai data tersebut bisa digunakan.

//Dalam dunia nyata, encapsulation bisa digambarkan seperti smartphone.
//Saat menggunakan smartphone kita tidak perlu tahu bagaimana proses yang berjalan di belakang,
//seperti  menampilkan sesuatu pada layar, menyediakan jaringan seluler, dan lain sebagainya.
// Kita cukup menggunakannya sebagaimana mestinya sebuah telepon genggam.
// Seperti itulah encapsulation bekerja.
//class DataRepository {
//    private val data = mutableListOf<Any>()
//
//    fun setData(){
//        val response = /* tons of logical code to retrieve data */
//                data.clear()
//        data.putAll(response.data)
//    }
//
//    fun getData() = data
//}

//ABSTRACTION
//Kita lanjut. Seperti judulnya, kita akan membahas tentang apa itu abstraction.
//Abstraction adalah mekanisme saat proses dalam sebuah objek disembunyikan.
//Object tersebut hanya akan menyediakan apa yang benar-benar perlu digunakan..

//Definisi di atas terlihat mirip seperti Encapsulation. Lantas di mana bedanya?
//Saat menerapkan abstraction, kita cukup fokus pada apa yang dilakukan suatu objek tanpa harus tahu
//bagaimana itu dilakukan. Sedangkan encapsulation adalah bagaimana ia menyembunyikan mekanisme suatu objek
//ketika melakukan sesuatu.
//Jika Encapsulation menyembunyikan data dengan menyediakan getter setter untuk mengaksesnya,
//maka abstraction menyembunyikan sebuah implementasi dengan memanfaatkan abstract class, interface, dan lain sebagainya.
//abstract class Person(name: String) {
//
//    init {
//        println("My name is $name.")
//    }
//
//    fun displaySSN(ssn: Int) {
//        println("My SSN is $ssn.")
//    }
//
//    abstract fun displayJob(description: String)
//}
//
////Person jadi contructor dari abstract kelas Person
//class Teacher(name: String): Person(name) {
//
//     override fun displayJob(description: String) {
//        println(description)
//    }
//}
//
//fun main() {
//    val jack = Teacher("Jack Smith")
//    jack.displayJob("I'm a mathematics teacher.")
//    jack.displaySSN(23123)
//}

//polymorphism
//Polymorphism merupakan kemampuan objek, variabel, atau fungsi yang dapat memiliki berbagai bentuk.
//Secara umum polymorphism dalam OOP terjadi ketika suatu SuperClass direferensikan ke dalam SubClass.
//Alhasil kita dapat mengembangkan sebuah program secara umum, bukan spesifik.
//
//Polymorphism dapat digambarkan seperti seorang yang menguasai dan mampu berbicara dalam beberapa bahasa.
//Nah di sini, seseorang yang bertindak sebagai obyek dan kemampuan dia berbicara merupakan sebuah Polymorphism.
//Contoh lainnya adalah smartphone. Selain sebagai alat komunikasi, smartphone yang bertindak
//sebagai objek dapat digunakan sebagai kamera, pemutar musik dan radio.
//
//Di bagi 2:
//1. Compile time polymorphism
//Compile time polymorphism adalah sebuah proses di mana sebuah method atau fungsi dipanggil saat kompilasi.
//Ini dapat terjadi karena sebuah konsep bernama method overloading. Method overloading merupakan
//kondisi di mana kita bisa membuat 2 (dua) atau lebih fungsi yang memiliki jumlah, tipe, dan urutan parameter
//yang berbeda di dalam sebuah class.
//open class Arithmetic {
//    open fun add(valueA: Int, valueB: Int) = valueA + valueB
//    open fun add(valueA: Long, valueB: Long) = valueA + valueB
//    open fun add(valueA: Int, valueB: Long) = valueA + valueB
//    open fun add(valueA: Long, valueB: Int) = valueA + valueB
//}
//
//class Add: Arithmetic(){
//    override fun add(valueA: Int, valueB: Int): Int {
//        println("Calculate!")
//        return super.add(valueA, valueB)
//    }
//}
//
//fun main() {
//    var addition = Add()
//    println(addition.add(2, 3))
//}

//2. Runtime Poly
fun main() {
    val cat = Cat()
    cat.walk()
}

//superClass
open class Animal {
    open fun walk() {
        println("${javaClass.simpleName} walk!")
    }
}

//subClass
class Cat : Animal(){
    override fun walk() {
        super.walk()
        println("Yeay! ${javaClass.simpleName} walked!")
    }
}