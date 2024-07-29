package JavaDay8;

import java.util.ArrayList;
import java.util.List;

public class Streamtest1 {
//count the  number of names 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Count=0;
		List<String> a=new ArrayList<String>();
a.add("Bhanu");
a.add("Prakash");
a.add("Banti");
a.add("Ankith");
a.add("Bheem");
System.out.println(a);
for(int i=0;i<a.size();i++)
{
	String actual=a.get(i);
	if(actual.startsWith("B"))
	{
		Count++;
	}
}
System.out.println(Count);

	}

}
