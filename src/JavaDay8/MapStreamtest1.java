package JavaDay8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapStreamtest1 {

	public static void main(String[] args) {
		
		List<String> e=new ArrayList<String>();
		e.add("Bhanu");
		e.add("Chandu");
		e.add("Park");
		e.add("Ankith");
		e.add("Animal");
		// TODO Auto-generated method stub
		//print names which have last letterr as "a" with upper case
		Stream.of("Bhanu","Prakash","Banti","bahubali","Bheem").filter(s->s.endsWith("i")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//print names which have first letter as B with uppercase and sorted
	
		List<String> a=Arrays.asList("Bhanu","Prakash","Banti","bahubali","Bheem");
		a.stream().filter(s->s.startsWith("B")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	//Merging two different lists
		Stream<String> c=Stream.concat(a.stream(), e.stream());
		//c.sorted().forEach(s->System.out.println(s));
	Boolean flag=	c.anyMatch(s->s.equalsIgnoreCase("Bhanu"));
		System.out.println(flag);
	}

}
