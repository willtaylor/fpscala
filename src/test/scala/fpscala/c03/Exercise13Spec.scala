package fpscala.c03

import fpscala.datastructures.{Cons, List => FpList, Nil => FpNil}
import org.scalatest.{FlatSpec, Matchers}

class Exercise13Spec extends FlatSpec with Matchers {

  "foldLeft implemented in terms of foldRight" should "work" in {
    Exercise13.foldLeft(FpList(1, 2, 3, 4), FpNil: FpList[Int])((b, a) => Cons(a, b)) shouldBe Exercise10.foldLeft(FpList(1, 2, 3, 4), FpNil: FpList[Int])((b, a) => Cons(a, b))
  }

  "foldRight implemented in terms of foldLeft" should "work" in {
    Exercise13.foldRight(FpList(1, 2, 3, 4), FpNil: FpList[Int])(Cons(_, _)) shouldBe FpList.foldRight(FpList(1, 2, 3, 4), FpNil: FpList[Int])(Cons(_, _))
  }

}
