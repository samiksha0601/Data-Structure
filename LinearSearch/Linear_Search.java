package LinearSearch;

import java.util.Scanner;

public class Linear_Search {
	
	
	public static int LinearSearch(int arr[],int n,int key)
	{ int comp=0;
		for(int i=0;i<n;i++)
		{   
			
		  if(key==arr[i])
		   {
			 comp++;
			System.out.printf("comparisons is :",comp);
			return i;
		   }
		}
		return -1;
	}


	public static void main(String[] args) {
		int key;
		
		int arr[]= {88,33,66,99,11,77,22,55,14};
		
		Scanner scan=new Scanner(System.in);
	
		System.out.print("Enter the key: ");
		key=scan.nextInt();
     
		int Result = LinearSearch(arr,arr.length,key);
		
		//System.out.print(Result);
		if(Result!=-1)
			System.out.print(Result);
		else
			System.out.println(Result);
			System.out.print("key not found");
		
	}

}
