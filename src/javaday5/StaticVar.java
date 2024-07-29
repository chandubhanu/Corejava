package javaday5;

public class StaticVar {
	String name;//instance variables
	String address;
	static String city="Bangalore";//CLASS variables
	static int i=0;
	StaticVar(String name,String address)
	{
		this.name=name;//LOCAL variables
		this.address=address;
		i++;
		System.out.println(i);
	
	}
	public String getaddress() {
		return name + ", " + address+", "+city;
		
	}
	public static void getcity() {
		System.out.println(city);
	}
public static void main(String[] args)
	{
		StaticVar a=new StaticVar("Bhanu","marthalli");
		StaticVar b=new StaticVar("prakash","Rajaji Nagar");
		System.out.println(a.getaddress());
		System.out.println(b.getaddress());
		StaticVar.getcity();
	}

}
