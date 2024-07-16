package Keywords;

public class thiskeyword {

	int a =2;
	
	public void getdata()
	{
		int a =4;
		int b = a+this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
	}
	
	//this refers to current object --> object scope lies in class level
	//super keyword is used to access methods of the parent class while this is used to access methods of the current class.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thiskeyword td = new thiskeyword();
		td.getdata();
	}

}
