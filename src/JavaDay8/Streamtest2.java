package JavaDay8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streamtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a=new ArrayList<String>();
		a.add("Bhanu");
		a.add("Prakash");
		a.add("Banti");
		a.add("Ankith");
		a.add("Bheem");
		System.out.println(a);
		System.out.println(a.stream().filter(s->s.startsWith("B")).count());
		
		//print the count of the strings starts with "B"
		long b1=Stream.of("Bhanu","Prakash","Banti","Ankith","Bheem")
				.filter( s->
		{
			return s.startsWith("B");
				}).count();
		System.out.println(b1);
		
//print the strings in the stream
		a.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		a.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}

}
