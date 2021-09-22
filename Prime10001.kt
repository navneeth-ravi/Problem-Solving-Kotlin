package `Problem-Solving-Kotlin`

import java.lang.Math.sqrt

fun main(){
    val result=10001
    var count=2
    var isPrime:(Int)->Boolean= {
        var result:Boolean=true
        for (i in 3..sqrt(it.toDouble()).toInt()) if(it % i == 0){
            result=false
            break
        }
        result
    }
    for(i in 3..Int.MAX_VALUE step 2)
        if(isPrime(i)) {
            if (count == 10001) {
                println("ans: $i")
                break
            }
            count += 1
        }
}