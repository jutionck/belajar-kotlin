package pertemuansatu

fun main() {

    val numbers: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12)

//  //cara lama
//  //mencetak index nya
//  for(i in 0 until numbers.size step  1) println(i)

//  //mencetak isi nya
//  for(i in 0 until numbers.size step  1) println(numbers[i])

    //cara baru, mencetak isinya
    //challenge
    for(i in numbers) {
       if(i % 2 == 0) {
           println(i*2)
       }

    }
}