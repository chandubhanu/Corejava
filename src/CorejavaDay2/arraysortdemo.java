package CorejavaDay2;

public class arraysortdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Sort the given array
		//2,6,1,4,9
int a[]= {2,6,1,4,9};
int temp;
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<5;j++)
	{
	if(a[i]>a[j])
	{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	}
	}
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]);
	}
	}

}
/*
 
/* int a= 5;
int b =4;
/*int temp;
temp=a;
a=b;
b=temp;
System.out.println(a);
System.out.println(b);
// Swap with out variable

a=a+b;  // a= 9
b=a-b;  //b = 5
a=a-b; // a= 4  */


 