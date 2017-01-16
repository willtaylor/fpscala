package fpscala.c03

import fpscala.datastructures.{Cons, List => FpList, Nil => FpNil}

object Exercise13 {

  // TODO understand this :(
  // copied from https://github.com/fpinscala/fpinscala/blob/master/answerkey/datastructures/13.answer.scala
  def foldLeft[A, B](as: FpList[A], z: B)(f: (B, A) => B): B = {

    // step by step
    type IdentB = B => B
    def identB: IdentB = (b: B) => b
    def delayedCombiner: (A, IdentB) => IdentB = (a: A, delayFunc: IdentB) => (b: B) => delayFunc(f(b, a))
    def go: IdentB = FpList.foldRight(as, identB)(delayedCombiner)
    go(z)

    // one-liner
    FpList.foldRight(as, (b:B) => b)((a, g) => b => g(f(b, a)))(z)
  }

  def foldRight[A, B](as: FpList[A], z: B)(f: (A, B) => B): B = {
    Exercise10.foldLeft(Exercise12.reverse(as), z)((b, a) => f(a, b))
  }

}
