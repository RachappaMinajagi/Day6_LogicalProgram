import java.util.Scanner;

class Prime {
	int x;

	void primeNum() {
		for (int i = 2; i <= x; i++) {
			if (x % 2 == 0) { // condition checks
				System.out.println(x + " Num is Not Prime Number");
				break;
			} else {
				System.out.println(x + " Num is Prime Number");
				break;
			}

		}
	}

}

public class PrimeNum {
	public static void main(String[] args) {
		System.out.print("Enter the Num : ");
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		Prime pn = new Prime();
		pn.x = n;
		pn.primeNum();

	}
}