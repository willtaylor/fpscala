package fpscala.c03

import fpscala.datastructures.{List => FpList, Nil => FpNil}
import org.scalatest.{FlatSpec, Matchers}

class Exercise09Spec extends FlatSpec with Matchers {

  "length" should "work" in {
    Exercise09.length(FpList(0.0, 1.0, 2.0, 3.0)) should equal (4)
    Exercise09.length(FpNil) should equal (0)
    Exercise09.length(FpList(1, 2)) should equal (2)
  }

}
