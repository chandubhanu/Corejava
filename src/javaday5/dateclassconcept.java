package javaday5;
import java.util.*;
import java.text.SimpleDateFormat;

public class dateclassconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date a=new Date();
SimpleDateFormat b=new SimpleDateFormat("MM/dd/yyyy");
SimpleDateFormat c=new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
System.out.println(b.format(a));
System.out.println(c.format(a));
System.out.println(a.toString());
}

}
