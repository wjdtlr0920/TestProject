package com.js.testproject.exception

import org.junit.Test
import java.util.*

class ExampleUnitTest2 {

  fun fromTo(from: Array<out Human>, to: Array<Human>) {
    for (i in from.indices) {
      to[i] = from[i]
    }
  }

  @Test
  fun reflectionTest2() {

    val animal = arrayOf(Animal())
    val human = arrayOf(Human())
    val man = arrayOf(Man())
    val woman = arrayOf(Woman())

    fromTo(man, human)

  }



  open class Animal
  open class Human: Animal()
  class Man: Human()
  class Woman: Human()

}
