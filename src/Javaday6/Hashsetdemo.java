package Javaday6;

import java.util.HashSet;

import java.util.Iterator;

public class Hashsetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraylistdemo c=new arraylistdemo();
		c.abc();
HashSet<String> a=new HashSet<String>();
a.add("Bhanu");
a.add("Prakash");
a.add("Chandu");
a.add("he");
a.add("she");
System.out.println(a);
a.remove("Bhanu");
System.out.println(a);
System.out.println(a.isEmpty());
System.out.println(a.size());
Iterator<String> i=a.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}

	}

}
