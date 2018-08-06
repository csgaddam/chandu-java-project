import java.util.Scanner;

public class PrimeNumber {
	static int i;
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner scan = new Scanner(System.in);
		i =scan.nextInt();
		if(i%2 != 0) 
			System.out.println("The Entered number is a prime number");
		else
			System.out.println("The entered number is not a prime number");
		scan.close();
	}

}
