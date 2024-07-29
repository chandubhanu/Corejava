package Corejava.JavaDay1;

/*print the following format
1 2 3 4 
5 6 7
8 9
10
*/
public class practiceloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for (int i =0; i<=4; i++) {
			for (int j = 1; j <= 4-i; j++) {
				System.out.print(k);
				k++;
				System.out.print("\t");
				
			}
		System.out.println("");
		}
	}

}
