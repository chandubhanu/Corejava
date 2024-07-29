package JavaPractice;

public class Printpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to generate the following pattern using nested for loops
		/*
		**
		***
		****
		*****
		**/
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}System.out.println("");
		}
	}

}
