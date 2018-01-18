package com.mhk.functions

/**
 * @author Hemanth Morla
 */
object O2FunTest2 extends App{
  
  val add = (x : Int,y : Int) => {x + y}   //  Implicit declaration
  val print1 = () => {println("zero argumented")}
                          // or
               () => println("zero argumented")
  
  val add1 : (Int,Int) => Int = (x,y) => {x +y} // explicit decalration
  val print : () => Unit =() => {println("zero argumented")}
  
  
}