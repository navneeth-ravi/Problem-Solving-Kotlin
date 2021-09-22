package `Problem-Solving-Kotlin`
import java.util.Scanner
import kotlin.math.sqrt

fun main(){
    val inp:Scanner=Scanner(System.`in`)
    print("Enter a Range Limit: ")
    val range:Int=inp.nextInt()
    var sum:Long=2
    var isPrime:(Int)->Boolean={
        var result:Boolean=true
        for(i in 3..sqrt(it.toDouble()).toInt())if(it.rem(i)==0){
            result=false
            break
        }
        result
    }
    for(i in 3..range step 2)if (isPrime(i))sum+=i
    if(sum<0) println("neg")
    println("Ans: ${sum}")
}