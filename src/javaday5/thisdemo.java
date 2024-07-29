package javaday5;

public class thisdemo {
int a=2;
public void getdata() {
	int a=3;
int b=a+this.a;
System.out.println(b);
	System.out.println(a);
	System.out.println(this.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
thisdemo b=new thisdemo();
b.getdata();
	}

}
