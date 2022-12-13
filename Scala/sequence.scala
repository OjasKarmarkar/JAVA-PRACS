import scala.io.StdIn._

object Main {
  var m = 0.0
  def function(a: Int, n: Int, f: Int => Int): Double = {
    if (n == 1) {
      return a
    } else {
      m = m + Math.pow(a, n) / f(n)
      return function(a, n - 1, f)
    }
  }

  def fact(a: Int): Int = {
    if (a == 1) return 1
    return a * fact(a - 1)
  }

  def main(args: Array[String]): Unit = {
    print("Enter value of a : ")
    val a = readInt()

    print("Enter value of n : ")
    val n = readInt()
    m = a

    function(a, n, fact)
    println(m)
  }

}
