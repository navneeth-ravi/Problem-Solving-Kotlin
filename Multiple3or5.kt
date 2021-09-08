package `Problem-Solving-Kotlin`
interface MultipleSum{
    fun calculateSum(limit:Int):Int
}
class Multiple3or5 (var multipleOf3:Int=3,var multipleOf5: Int=5):MultipleSum{
    var sum:Int=0
    private fun sum3(){
        sum+=multipleOf3
        multipleOf3+=3
    }
    private fun sum5(){
        sum+=multipleOf5
        multipleOf5+=5
    }
    override fun calculateSum(limit:Int):Int{
        while(multipleOf3<limit && multipleOf5<limit)
            if (multipleOf3<multipleOf5) sum3()
            else if(multipleOf5<multipleOf3) sum5()
            else {sum3();multipleOf5+=5}
        while(multipleOf3<limit)sum3()
        while (multipleOf5<limit)sum5()
        return sum
    }
}

fun main(){
    var multipleSum:Multiple3or5= Multiple3or5()
    print("For calculating sum of multiples of 3 and 5, Enter a Limit: ")
    var n:Int= readLine()!!.toInt()
    println(multipleSum.calculateSum(n))

}