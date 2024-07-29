package javaday7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import Javaday6.arraylistdemo;

public class haghmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arraylistdemo e=new arraylistdemo();
		e.abc();
HashMap<Integer,String> a=new HashMap<Integer,String>();
//HashMap<Key,Value> a=new HashMap<Key,Value>();
a.put(0, "Rajajinagar");
a.put(1, "Budampadu");
a.put(2, "Chebrolu");
a.put(3, "Guntur");
a.put(4, null);
System.out.println(a.get(2));
System.out.println(a);
a.remove(2);
System.out.println(a);
//hashtable -pass table set set collections
Set b=a.entrySet();
Iterator c=b.iterator();
while(c.hasNext())
{

	Map.Entry d=(Map.Entry)c.next();
	System.out.println(d.getKey());
	System.out.println(d.getValue());
}

	}

}
