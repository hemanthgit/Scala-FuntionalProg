package com.mhk.functions

/**
 * @author Hemanth Morla
 */
object O4FunAsParameter extends App{
  
  def execute(f : () => Unit){
    f()
  }
  
  def fun1() : Unit ={
    println("Inside function1()")
  }
  
  def fun2() : Unit ={
    println("Inside function2()")
  }
  
  execute(fun1)
  execute(fun2)
  
  val add : (Int,Int) => Int = (x,y) => {println("Inside add()"); x +y}
  val add1 =(x : Int, y : Int) => {println("Inside add1()");x +y}
  
  val add2 : (Int,Int) => Int = {
   (x:Int, y : Int) => {println(s"${x}");println(s"${y}");val z =x + y; z}
  }
  
   val add3 : (Int,Int) => Int = {
   (x:Int, y : Int) => {println(s"${x}");println(s"${y}");x + y}
  }
  
  println(add2(8,3))
  println(add2(9,1))
  
}