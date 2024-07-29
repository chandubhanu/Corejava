package JavaPractice;

public class primeornot {
//public String primenot(int a) {
//	if (a<=1) {
//	return "Not prime number";
//	}
//	for(int i=2;i<Math.sqrt(a);i++)
//	{
//		if(a%1==0) {
//			return ("Not Prime Number");
//			}
//		
//		}
//	return "Prime number;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		if (a<=1) {
			System.out.println("Not prime number");
			}
			for(int i=2;i<=Math.sqrt(a);i++)
			{
				if(a%1==0) {
					System.out.println("Not prime number");
					}
				
				}
			System.out.println("prime number");;
	}

}
