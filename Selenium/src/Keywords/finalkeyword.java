package Keywords;

final class finalkeyword {

	// If you make a class name as final then you cannot extend that class.(cannot be used for inheritance--> Parent class cannot be inherited)
	
	final void getdata()
	{
		//methods declared with final keyword cannot be overridden
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		final int i=4;    // Constant variables
		//i=5;
		
		finalkeyword fk = new finalkeyword();
		
	}

}
