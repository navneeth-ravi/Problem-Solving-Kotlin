package `Problem-Solving-Kotlin`
fun check(number:Int):Boolean{
    var checkList: MutableList<Int> =mutableListOf<Int>(18,11,13,17,18,20,14)
    for(i in checkList) if(number.rem(i)!=0)return false
    return true
}
fun solution(limit:Int):Int{
    for(i in limit..Int.MAX_VALUE step 20 ){
        if(check(i))return i
    }
    return -1
}
fun main(){
    var result= solution(20)
    println(result)
}