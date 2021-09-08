package `Problem-Solving-Kotlin`

fun main(){
    var prev:Int=1
    var cur:Int=2
    var sum:Int=2
    while(cur<4000000){
        cur =cur+prev
        prev=cur-prev
        if(cur%2==0)sum+=cur
    }
    print("Sum of Even Fibonacci Numbers: $sum")
}