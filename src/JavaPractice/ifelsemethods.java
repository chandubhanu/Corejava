package JavaPractice;

public class ifelsemethods {

	//Write a Java program to check whether a given number is even or odd using if-else statement
	public String evenorodd(int num) {
	if(num%2==0)
	{
		return("Entered number is Even");
	}
	else
	{
		return("Entered number is odd");
	}
	}
	//Create a Java program that takes a user's age as input and prints "You are eligible to vote" if the age is 18 or above, otherwise, print "You are not eligible to vote
	public String vote(int age) {
		if(age>18)
		{
			return("Eligible to vote");
		}
		else
		{
			return("Not Eligible to vote");
		}
	}
//Write a Java program to find the largest among three numbers entered by the user using if-else statements
	public int greatestofthree(int a,int b,int c) 
	{
		if(a>b && a>c) {
			return a;
		}
		else if(b>a && b>c)
		{
			return b;
		}
		else {
			return c;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
