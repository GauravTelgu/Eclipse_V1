package Interface;

public class IndianTraffic implements Centraltraffic,Continenttraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Centraltraffic a = new IndianTraffic();
		
		a.red(); 
		a.green(); 
		a.yellow();
		
		//new IndianTraffic();
		Continenttraffic ct = new IndianTraffic();
		ct.Trainsymbol();
		
		IndianTraffic at = new IndianTraffic();
		at.abc();

		
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("red implementation");
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("green implementation");
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("yellow implementation");
	}
	
	

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train");
	}
	
	public void abc() {
		System.out.println("walking");
	}

}
