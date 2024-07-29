package JavaDay3;

public class Stringbufferandstringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String buffer and String bulder -- muttable
		//String buffer is thread safe but string builder is not thread safe 
		StringBuffer  a=new StringBuffer("Hello");
		
		a.append("World");
		System.out.println(a);
		a.insert(2, "She");
		System.out.println(a);
		a.replace(0, 5, "She");
		System.out.println(a);
		a.deleteCharAt(7);
		System.out.println(a);
		a.reverse();
		System.out.println(a);
		}

}
