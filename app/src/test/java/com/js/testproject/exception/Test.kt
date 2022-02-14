package com.js.testproject.exception

import org.junit.Test


internal var asdd = "asd"

class Test {

  val asd : String

  init {
    asd = "asd"
  }

  @Test
  fun test(){

    println(asdd)
    println(asd)
    asdd = "12123"
    println(asdd.take(2))


    val testString = StringBuilder("123").apply {
      insert(8,"-")
      insert(17,"-")
    }.toString()



    println(testString)


  }

}