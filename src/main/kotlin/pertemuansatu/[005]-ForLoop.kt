package pertemuansatu

fun main() {

//    // increment +1
//    for(i in 1..10 step 1) println(i)
//
//    //decrement -2
//    for(x in 10 downTo 0 step 2) println(x)

    //nested
    val start=1
    val finish=10
    for(i in start..finish step 1) {
        for(j in start..i step 1) {
            if(i == 9 && j == 5) break
            print(j)
        }
        println()
    }

}