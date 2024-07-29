package JavaDay4;

public class overloadingdemo {
	public void getdata(int a) {
		System.out.print(a);
	}
public void getdata(String b) {
	System.out.print(b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
overloadingdemo a=new overloadingdemo();
a.getdata(1);
a.getdata("Bhanu");

	}

}
