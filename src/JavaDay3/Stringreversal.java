package JavaDay3;

public class Stringreversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse a string and print if the string is palindrome or not
		
String a="madam";
String b="";
//O/p:unahb
for(int i=a.length()-1;i>=0;i--)
{
b=b+a.charAt(i);
}
System.out.println(b);
if(a.equals(b))
{
System.out.println("A is palindrome");

}

	}

}
