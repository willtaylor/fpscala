package fpscala.c03

import fpscala.datastructures.{List => FpList, Nil => FpNil}
import org.scalatest.{FlatSpec, Matchers}

class Exercise6Spec extends FlatSpec with Matchers {

  "append" should "add new elements to the end of a List" in {
    Exercise6.append(6, FpList(1, 2, 3)) should equal(FpList(1, 2, 3, 6))
    Exercise6.append(6, FpNil) should equal(FpList(6))
  }

  "init" should "drop the last element of a list" in {
    Exercise6.init(FpList(1, 2, 3)) should equal(FpList(1, 2))
    Exercise6.init(FpNil) should equal(FpNil)
  }

}
