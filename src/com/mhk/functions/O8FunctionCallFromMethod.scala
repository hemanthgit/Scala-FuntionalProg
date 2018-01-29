package com.mhk.functions

class O8FunctionCallFromMethod {
  def execute(f: Int => Unit): Unit = {
    f(1)
  }

}

object O8FunctionCallFromMethod extends App {
  println("Inside companion object ")
  val f1: Int => Unit = i => { println(i + 1) } // Explicit declaration
  val f2 = (i: Int) => { println(i + 1) }           // Implicit declaration of function f1

  val obj = new O8FunctionCallFromMethod
  obj.execute(f1)
  obj.execute(f2)
}