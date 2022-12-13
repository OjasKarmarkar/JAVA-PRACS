object Main {
  def main(args: Array[String]): Unit = {

    print("Enter no of terms in fib : ")
    val n = scala.io.StdIn.readInt()
    var n1 = 0
    var n2=1
    var n3=0
    print(fib(n))

    def fib(n: Int): Unit = {
      if (n > 0) {
        n3 = n1 + n2
        n1 = n2
        n2 = n3
        print(n3 + " ")
        fib(n - 1)
      }

    }
  }

}
