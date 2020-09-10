public class Fibonacci {
	
	/**
	 * Iterative implementation for nth fibonacci number
	 * Time complexity - O(n)
	 * Space complexity - O(1)
	 * 
	 * @param n
	 * @return
	 */
	public int fibonacciIterative(int n) {
		if(n <= 1) {
			return n;
		}
		int fib = 1;
		int prevFib = 1;
		
		for(int i=2; i<n; i++) {
			int temp = fib;
			fib+= prevFib;
			prevFib = temp;
		}
		return fib;
	}
	
	/**
	 * Recursive implementation for nth fibonacci number
	 * Time complexity - O(n)
	 * Space complexity - O(n)
	 * 
	 * @param n
	 * @return
	 */
	public int fibonacciRecursive(int n) {
		if(n <= 1) {
			return n;
		}
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}
	
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
