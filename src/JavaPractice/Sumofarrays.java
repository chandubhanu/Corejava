package JavaPractice;

public class Sumofarrays {
//Write a Java program to calculate the sum of all elements in an integer array.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5};
int k=0;
for(int i=0;i<a.length;i++) {
	k=a[i]+k;
}
System.out.println(k);
	}

}
