package com.js.testproject.exception

import org.junit.Assert.assertEquals
import org.junit.Assert.fail
import org.junit.Test

class AccountTest {

  companion object {

    fun printttttt(text : String){
      println(text)
    }

  }

  @Test
  fun init(){
    try {
      val account : Account? = Account()

      if (account == null)
        throw Exception()
    } catch (e: Exception){
      e.printStackTrace()
    }
  }
}


class Account {
  init{
    assert(true)
    assertEquals("asd","asd")
    fail()
  }

}