package com.mhk.functions

/**
 * @author Hemanth Morla
 */
class ClosureExample {
  def exec(f: (String) => Unit, name: String) {
    f(name)
  }
}

object ClosureExample extends App {

  var hello = "Hello"
  def sayHello(name: String): Unit = {
    println(s"$hello, $name")
  }

  val closure = new ClosureExample
  closure.exec(sayHello, "Hemanth")
  
  
  hello="Hi"
  closure.exec(sayHello, "Hemanth")

}