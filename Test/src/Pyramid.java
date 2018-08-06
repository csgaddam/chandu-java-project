class Pyramid {
	public static void main(String[] args) {
		int colnum = 1;
		int spacecount = 4;
		for (int i = 1; i <= 5; i++) {
			int k = 0;
			for (int j = 0; j <= spacecount; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= colnum; j++) {
				if (j <= i) {
					k++;
				} else {
					k--;
				}
				System.out.print(k);
			}
			System.out.println(" Test");
			colnum = colnum + 2;
			spacecount--;
		}
	}
}