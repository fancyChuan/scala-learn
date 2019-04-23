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
    val args = Array("fancy", "chuan", "cool")
    // 传统方式
    var i = 0
    while (i < args.length) {
      println(args(i)) // 这里数组的写法是括号，而不是中括号！
      i += 1
    }

    // 更优雅的方式
    args.foreach(arg => print(arg + "\t"))
  }




  // 函数执行入口
  def main(args: Array[String]) = { // 返回空类型
    greet()
    println(max(44, 33))
    loopPrint()
  }
}
