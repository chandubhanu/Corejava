package Corejava.JavaDay1;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)//Outer loop
			//this block will run for four times
		{
			System.out.println("Outerloop");
			for (int j=1;j<=4;j++)//inner loop
			{
				System.out.println(j);
				
			}
		}

	}

}
