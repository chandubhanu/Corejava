package javaday5;

public class childdemo extends parentdemo {
	String name="Prakash";
	public childdemo() {
super();
		System.out.println("child class constructor");
		
	}
	public void getdata() {
		System.out.println("I am child class");
		super.getdata();
	}
	public void getstring()
	{
	System.out.println(name);
	System.out.println(super.name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childdemo a=new childdemo();
		a.getstring();
		a.getdata();
	
		
		
	}

}
