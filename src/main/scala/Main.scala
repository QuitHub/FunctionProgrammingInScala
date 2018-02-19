/**
  * 19/02/2018.
  *
  * @author lukematthews
  */
object Main extends App{
  import exercises.gettingstarted.GettingStarted._
  (1 to 10).foreach(x => println(x + " -> "+ fib(x)))

  println("is sorted: " + isSorted((1 to 10).toArray,(x:Int,y:Int)=> x<y))
  println("is sorted: " + isSorted(Array(1,23,44,42),(x:Int,y:Int)=> x<y))
  println("is sorted: " + isSorted(Array(1,23,44,45),(x:Int,y:Int)=> x<y))
  println("char is sorted: " + isSorted(Array('a','b','c','d','e'),(x:Char,y:Char)=> x>y))
  println("is sorted implicit: " + Array(1,23,45,44).sorted.mkString(", "))
}
