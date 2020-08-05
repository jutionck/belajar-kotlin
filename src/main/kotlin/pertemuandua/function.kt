package pertemuandua

fun main() {
    var x = 4
    var y = 5
//    x = increase(x)
//    cetak(x)
//    print("Hasil Penjumalahn $x + $y = ")
//    println(sum(x,y)) //nilai x dan y di copy valuenya kedalam fun sum, tipe data primitive
//    print("Hasil Penjumalahn $x + 11 = ")
//    println(sum(x))

    //cara lain nih
    val z = sum(b=x, a=y, c=13)
    println(z)
}

//fun sum(x: Int, y: Int = 11): Int{
//    return x+y
//}

fun sum(a:Int, b:Int, c:Int, d:Int=0): Int {
    println("a=$a")
    println("b=$b")
    println("c=$c")
    println("d=$d")
    return a+b
}

//function yang mempunyai nilai kembali (return)
fun increase(a: Int): Int {
    return a+1
}

//function yang tidak mengembalikan nilai (Unit || Void-java)
fun cetak(number: Int) {
    print("Cetak $number")
}