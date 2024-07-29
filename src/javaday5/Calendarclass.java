package javaday5;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendarclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar a=Calendar.getInstance();
		SimpleDateFormat c=new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(c.format(a.getTime()));
		System.out.println(a.get(Calendar.DAY_OF_WEEK));
	
	}

}
