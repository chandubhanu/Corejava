package JavaPractice;

public class AverageofArrayElements {
//Write a Java program to calculate the average of all elements in an integer array
	//average =sum of elements/no of elements
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=a[i]+sum;
		}
		double avg=(double)sum/a.length;
System.out.println(avg);
	}

}
