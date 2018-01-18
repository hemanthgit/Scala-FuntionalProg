package com.mhk.functions

/**
 * @author Hemanth Morla
 */
object O1FunTest1 extends App {

  println("Inside function1")
  val list = List.range(11, 21)
  
  val isEven = ( i : Int) => {i%2 ==0} // single argumented functions
  val isOdd = (i : Int) => {i%2 !=0}
  val double=(i : Int) => {i *2}
val multiply=(i : Int, j : Int) => {i * j}  // double argumented functions

  val l1 = list.map(println)
  val l2 = list.filter(isEven) ;  println(l2)
  val l3 = list.map(isEven) ; println(l3)
  val l4 = list.filter(isOdd) ;  println(l4)
  val l5 = list.map(isOdd) ; println(l5)
  val l6=list.map(double) ; println(l6)
  val l7 =multiply(3,6) ; println(l7)  
}