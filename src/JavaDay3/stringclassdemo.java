package JavaDay3;

public class stringclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="HELLO world";//string literal
		//String ab=new String("Hello");//string class
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(3, 9));
		System.out.println(a.substring(3));
		System.out.println(a.concat("Bhanu"));
		System.out.println(a.length());
		System.out.println(a.trim());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		String b[]=a.split(" ");
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(a.replace("L", "P"));
		}

}
