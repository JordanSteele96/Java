
public class FibonacciSequence {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
			
		for (int i = 0; i<=5;i++) {
			System.out.println("Iteration:" + i+" "+ "Fibonacci Number:" +a);
			c = a + b;
			a = b;
			b = c;	
		}
	}
}
