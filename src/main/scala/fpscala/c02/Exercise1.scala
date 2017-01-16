package fpscala.c02

object Exercise1 {

  def fib(n: Int): Int = {
    import annotation.tailrec

    @tailrec
    def go(next1: Int, next2: Int, iter: Int): Int = {
      if ( iter <= 0 ) next1
      else go(next2,  next1 + next2, iter - 1)
    }

    go(0, 1, n)
  }

}
