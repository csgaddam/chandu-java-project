import java.util.Scanner;

public class MultiplicationTable {
	static int num;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}
	}

}
