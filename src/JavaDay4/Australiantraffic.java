package JavaDay4;


public class Australiantraffic implements CentraltrafficInterfacedemo,Continentaltraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentraltrafficInterfacedemo a=new Australiantraffic();
		Australiantraffic b=new Australiantraffic();
		Continentaltraffic c=new Australiantraffic();
		c.trainsymbol();
		a.flashyellow();
		a.redstop();
		a.greengo();
		b.walkonsysmbol();
		
	}
	public void walkonsysmbol() {
		System.out.println("Walking");
	}
	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("green go Implementation");
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop Implementation");
	}

	@Override
	public void flashyellow() {
		// TODO Auto-generated method stub
		System.out.println("flashyellow Stop Implementation");
	}
	@Override
	public void trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train is Coming");
	}

}