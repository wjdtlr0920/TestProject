package com.js.testproject

import kotlinx.coroutines.*
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
  @Test
  fun addition_isCorrect() = runBlocking {

//    val job = launch() {
//      for (i in 1..5) {
//        println(i)
//        delay(1000)
//      }
//    }
//
//    val deffred = async {
////      delay(5000)
//      println("asyncTest")
//      1
//    }
//    println(deffred.await())
//    println(deffred.await())
//    println(deffred.await())
//    println(deffred.await())
//    println(deffred.await())
//
//
//
//    println("before : cancelAndJoin")
//
//
//
//    println("after : cancelAndJoin")


//    async {
//      suspend1()
//      suspend2()
//      suspend3()
//    }

    launch {

      async { default1() }
      async { default2() }
      async { default3() }


      val asd = async { suspend1() }.await()
      async { suspend2() }
      println("----------------")
//      async { suspend3() }
//      async { suspend4() }
//      async { suspend5() }
//      async { suspend6() }

    }
    println("----------------")
  }


  fun default1() {
    Thread.sleep(1000)
    println("default1 ${Thread.currentThread()}")
  }

  fun default2() {
    Thread.sleep(3000)
    println("default2 ${Thread.currentThread()}")
  }

  fun default3() {
//    Thread.sleep(5000)
    println("default3 ${Thread.currentThread()}")
  }

  suspend fun suspend1() {
//    delay(1000)
//    println("suspend1 ${Thread.currentThread()}")

    delay(3000)
    println("[suspendTask1] After 3s in (${Thread.currentThread().name})")
    delay(3000)
    println("[suspendTask1] After 6s in (${Thread.currentThread().name})")

    println("[suspendTask1] END in (${Thread.currentThread().name})*****")
  }

  suspend fun suspend2() {
//    delay(3000)
//    println("suspend2 ${Thread.currentThread()}")

    delay(1000)
    println("[suspendTask2] After 1s in (${Thread.currentThread().name})")
    delay(3000)
    println("[suspendTask2] After 4s in (${Thread.currentThread().name})")

    println("[suspendTask2] END in (${Thread.currentThread().name}) *****")
  }

  suspend fun suspend3() {
//    delay(1000)
    println("suspend3 ${Thread.currentThread()}")
  }

  suspend fun suspend4() {
    delay(3000)
    println("suspend1 ${Thread.currentThread()}")
  }

  suspend fun suspend5() {
    delay(6000)
    println("suspend2 ${Thread.currentThread()}")
  }

  suspend fun suspend6() {
//    delay(1000)
    println("suspend3 ${Thread.currentThread()}")
  }

  @Test
  fun collectionTest() {

    var testList = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    var testList2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)


    val testZip = testList.zip(testList2)

    print(testZip)


//    print(
//      testList.partition {
//        when (it % 3) {
//          0 -> true
//          1 -> true
//          2 -> false
//          else -> false
//        }
//      }
//    )


//    print(testList.singleOrNull{ it == 2 })

//    print(testList.elementAt(0))
//    print(testList.elementAt(1))
//    print(testList.elementAt(2))
//    print(testList.elementAt(3))
//    print(testList.elementAt(4))
//    print(testList.elementAt(5))
//    print(testList.indexOf(0))
//    print(testList.indexOf(1))
//    print(testList.indexOf(2))
//    print(testList.indexOf(3))
//    print(testList.indexOf(4))
//    print(testList.indexOf(5))

//    val groupMap = testList.groupBy {
//      when ( it % 3 ) {
//        0 -> "zero"
//        1 -> "one"
//        2 -> "two"
//        else -> "else"
//      }
//    }
//
//    print(groupMap)

//    print(testList.component1())
//    print(testList.component2())
//    print(testList.component3())
//    print(testList.component4())
//    print(testList.component5())

//    testList = testList.dropWhile { it < 5 }
//    testList2 = testList2.dropLastWhile { it < 5 }
//
//    testList.forEach { print(it) }
//    println()
//    println()
//
//    testList2.forEach { print(it) }
//    println()
//    println()
  }

}
