
import java.util.Scanner;

class Fibonacci {
	int x;

	void fibonDispSeries() {
		int a = 0, b = 1, c;

		System.out.print(a + " " + b); // printing 0,1
		for (int i = 2; i <= x; i++) { // loop starts from 2 because 0 and 1 are already initialized
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}
}

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.print("Enter the limit Fibonacci Series : ");
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		Fibonacci f = new Fibonacci();
		f.x = n;
		f.fibonDispSeries();

	}
}