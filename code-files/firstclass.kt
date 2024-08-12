/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
//     println("Hello, world!!!")
    
    var a:Int=5
    var b:Int=4
    println(a)
    println(b)
    
    val funValue=sum(a,b)
    println(funValue)

    var something: Int
    val valueOfFunctionSum=sum(3,3)
    println(valueOfFunctionSum)
    something=5
    println(something)    

    something=5
    println("The value of variable something is $something")
    
}

fun sum(a:Int,b:Int):Int{
    return a+b
}

fun printHello(){
    println("hello")
}

class Car(private var fuel:Int){
    fuel=fuel+litter
}