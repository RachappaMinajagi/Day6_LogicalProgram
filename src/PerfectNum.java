import java.util.Scanner;

class PerfectChek {
	int x;

	void perfect() {
		int t = x; // variable stores the sum of divisors
		int a = 0, r;
		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				a = a + i; // calculates the sum of factors
			}
		}
		if (a == x) {
			System.out.println(t + " Num is Perfect Number");
		} else
			System.out.println(t + " Num is Not Perfect Number");

	}

}

public class PerfectNum {
	public static void main(String[] args) {
		System.out.print("Enter the Num : "); // print the perfect number
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		PerfectChek p = new PerfectChek();
		p.x = n;
		p.perfect();

	}
}