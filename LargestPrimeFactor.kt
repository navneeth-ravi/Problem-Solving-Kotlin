package `Problem-Solving-Kotlin`
fun main(){
    print("\tLargest Prime Factor Finder \nEnter Number:")
    var num= readLine()!!.toLong()
    var max:Int=0
    while((num%2).toInt()==0){
        num=num/2
        max=2
    }
    for(i in 3..Math.sqrt(num.toDouble()).toInt()step 2)
        while ((num%i).toInt()==0){
            num=num/i
            if(i>max)max=i
        }
    println("ans: $max")
}