
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FibonocciSeries {
	public static void main(String[] args) {
		int[] a = new int[20];
		a[0] = 0;
		a[1] = 1;
		System.out.println(a[0]+"\n"
				+ ""
				+ ""+a[1]);
	for(int i=2;i<a.length;i++) {
		a[i] = a[i-1] + a[i-2];
		if(a[i]>100 && a[i]<200) {
			break;
		}
		System.out.println(a[i]);
		}
	}
}
