package fpscala.c03

import fpscala.datastructures.{List => FpList, Nil => FpNil}
import org.scalatest.{FlatSpec, Matchers}

class Exercise11Spec extends FlatSpec with Matchers {

  "foldLeft sum, product, and length" should "work" in {
    Exercise11.sum(FpList(1, 2, 3, 4)) should equal (10)
    Exercise11.product(FpList(1.0, 2.0, 3.0, 4.0, 0.0)) should equal (0.0)
    Exercise11.product(FpList(1.0, 2.0, 3.0, 4.0)) should equal (24.0)
    Exercise11.length(FpNil) should equal (0)
    Exercise11.length(FpList(1, 2, 3)) should equal (3)
  }

}
