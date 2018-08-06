import java.util.Scanner;

public class PrimeNumber {
	static int i;
	static int count = 0;

	public static void main(String[] args) {

		System.out.println("Enter the number :");
		Scanner scan = new Scanner(System.in);
		i = scan.nextInt();
		scan.close();
		for (int j = 1; j <= i; j++) {
			if (i % j == 0) {
				count++;
			}
		}
		if (count == 2)
			System.out.println("The given number is prime");
		else
			System.out.println("The given number is not prime");
	}

}
