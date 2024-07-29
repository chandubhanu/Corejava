package JavaPractice;

public class sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {4,6,3,4,5};
int temp;
for(int i=0;i<a.length;i++)
{
for(int j=1+i;j<a.length;j++)
{
	if(a[i]>a[j]) {
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
	}
}
for(int i=0;i<a.length;i++)
	System.out.println(a[i]);
	}

}
