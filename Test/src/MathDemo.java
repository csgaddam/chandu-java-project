import java.util.Scanner;
//program to generate random number betwen the diven range of integers
public class MathDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i1 = scan.nextInt();
		int  i2= scan.nextInt();
		int min = Math.min(i1, i2);
		int max = Math.max(i1, i2);
		int i   = min + (int)((Math.random()*(max-min)+1));
		System.out.println(i);	
		scan.close();
		}
}
