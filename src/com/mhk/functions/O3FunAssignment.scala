package com.mhk.functions

/**
 * @author Hemanth Morla
 */
object O3FunAssignment extends App {

  def fun(a : Int, b: Int) = {a + b} // defining a method (not function)
    val list=List.range(1, 11)

  def power(i: Int, j: Int) = scala.math.pow(i, j) // defining a "method"
  def sqr(x: Int)  = (println)(power(x, 2)) // we assigned "power" function to other fun to get square function

  
  val l1=list.map(sqr) // applying sqr function to all list members

  val power1 : (Int,Int) =>(Double) =(x,y) => {scala.math.pow(x, y)}  // creating a "function" (not method)
  val square : (Int) => Double =(x) => {power1(x,2)}
  (println)(power1(7,2))
  (println)(square(7))
  (println)(list.map(square))
  
}