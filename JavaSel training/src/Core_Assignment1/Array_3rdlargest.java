package Core_Assignment1;

public class Array_3rdlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {5,2,4,6,9,8};		//-->{2,4,5,6,8,9}
		int size = a.length;
		
		//if(size<2) {								--> Can be used when you want to check with array Size
		//System.out.println("Invalid Input:");
		//return;
	//}
		
		for(int i=0;i<size;i++) {						
			for(int j=i+1; j<size;j++) {
				int temp;
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
		}
		System.out.println("The third largest number is: " + a[size - 3]);
}	
}