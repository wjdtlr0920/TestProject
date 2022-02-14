package com.js.testproject.exception

import com.js.testproject.ExampleUnitTest
import org.junit.Test

class Test2(){


  @Test
  fun companionTest(){
    ExampleUnitTest.printttttt2("companionTest")
    AccountTest.printttttt("companionTest2")

    listOf<String>()
  }

  @Test
  fun collectionTest(){
    val list1 = mutableListOf(1,2,3)
    val list2 = list1 + 4
    val list3 = list1 + list2
    val list4 = list1 - 3



    println(list1)
    println(list2)
    println(list3)
    println(list4)

  }

}