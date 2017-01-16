package fpscala.c02

object Exercise2 {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(i: Int): Boolean = {
      if ( i >= as.size - 1 ) true
      else if ( !ordered(as(i), as(i + 1)) ) false
      else go(i + 1)
    }

    go(0)
  }

}
