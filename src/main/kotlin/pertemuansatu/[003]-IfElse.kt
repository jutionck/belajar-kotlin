package pertemuansatu

fun main() {

    print("Input Waktu Pengumpulan: ")
    val inputText = readLine()
    val submission = inputText?.toInt() //bisa ganti !! di tanda tanya supaya gak error

    val result = if(submission in 8..17) "PASS" else "LATE"
    print(result)

}