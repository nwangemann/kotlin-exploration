import java.lang.ArithmeticException
import com.rsk.practiceFunction
import java.math.BigInteger

var Count:Int = 0

fun log (message: String, loglevel:Int = 1) {
    println(message + loglevel)
}

fun max(a:Int, b:Int): Int = if (a > b) a else b

fun maxOriginal(a:Int, b:Int): Int {
    return if (a > b) a else b
}

fun String.doSomething():String{
    return this.replace(this, "$this and more!")
}

tailrec fun fib(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) b else fib(n -1, a +b, a)
}

fun main(args: Array<String>){

    fun accum(s:String):String {
        var a:Array<String> = s.split("").toTypedArray()
        var array:CharArray = charArrayOf(*a)
        return array.joinToString()
    }
    accum("test")

}


//    practiceFunction()
//    var Guess:String = "default string"
//    var Guess2:String = Guess.doSomething()
//    log(Guess2)
//    println(fib(10, BigInteger("1"), BigInteger("0")))

//    for(i in 1 until 10){
//        println("$i is the current number")
//    }

//    when (Answer){
//        Guess -> print("Yer a wizard Harry")
//        else -> print("Eat my shorts")
//    }

//    try {
//        1+Count
//    } catch (e: ArithmeticException){
//        println(e)
//    }
