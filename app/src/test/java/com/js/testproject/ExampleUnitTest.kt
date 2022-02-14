package com.js.testproject

import com.orhanobut.logger.Logger
import kotlinx.coroutines.*
import org.junit.Test

import org.junit.Assert.*
import java.lang.Math.abs
import java.lang.StringBuilder
import java.util.*
import java.util.regex.Pattern
import kotlin.collections.ArrayList

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {


  companion object {

    fun printttttt2(text: String) {
      println(text)
    }
  }

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


  @Suppress("UNCHECKED_CAST")
  @Test
  fun asd() {


    val latestEmailListTest = ArrayList<AutoCompleteEmail>()
    latestEmailListTest.add(AutoCompleteEmail("asdasd@naver.com", "153215321100"))
    latestEmailListTest.add(AutoCompleteEmail("asdasd@naver.com", "153215321101"))
    latestEmailListTest.add(AutoCompleteEmail("asdasd@naver.com", "153215321102"))
    latestEmailListTest.add(AutoCompleteEmail("asdasd@naver.com", "153215321103"))
    latestEmailListTest.add(AutoCompleteEmail("asdasd@naver.com", "153215321104"))
    latestEmailListTest.add(AutoCompleteEmail("asdasd@naver.com", "153215321105"))
    latestEmailListTest.add(AutoCompleteEmail("asdasd@naver.com", "153215321106"))
    latestEmailListTest.add(AutoCompleteEmail("asdasd@naver.com", "153215321107"))
    latestEmailListTest.add(AutoCompleteEmail("asdasd@naver.com", "153215321108"))
    latestEmailListTest.add(AutoCompleteEmail("asdasd@naver.com", "153215321109"))
    latestEmailListTest.add(AutoCompleteEmail("asdasd@naver.com", "153215321110"))
    latestEmailListTest.add(AutoCompleteEmail("asdasd@naver.com", "153215321111"))


    println(latestEmailListTest)
    println()


    val subList = latestEmailListTest.subList(0, 10)

    println(subList)


//    latestEmailListTest.sortByDescending { it.sendTimeMillis.toLong() }
//    val list = latestEmailListTest.distinctBy { it.email }

//    print(list)

//
//    val xxx = Gson().toJson(latestEmailListTest)
//    val zzz = getStringToLatestDataList<AutoCompleteEmail>(xxx)
//
//    print(zzz[1])

//    val xxx = getLatestDataToString(latestEmailListTest)

//    val list : ArrayList<Any?> = arrayListOf<AutoCompleteEmail>() as ArrayList<Any?>

//    val sss = Gson().fromJson(xxx, Array::class.java).toList()
//    val sss = getStringToLatestDataList<AutoCompleteEmail>(xxx)
//
//    print(sss)


//    val ddd = arrayListOf(sss)

//    val asd = latestEmailListTest.distinctBy { it.email }
//    println(asd)
//
//    val asdd = latestEmailListTest.distinct()
//
//    latestEmailListTest.distinctBy { it.email }
//    println(asdd)
//
////    val asd = arrayOf(AutoCompleteEmail("aaa", "1"), AutoCompleteEmail("aab", "2"), AutoCompleteEmail("aac", "3"))
////
////    println(asd)
////    println()
////    println(asd.contentToString())
//
//
//    print("\n\n\n\n\n")

//    print(latestEmailListTest.toString())

  }

//  /**
//   * 데이터 스트링 변환
//   * */
//  fun <T> getLatestDataToString(dataList: ArrayList<T>): String {
//    return Gson().toJson(dataList)
//  }
//
//  /**
//   * 데이터 스트링 변환
//   * */
//  fun <T> getStringToLatestDataList(dataString: String): ArrayList<T> {
////    val arrayList = arrayListOf<T>()
////    list.forEach { arrayList.add() }
////    arrayList
//    val type = object : TypeToken<ArrayList<AutoCompleteEmail>>() {}.type
//    return Gson().fromJson(dataString, type)
//  }
//
//  /**
//   * 데이터 스트링 변환
//   * */
//  fun <T> getStringToLatestDataList(dataString: String): ArrayList<T> {
//    //    val arrayList = arrayListOf<T>()
////    list.forEach { arrayList.add() }
////    arrayList
//
//    val list = Gson().fromJson(dataString, Array::class.java).toList()
//
//
//    val arrayList = arrayListOf<T>()
//    list.forEach {
//      arrayList.add(it as T)
//    }
//    return
//
//  }


  @Test
  fun listEmptyTest() {
    runBlocking {
      val arrayList = arrayListOf("1", "2", "3", "4", "5")
      Logger.e(arrayList.isEmpty().toString())

      val arrayList2 = arrayListOf<String>()
      Logger.e(arrayList2.isEmpty().toString())
    }
  }


//  1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
//  2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
//  3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
//  4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
//  5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
//  6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
//  만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
//  7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.


  @Test
  fun codingTest() {
    runBlocking {

      val new_id = "Wjdtlr7055@naver.com"
      var regex = "^[0-9a-zA-Z]?[0-9a-zA-Z]?[0-9a-zA-Z]{2,3}$"
      var regex2 = """^[0-9a-zA-Z]?[@][0-9a-zA-Z]?[.][0-9a-zA-Z]{2,3}$"""
      var regex3 =
        "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}\$"
      var regex4 =
        "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*[.][a-zA-Z]{2,3}\$"

      println(new_id)
      println(Pattern.matches(regex, new_id))
      println(Pattern.matches(regex2, new_id))
      println(Pattern.matches(regex3, new_id))
      println(Pattern.matches(regex4, new_id))
    }
  }

  //  소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)
  @Test
  fun codingTest2() {
    runBlocking {

      val new_id = "...!@BaT#*..y.abcdefghijklm"
        .toLowerCase()
        .filter { it.isLowerCase() || it.isDigit() || it == '-' || it == '_' || it == '.' }
        .replace("[.]*[.]".toRegex(), ".")
        .removePrefix(".").removeSuffix(".")
        .let { if (it.isEmpty()) "a" else it }
        .let { if (it.length > 15) it.substring(0, 15) else it }
        .removeSuffix(".")
        .let {
          if (it.length < 3) {
            StringBuffer(it).run {
              while (length < 3) {
                append(last())
              }
              toString()
            }
          } else it
        }

      println(new_id)

//
//      "...!@BaT#*..y.abcdefghijklm015".filter {
//        println("$it : ${it.isLetter()}")
//        it.isLetter()
//      }
//
//      println()
//      println()
//
//      "...!@BaT#*..y.abcdefghijklm015".filter {
//        println("$it : ${it.isLowerCase()}")
//        it.isLetter()
//      }
//
//      println()
//      println()
//
//      "...!@BaT#*..y.abcdefghijklm015".filter {
//        println("$it : ${it.isDigit()}")
//        it.isLetter()
//      }
//
//      println()
//      println()

    }
  }

//  이 전화 키패드에서 왼손과 오른손의 엄지손가락만을 이용해서 숫자만을 입력하려고 합니다.
//  맨 처음 왼손 엄지손가락은 * 키패드에 오른손 엄지손가락은 # 키패드 위치에서 시작하며, 엄지손가락을 사용하는 규칙은 다음과 같습니다.
//
//  엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
//  왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
//  오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
//  가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
//  4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.
//  순서대로 누를 번호가 담긴 배열 numbers, 왼손잡이인지 오른손잡이인 지를 나타내는 문자열 hand가 매개변수로 주어질 때, 각 번호를 누른 엄지손가락이 왼손인 지 오른손인 지를 나타내는 연속된 문자열 형태로 return 하도록 solution 함수를 완성해주세요.
//
//  [제한사항]
//  numbers 배열의 크기는 1 이상 1,000 이하입니다.
//  numbers 배열 원소의 값은 0 이상 9 이하인 정수입니다.
//  hand는 "left" 또는 "right" 입니다.
//  "left"는 왼손잡이, "right"는 오른손잡이를 의미합니다.
//  왼손 엄지손가락을 사용한 경우는 L, 오른손 엄지손가락을 사용한 경우는 R을 순서대로 이어붙여 문자열 형태로 return 해주세요.


//  [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"

  @Test
  fun test() {

    val leftElement = "*"
    val rightElement = "#"

    val test = arrayListOf<ArrayList<String>>().apply {
      for (i in 1..10 step 3)
        if (i != 10) add(
          arrayListOf(
            i.toString(),
            (i + 1).toString(),
            (i + 2).toString()
          )
        ) else add(arrayListOf("*", "0", "#"))
    }

    val test2 = arrayListOf<ArrayList<String>>().apply {
      while (size < 4) {
        if (size != 3) add(
          arrayListOf(
            (size * 3 + 1).toString(),
            (size * 3 + 2).toString(),
            (size * 3 + 3).toString()
          )
        ) else add(arrayListOf("*", "0", "#"))
      }
    }

    println(test)
    println(test2)

    println(test[1][1])

  }


  @Test
  fun dataClassTest() {

    val dataClass1 = DataClass1()
    val dataClass2 = dataClass1.copy()
    val dataClass3 = dataClass1.copy(name = "park", age = "21")

    println(dataClass1)
    println(dataClass2)
    println(dataClass3)

    println(0x748fb5d888.toString(10))

  }

  data class DataClass1(
    val name: String = "kim",
    val age: String = "26"
  )

  class DataClass2(
    val name: String = "kim",
    val age: String = "26"
  ) {
    operator fun component1() = name
    operator fun component2() = age

    infix fun asd(a: String): String {
      return "$name 123"
    }

  }

  @Test
  fun classConstructTest() {
    val testList = arrayListOf<DataClass1>().apply {
      add(DataClass1("1", "a"))
      add(DataClass1("2", "b"))
      add(DataClass1("3", "c"))
    }

    for (i in testList) {
      println(i)
    }
    println()
    for (name in testList) {
      println("$name")
    }
    println()
    for ((name) in testList) {
      println("$name")
    }
    println()
    for ((name, age) in testList) {
      println("$name , $age")
    }
    println()
    for (i in testList) {
      println("${i.component1()} , ${i.component2()}")
    }

    val (name, age) = DataClass1("4", "d")
    println(name)
    println(age)
    println(name + age)
    println()

    val (a, b) = DataClass1("4", "d")
    println(a)
    println(b)
    println(a + b)
    println()


    val testList2 = arrayListOf<DataClass1>().apply {
      add(DataClass1("1", "a"))
      add(DataClass1("2", "b"))
      add(DataClass1("3", "c"))
    }

    for (i in testList2) {
      println(i)
    }
    println()
    for (name in testList2) {
      println("$name")
    }
    println()
    for ((name) in testList2) {
      println("$name")
    }
    println()
    for ((name, age) in testList2) {
      println("$name , $age")
    }
    println()
    for (i in testList2) {
      println("${i.component1()} , ${i.component2()}")
    }

    val (namee, agee) = DataClass2("4", "d")
    println(name)
    println(age)
    println(name + age)
    println()

    val (aa, bb) = DataClass2("4", "d")
    println(aa)
    println(bb)
    println(aa + bb)
    println()

    // TODO: 2022/01/12 asdasdasd
//    TODO("나중에 할거~~~")

  }


  @Test
  fun testtttt() {

    val a = DataClass2("z", "zz")
    println(a asd "123")

  }


  @Test
  fun stringTest() {
    println("화물정보 수정 요청 : %d건 / 배차취소 요청 : %d건".format(4, 3))
  }


  @Test
  fun stringTest2() {
    val calendar = Calendar.getInstance()
    calendar.add(Calendar.DAY_OF_MONTH, 5)

    println(calendar.time)

  }

  @Test
  fun calculateTest() {

    println(0 / 100)

  }


  @Test
  fun kakaoPhone() {

    val left = mutableListOf(3, 0)
    val right = mutableListOf(3, 2)

    val hand = "left"

    val stringBuffer = StringBuffer("")

    val map = mutableListOf<MutableList<String>>().apply {
      for (i in 0..2)
        add(mutableListOf((i * 3 + 1).toString(), (i * 3 + 2).toString(), (i * 3 + 3).toString()))
      add(mutableListOf("*", "0", "#"))
    }

    val dummyData = IntArray(11).apply {
      this[0] = 7
      this[1] = 0
      this[2] = 8
      this[3] = 2
      this[4] = 8
      this[5] = 3
      this[6] = 1
      this[7] = 5
      this[8] = 7
      this[9] = 6
      this[10] = 2
    }


    fun getHand(number: String): String {

      val position = mutableListOf<Int>()

      map.forEachIndexed { index, it ->
        if (it.indexOf(number) != -1) {
          position.add(index)
          position.add(it.indexOf(number))
        }
      }

      return if (position[1] == 2) {
        right[0] = position[0]
        right[1] = position[1]
        "R"
      } else if (position[1] == 0) {
        left[0] = position[0]
        left[1] = position[1]
        "L"
      } else {
        val a1 = if (position[0] - left[0] >= 0) position[0] - left[0] else left[0] - position[0]
        val a2 = if (position[1] - left[1] >= 0) position[1] - left[1] else left[1] - position[1]
        val b1 = if (position[0] - right[0] >= 0) position[0] - right[0] else right[0] - position[0]
        val b2 = if (position[1] - right[1] >= 0) position[1] - right[1] else right[1] - position[1]
        val leftDistance = a1 + a2
        val rightDistance = b1 + b2
        if (leftDistance == rightDistance) {
          if (hand == "right") {
            right[0] = position[0]
            right[1] = position[1]
            "R"
          } else {
            left[0] = position[0]
            left[1] = position[1]
            "L"
          }
        } else {
          if (leftDistance > rightDistance) {
            right[0] = position[0]
            right[1] = position[1]
            "R"
          } else {
            left[0] = position[0]
            left[1] = position[1]
            "L"
          }
        }
      }
    }

    dummyData.forEach {

      stringBuffer.append(getHand(it.toString()))
    }

    println("result : $stringBuffer")

  }

  @Test
  fun te23123st() {
    println(listOf(10, 20, 30, 40, 50, 60, 70, 80, 90).indexOf(0))
  }


  @Test
  fun te223123st() {
    val asd = listOf(10, 20, 30, 40, 50, 60, 70, 80, 90)
    for ((index, i) in asd.withIndex()) {
      println(index)
      println(i.toString())
    }
  }

  @Test
  fun kakao2run() {

//    [[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]

    val board = arrayOf(
      intArrayOf(0, 0, 0, 0, 0),
      intArrayOf(0, 0, 1, 0, 3),
      intArrayOf(0, 2, 5, 0, 1),
      intArrayOf(4, 2, 4, 4, 2),
      intArrayOf(3, 5, 1, 3, 1)
    )
    val moves = intArrayOf(1, 5, 3, 5, 1, 2, 1, 4)
//    kakao2(board, moves)
    print(stackTest2(board, moves))
  }
//  4311324

  fun kakao2(board: Array<IntArray>, moves: IntArray): Int {

    val resultIntArray = arrayListOf<Int>()
    var answer = 0

    moves.forEach loop@{ move ->
      board.forEachIndexed { iIndex, i ->
        i.forEachIndexed { jIndex, j ->
          if (move - 1 == jIndex) {
            if (j != 0) {
              resultIntArray.add(board[iIndex][jIndex])
              board[iIndex][jIndex] = 0
              return@loop
            }
          }
        }
      }
    }

    fun answerCheck() {
      resultIntArray.forEachIndexed loop@ { iIndex, i ->
        if (i==0)
          return@loop
        resultIntArray.forEachIndexed loop2@{ jIndex, j ->
          if (resultIntArray[jIndex] == 0)
            return@loop2
          if (jIndex > iIndex) {
            if (resultIntArray[iIndex] == resultIntArray[jIndex]) {
              resultIntArray[iIndex] = 0
              resultIntArray[jIndex] = 0
              answer += 2
              answerCheck()
              return@answerCheck
            } else {
              return@loop
            }
          }
        }
      }
    }
    answerCheck()

    return answer
  }


  @Test
  fun labelTest() {
    val intArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val intArray2 = arrayListOf(
      intArray,
      intArray,
      intArray,
      intArray,
      intArray,
      intArray,
      intArray,
      intArray,
      intArray
    )

    intArray2.forEachIndexed loop@{ iIndex, i ->
      intArray.forEachIndexed { jIndex, j ->
        print(i[iIndex])
        return@loop
      }
      println()
    }

  }

  @Test
  fun loop2(){
    var count = 0
    fun loop3(){
      if (count >= 10)
        return
      else{
        count++
        loop3()
      }
    }
    loop3()
    print(count)
  }


  @Test
  fun stackTest(){
    val stack : Stack<Int> = Stack()
    println(stack.empty())
    if (stack.isNotEmpty() || stack.peek() == -10)
      println("stack.peek()")
//    println(stack.pop())
  }

  fun stackTest2(board: Array<IntArray>, moves: IntArray): Int{
    var answer = 0
    val stack = Stack<Int>()

    moves.forEach {
      for (i in board.indices) {
        if (board[i][it - 1] != 0) {
          if (stack.isNotEmpty() && stack.peek() == board[i][it - 1]) {
            answer += 2
            stack.pop()
          } else {
            stack.push(board[i][it - 1])
          }
          board[i][it - 1] = 0

          break
        }
      }
    }
    return answer
  }

  @Test
  fun splitTest(){
//    val splitEmail = "wjdtlr16@naver.comashkbasjkdbasjkdb@naver.com".split("@")
    val splitEmail = "".split("@")
    val emailLength = splitEmail.sumOf { it.length } - splitEmail.last().length
    print(splitEmail)
    print(emailLength)
    print(emailLength < 20)
  }


  @Test
  fun charTest(){

    val charCode = '가'.toInt()
    val shCode = charCode.shr(8)
    print(shCode)
    print('\uAC00')
    print('\uAc00')
    println()
    println()

    for (i in 0..65535){
      println(i.toChar())
    }



  }

}

class Cook private constructor(val name: String, val time: Long) {

  val test = "zzz"

}