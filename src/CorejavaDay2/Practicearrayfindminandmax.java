package CorejavaDay2;

public class Practicearrayfindminandmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Find the min number in the column and print the max number of that min number
		 * column 2 11 5 3 4 7 1 0 9
		 */
		int a[][] = { { 2, 4, 5 }, { 3, 4, 1 }, { 0, 2, 9 } };
		int min = a[0][0];
		int mincolumn = 0;

		int k = 0;
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
					mincolumn = j;
				}
			}
		}
		int max = a[0][mincolumn];
		while (k <= 2) {
			if (a[k][mincolumn] > max) {
				max = a[k][mincolumn];

			}
			k++;
		}
		System.out.println(max);
	}

}
