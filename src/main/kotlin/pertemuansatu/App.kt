package pertemuansatu

fun main() {

    //mutable variable: bisa di assign ulang
    // inferred type (definisi tipe data yang diketahui setalah di assign (post assign))
    var nama = "Jution Candra Kirana"
    println(nama)
    nama = "Jution"
    println(nama)


    //imutable variable: tidak bisa reassign ulang
    val nama2: String = "Jution"
    print(nama2)
}