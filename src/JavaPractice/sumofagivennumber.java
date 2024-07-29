package JavaPractice;
import java.util.Scanner;
public class sumofagivennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
int a=scanner.nextInt();
scanner.close();
int sum=0;
for(int i=0;i<=a;i++)
{
	sum=sum+i;
}
System.out.println(sum);
	}

}
