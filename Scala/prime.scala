import scala.compiletime.ops.int
object Main {
  def main(args: Array[String]): Unit = {
    print("Enter number : ")
    val num = scala.io.StdIn.readInt()
    var a = 3

    println(isPrime(num))

    def isPrime(n: Int): Boolean = {
      if (n == 1 || n == 2) return false
      while (a < num) {
        if (num % a == 0) {
          return false
        }
        a+=1

      }
      return true
    }

  }
}
