package com.mhk.functions

/**
 * @author Hemanth Morla
 */
object O7Enumeration extends App{
  
     object WeekDay extends Enumeration {
       type WeekDay = Value
       val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value
     }
     
     import WeekDay._
 
     def isWorkingDay(d: WeekDay):Boolean ={
       ! (d == Sat || d == Sun)
     } 
     
     WeekDay.values filter isWorkingDay foreach println
}