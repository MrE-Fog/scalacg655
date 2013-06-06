package tests

import callgraph.annotation.reachable

object Reachable1 {

  def main(args: Array[String]): Unit = {
    
    // This calls A.apply
    for(v <-  0 to 10) {
      A(v)
    }
    
    // This calls B.apply
    for(v <-  0 to 10) {
      B(v)
    }

  }
 
  object A {
    @reachable
    def apply(x: Int) = { "A" + x }
  }

  object B {
    @reachable
    def apply(x: Int) = { "B" + x }
  }

}