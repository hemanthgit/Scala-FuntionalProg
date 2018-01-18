package com.mhk.functions

/**
 * @author Hemanth Morla
 */
object O4FunAsParameter1 extends App{
  
val add : (Int,Int) => (Int) =(x,y) => {x + y}

def addition(fun:(Int,Int) => Int, x :Int, y : Int){
  println(fun(x,y))
}

addition(add, 2,3)
}