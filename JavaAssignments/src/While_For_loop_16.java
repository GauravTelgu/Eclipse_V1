
public class While_For_loop_16 {

	public void while_loop() {
		int i = 0;
		while (i <= 100) {
			System.out.println("Print 100 numbers using while loop:" + i);
			i++;

		}
	}

	public void for_loop() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("Print 100 numbers using for loop:" + i);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		While_For_loop_16 obj1 = new While_For_loop_16();
		While_For_loop_16 obj2 = new While_For_loop_16();
		obj1.while_loop();
		obj2.for_loop();
		
	}

}
