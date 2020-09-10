// Executed on Codingground
// $javac TimeTest.java
// $java -Xmx128M -Xms16M TimeTest
// 9746465
public class TimeTest {
  
	public static void main(String args[]) {
		Fibonacci fib = new Fibonacci();
		
		System.out.println("Iterative version:");
		long startTime = System.nanoTime();
		long resultI= fib.fibonacciIterative(20);
		long stopTime = System.nanoTime();
		System.out.println(resultI);
		System.out.println("Time taken by Iterative version: "+ (stopTime - startTime));

		System.out.println("Recursive version:");
		startTime = System.nanoTime();
		long resultR = fib.fibonacciRecursive(20);
		stopTime = System.nanoTime();
		System.out.println(resultR);
		System.out.println("Time taken by Recursive version:" + (stopTime - startTime));

	}
}

