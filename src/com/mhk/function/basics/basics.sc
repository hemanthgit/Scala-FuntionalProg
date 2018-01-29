package com.mhk.function.basics

// Explict way of function declaration
val f : () => Unit = () => {println("Explicit zero arg function")}
val f1 : (Int,Int) => (Int) = (x,y) => {x+y}
//Implicit way of function decalration
val f2 = (x:Int,y:Int) => {x+y}
val f4 = () => {println("Implicit zero arg function")}
// Explict way of method declaration
def addMethod(x:Int, y:Int):Int = {x + y}
def unitMethod ():Unit = {println("Hi Unit method")}
// Explict way of method declaration
def addMethod1 (x:Int, y : Int) = {x + y}
def unitMethod1 () = {println("Hi Implicit Unit method")}
def addMethod(x:Int, y:Int):Int = {x + y}
def modMethod(x : Int) : Boolean = { x%2 == 0 }
val list = List.range(1,100)
list.filter(modMethod)
val  modFunctionExplicit : Int => Boolean = x => { x%2 == 0 }
list.filter(modFunctionExplicit)
val modFunctionImplicit = (x : Int) => { x%2 == 0}
list.filter(modFunctionImplicit)