

public class Overloaded_Constructors_25 {

	int num;
	String text;
	double value;
	
	public Overloaded_Constructors_25() {
		this.num=0;
		this.text="Gaurav";
		this.value=0.0;
		System.out.println("Overloaded Contructor 1" + this.toString());
	}
	
	public Overloaded_Constructors_25(int num) {
		this.num=num;
		this.text="Gaurav";
		this.value=0.0;
		System.out.println("Overloaded Contructor 2" + this.toString());
	}
	
	public Overloaded_Constructors_25(int num, String text) {
		this.num=num;
		this.text=text;
		this.value=0.0;
		System.out.println("Overloaded Contructor 3" + this.toString());
	}
	
	public Overloaded_Constructors_25(int num, String text, double value) {
		this.num=num;
		this.text=text;
		this.value=value;
		System.out.println("Overloaded Contructor 4" + this.toString());
	}
	
	public String toString() {
		return "num: " + num + ", text: " + text + ", value: " + value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloaded_Constructors_25 obj1 =  new Overloaded_Constructors_25();
		Overloaded_Constructors_25 obj2 = new Overloaded_Constructors_25(10);
		
		Overloaded_Constructors_25 obj4 = new Overloaded_Constructors_25(10,"GauravTelgu",2.25);
		Overloaded_Constructors_25 obj3 = new Overloaded_Constructors_25(10,"GauravT");
		}

}