package Javaday6;

import java.util.ArrayList;


public class arraylistdemo {
	public void abc() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Bhanu");
		System.out.println(a);
		a.add(1, "Prakash");
		System.out.println(a);
		a.remove(1);
		a.remove("Prakash");
		System.out.println(a);
		System.out.println(a.get(0));
		System.out.println(a.contains("Bhanu"));
		System.out.println(a.indexOf("Bhanu"));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		}

}
