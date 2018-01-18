package com.mhk.functions

/**
 * @author Hemanth Morla
 */

object O5DefVsVal extends App{

  val test: () => Int = {                        //anonymous function 'TYPE' of arity 0
    val r = util.Random.nextInt
 //   r              //type mismatch; found : Int required: () ⇒ Int
    () => r
  }

  val test1: () => Int = () => {              // anonymous function 'LITERAL' of arity 0
    val r = util.Random.nextInt
    r
  }
  
  val test2 = () => {
    val r = util.Random.nextInt
    r
  }
  
  println(test())
  println(test())
  println("*********************************")
  println(test)
  println(test)
  println("*********************************")

  println(test1())
  println(test1())
  println("*********************************")
  println(test1)
  println(test1)
  println("*********************************")
  
  println(test2())
  println(test2())
  println("*********************************")
  println(test2)
  println(test2)
  println("*********************************")
}