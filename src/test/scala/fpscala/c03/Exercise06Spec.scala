package fpscala.c03

import fpscala.datastructures.{List => FpList, Nil => FpNil}
import org.scalatest.{FlatSpec, Matchers}

class Exercise06Spec extends FlatSpec with Matchers {

  "append" should "add new elements to the end of a List" in {
    Exercise06.append(6, FpList(1, 2, 3)) should equal(FpList(1, 2, 3, 6))
    Exercise06.append(6, FpNil) should equal(FpList(6))
  }

  "init" should "drop the last element of a list" in {
    Exercise06.init(FpList(1, 2, 3)) should equal(FpList(1, 2))
    Exercise06.init(FpNil) should equal(FpNil)
  }

}
