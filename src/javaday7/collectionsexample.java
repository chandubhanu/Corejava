package javaday7;
import java.util.ArrayList;


public class collectionsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {4,5,5,5,4,6,6,9,4};
//print how many times the number is reapeated and print which is the unique number
ArrayList<Integer> a1=new ArrayList<Integer>();


for(int i=0;i<a.length;i++)
{
	int k=0;
	if(!a1.contains(a[i]))
	{
		a1.add(a[i]);
		k++;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				k++;
			}
		}	System.out.println(a[i]);
		System.out.println(k);
		if(k==1)
		{
			System.out.println(a[i]+" "+"is Unique Number");
		}
	}
	
	}
	}

}
