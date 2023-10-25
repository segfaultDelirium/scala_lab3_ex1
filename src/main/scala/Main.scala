import java.lang.Math.PI as PI;
import scala.annotation.tailrec

def pi: Double = {
  PI
}

// mutliply by pi
def pi(arg: Double): Double = {
  arg * PI
}

@tailrec
def repN(n: Int, f: (Int => Int), value: Int): Int = {
  if n < 1 then {return value}
  val newValue = f(value);
  repN(n-1, f, newValue);
}

def printarg(): Unit = {
  println("-")
}

def printarg(arg: => String): Unit = {
  println(s"$arg");
}

def appneg(f: (Int, Int) => Int, n: Int) = {
  (m: Int) => f(n, -m)
}

@main def hello: Unit = {
  println( pi )
  println( pi(pi) )
  println( pi(pi(pi)) )
  printarg(arg = "hello");
  printarg();
  println(repN(5, (x: Int) => 2*x , 1 ))

  //part 2
  def f(x: Int, y: Int) = x+y
  val p = appneg(f, 6)
  val pRes = p(5) // here it is 1
  println(s"p(5) = $pRes");
}
