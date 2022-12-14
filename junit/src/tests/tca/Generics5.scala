package tests.tca

import ca.uwaterloo.scalacg.annotation.target

object Generics5 {
  trait A[X] {
    @target("A.foo") def foo(x : X) = { }
  }
  
  trait B[X] extends A[X] {
     @target("B.foo") override def foo(x : X) = { }
  }
  
  def main(args: Array[String]): Unit = {
    val a = new A[Int]{};
    val b : A[Int] = new B[Int]{};
    
   { "A.foo"; "B.foo"; b}.foo(3);
  }
}