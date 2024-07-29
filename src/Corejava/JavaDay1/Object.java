package Corejava.JavaDay1;

public class Object {
 String b="Bhanu";
	public void getdata() 
	{
	System.out.println("I am in method");
	}
		
	
	public static void main(String[] args) 
	{
		Secondclass c= new Secondclass();
		c.setdata();
		Object a=new Object();
		a.getdata();
		System.out.println(a.b);
         System.out.println("Output");
	}



}
