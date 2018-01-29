package com.mhk.functions

class O8FunctionCallFromMethod1 {
  def multiExecute(f: () => Unit, numTimes: Int) {
    println(s"----------Printing the statement for $numTimes -------------")
    for(i <- 1 to numTimes) f()
    println("-----------END------------------------------")
  }
}

object O8FunctionCallFromMethod1 extends App{
  val fun1 : () => Unit = () => {println("Testing multiple times")}
  
  val obj = new O8FunctionCallFromMethod1
  obj.multiExecute(fun1,5);
}