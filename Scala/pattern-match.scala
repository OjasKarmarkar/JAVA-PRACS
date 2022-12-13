import  scala.io.StdIn.readLine

object Main{
    def main(args: Array[String]):Unit = {
        val nums = readLine()

        for(c <- nums){
            c match {
                case '1'=> print("one")
                case '2'=> print("two")
                case '3'=> print("three")
                case '4'=> print("four")
                case '5'=> print("five")
                case '6'=> print("six")
                case '7'=> print("seven")
                case '8'=> print("eight")
                case '9'=> print("nine")
                case '0'=> print("zero")
                case _ => print("lol")
            }
        }
    }
}