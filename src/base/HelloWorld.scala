package base

object HelloWorld {

  // 有返回值的的写法
  def max(a:Int, b:Int): Int = { // 返回Int类型
    if (a > b) a
    else
      b
  }

  // 无返回值
  def greet(): Unit = println("hello scala")

  // while实现循环
  def loopPrint() = {
    val args = Array("fancy", "chuan", "cool") // 等同于 Array.apply("")
    // 传统方式
    var i = 0
    while (i < args.length) {
      println(args(i)) // 这里数组的写法是括号，而不是中括号！
      i += 1
    }
    // 更优雅的方式
    args.foreach(arg => print(arg + "\t"))
    // 更高级的方法
    for (arg <- args) println(arg + "\t")
  }

  // 数组也可以用泛型
  def arrayTest(): Unit = {
    val greets = new Array[String](3) // 泛型使用中括号而不是尖括号
    greets(0) = "hello"
    greets(1) = ","
    greets.update(2, "world") // 也可以这样更新
    for (i <- 0 to 2) print(greets(i))
  }



  // 函数执行入口
  def main(args: Array[String]) = { // 返回空类型
    greet()
    println(max(44, 33))
    loopPrint()
    arrayTest()
  }
}
