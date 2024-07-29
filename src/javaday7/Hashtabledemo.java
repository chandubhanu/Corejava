package javaday7;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashtabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<Integer,String> a=new Hashtable<Integer,String>();
a.put(0, "Rajajinagar");
a.put(1, "Budampadu");
a.put(2, "Chebrolu");
a.put(3, "Guntur");
//a.put(4, null);
System.out.println(a.get(2));
System.out.println(a);
a.remove(2);
System.out.println(a);
//hashtable -pass table set set collections

	}

}
