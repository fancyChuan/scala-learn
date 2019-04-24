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
    println("=======")
  }

  def listsTest(): Unit = {
    val one = 1 :: 2 :: 3 :: Nil            // Nil表示空列表， :: 操作符表示添加元素
    val two = Nil.::(4).::(5).::(6)         // 也可以这样写
    println(one ::: two)                    // ::: 表示列表合并成一个新的列表，注意结果是List(1, 2, 3, 6, 5, 4) 这个顺序
  }

  def tuplesTest(): Unit = {
    val t = ("scala", 99)                   // 实际是  Tuple2[Int,String]   Tuple3表示有三个元素，最多可以有22个元素，可以自己拓展
    println(t._1 + " - " + t._2)
  }

  // 函数执行入口
  def main(args: Array[String]) = { // 返回空类型
    greet()
    println(max(44, 33))
    loopPrint()
    arrayTest()
    listsTest()
  }
}
