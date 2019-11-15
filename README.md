## Scala

每个 Scala 表达式都有返回结果

Scala 访问数组的语法是使用 () 而非 [] 。在某个值后面使用 () 时，Scala 将其翻译成对应对象的 apply 方法

Scala 不支持 ++i 和 i++ 运算符，因此需要使用 i += 1 来加一

Scala 使用方括号来指明数据类型参数，而非尖括号


Scala 中提供了 Lists 类。和 Java 的 List 不同，Scala 的 Lists 对象是不可修改的.

Scala 也是一个面向函数的编程语言，面向函数的编程语言的特点
- 调用某个方法不应该有任何副作用，参数一定，调用该方法后，返回一定的结果，而不会去修改程序的其它状态（副作用）
- 避免了多线程访问的互锁问题

Scala中另外一个很有用的容器类为 Tuples
- 和 List 不同的是，Tuples 可以包含不同类型的数据，而 List只能包含同类型的数据。
- 以使用 ._ 和 索引 来访问元组的元素，索引从1开始
- 目前 Scala 支持的元组的最大长度为 22 支持拓展

Set(集合)是没有重复对象的集合，所有的元素都是唯一的。包含可变和不可变两种类型


隐式类型转换：调用 (-1).abs() ，Scala 发现基本类型 Int 没有提供 abs() 方法，但可以发现系统提供了从 Int 类型转换为 RichInt 的隐式自动转换，
而 RichInt 具有 abs 方法，那么Scala就自动将 1 转换为 RichInt 类型，然后调用 RichInt 的 abs 方法


使用 s.indexOf('o') 时， indexOf 不是一个运算符。 而你写成 s indexOf 'o'，indexOf 就是一个操作符，因为使用了操作符的语法

操作符：
- 前缀运算符，比如 -7
- 中缀运算符，比如 3 + 4
- 后缀运算符，如 7 toLong

Scala 的 == 和Java不同，scala 的 == 只用于比较两个对象的值是否相同。而对于引用类型的比较使用另外的操作符 eq 和 ne。


#### Scala操作符
- ::  表示构造，往队列的头部追加数据创造性的列表。比如 x::list就是把x加到list的头部形成新的列表
```
scala> val prices = List(3,5.9, 666)
prices: List[Double] = List(3.0, 5.9, 666.0)

scala> 77::prices
res0: List[AnyVal] = List(77, 3.0, 5.9, 666.0)

```
- :+ 表示在尾部追加元素
- +: 表示头部追加，跟::很类似，但::可以用于pattern match，而+:不行
- ++ 连接两个集合
- ::: 只能用于连接两个List类型的集合

#### 拉链操作
```
scala> val a = List(0,3,5)
a: List[Int] = List(0, 3, 5)

scala> val b = List(6,7)
b: List[Int] = List(6, 7)

scala> a zip b
res4: List[(Int, Int)] = List((0,6), (3,7))

scala> b zip a
res5: List[(Int, Int)] = List((6,0), (7,3))
```
- zip： b集合元素少，那么zip操作就只拉链了2个元素，a中多的一个元素不会参与
- zipAll方法可以指定较短列表的缺省值
- zipWithIndex返回的对偶中第二个组成部分是每个元素的下标

