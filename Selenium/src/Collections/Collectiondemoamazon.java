package Collections;

import java.util.ArrayList;

public class Collectiondemoamazon {

public static void main(String[] args) { // TODO Auto-generated method stub

int a[] ={ 4,5,5,5,4,6,6,9,4}; 
//int a[] ={ 4,5,6,9};
// Print unique number from the list- Amazon  
//print the string in reverse 
ArrayList<Integer> ab =new ArrayList<Integer>();   //initially here list is empty
for(int i=0;i<a.length;i++) 
{
	int count=0; 
	if(!ab.contains(a[i])) 
	{
		ab.add(a[i]); 
		count++; 
		for(int j=i+1;j<a.length;j++) 
		{
			if(a[i]==a[j]) 
			{
				count++;
				}
			} 
		// System.out.println(a[i]); 
		//System.out.println(count); 
		if(count==1) {
			System.out.println(a[i]+ " " + "is unique number"); 
		}
		}
	}

		}
	
}