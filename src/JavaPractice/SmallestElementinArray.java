package JavaPractice;

public class SmallestElementinArray {
//Write a Java program to find the smallest element in an integer array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
	int k=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<k)
			{
				k=a[i];
			}
		}
		System.out.println(k+" "+ "is the smallest number in the array");
	}

}
