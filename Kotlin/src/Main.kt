fun main (args: Array<String>) {

    var a :Int = 2
    var b:Int = 3;
    myFirstFunction()
   var result1 = myFirstFunction2(a);
    myFirstFunction3(result1)
    myFirstFunction4(a,b)
    myFirstFunction3(myFirstFunction4(a,b))


}

fun myFirstFunction (){println("Hello World!")}
fun myFirstFunction2 (a:Int):Int{return a}
fun myFirstFunction3(a:Int) {println(a)}
fun myFirstFunction4 (a:Int,b:Int)= a+b