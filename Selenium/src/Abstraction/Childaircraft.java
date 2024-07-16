package Abstraction;
public class Childaircraft extends Parentaircraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Childaircraft c = new Childaircraft();
		c.bodycolor();
		c.engine();
		c.safetyGuidelines();
		
	}

	@Override
	public void bodycolor() {
		// TODO Auto-generated method stub
		System.out.println("Red color");
	}

}
