package CorejavaDay2;

public class Multidimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		print the below format
//		2 4 5 
//		3 4 7
//Approach 1
		int a[][]=new int[2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=5;
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=7;
		System.out.println(a[0][2]);
		
		//Approach 2
		int b[][]= {{2,3,4},{3,4,5}};
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]);
				
			}
		System.out.println("");
		}
	}

}
