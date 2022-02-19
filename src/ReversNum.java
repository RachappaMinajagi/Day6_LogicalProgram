import java.util.Scanner;

class Revers {
	int x;

	void reversNumCheck() {
		int r, rev = 0;
		int t = x;
		while (t != 0) {
			r = t % 10;
			rev = rev * 10 + r;
			t = t / 10;
		}
		if (x == rev)
			System.out.println(x + " Num is Revers Num");
		else
			System.out.println(x + " Num is Not Revers Num");
	}
}

public class ReversNum {
	public static void main(String[] args) {
		System.out.print("Enter the Num : ");
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		Revers r = new Revers();
		r.x = n;
		r.reversNumCheck();
	}
}