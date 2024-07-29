package CorejavaDay2;

public class Practicearrayminnum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//print the below format and find the minimum number in it
//		2 4 5
//		3 4 7
//		1 2 9
		int a[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int b=a[0][0];
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<b)
				{
					b=a[i][j];
				}
			}
		
		
		}
		System.out.println(b);	
	}

}
