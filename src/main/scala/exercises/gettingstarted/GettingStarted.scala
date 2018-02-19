package exercises.gettingstarted

/**
  * 19/02/2018.
  *
  * @author lukematthews
  */
object GettingStarted {

  def fib(n: Int): Int = {
    def loop(n: Int, current: Int, next: Int): Int = {
      if (n == 1) current
      else if (n == 2) next
      else loop(n - 1, next, current + next)
    }
    loop(n, 0, 1)
  }

}
