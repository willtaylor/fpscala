package fpscala.c02

object Exercise3 {

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = f.curried

}
