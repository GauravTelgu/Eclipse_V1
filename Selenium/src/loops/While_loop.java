package loops;

public class While_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int i =0;
	//	while (boolean)
		while (i<=5)
		{
		System.out.println(i);
			i++;
		}
		
int j =20;
		
		//Difference
		// In while loop the boolean expression is first evaluated and then execution is done.
		// In do while loop , 1 loop of execution is guaranteed. i.e. do loop will definitely execute.
		
		
		do {
			System.out.println(j);
			j++;
		}
		
		while(j<=30);
		
	}

}
