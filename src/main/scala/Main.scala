/**
  * 19/02/2018.
  *
  * @author lukematthews
  */
object Main extends App{
  import exercises.gettingstarted.GettingStarted.fib
  (1 to 10).foreach(x => println(x + " -> "+ fib(x)))
}
