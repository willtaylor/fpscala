package fpscala.c02

object Exercise5 {

  def compose[A, B, C](g: B => C, f: A => B): A => C = (a: A) => g(f(a))

}
