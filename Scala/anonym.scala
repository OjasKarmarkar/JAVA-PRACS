object Main{
    def main(args : Array[String]):Unit = {

        print("Enter first no : ")
        val a = scala.io.StdIn.readInt()
        print("Enter second no : ")
        val b = scala.io.StdIn.readInt()

        var tsum = () => {if(a!=b) a+b else 3*(a+b)}
        println(s"Sum is ${tsum()}")

    }
}