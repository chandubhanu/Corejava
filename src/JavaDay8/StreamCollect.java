package JavaDay8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> a=Stream.of("Bhanu","Prakash","Banti","bahubali","Bheem").filter(s->s.endsWith("i")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(a.get(0));
		List<Integer> b=Arrays.asList(3,4,2,2,2,7,5,1,9,7);
		List<Integer>c=b.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(c.get(3));
	}

}
