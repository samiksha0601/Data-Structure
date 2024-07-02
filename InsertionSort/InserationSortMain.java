package dsa;

import java.util.Arrays;

public class InserationSortMain {

	public static void InsertionSort(int arr[],int size){
	int temp=0;int comp=0;int passes=0;
		for(int i=1;i<size;i++)		
		{
		passes++;
	
			for(int j=0;j<size-1;j++)
			{
				comp++;
				temp=arr[i];
			    if(arr[j]<temp)
			      {
					break;
				}else if(temp<arr[j])
				     {
					   temp=arr[i];
					   arr[i]=arr[j];
					   arr[j]=temp;
			     }
			     			 }
			
	  }
		System.out.println("Comparisons is: "+comp);
	System.out.println("Passes is: "+passes);
	
	}

	
	public static void main(String[] args) {
	
	//int arr[]= {55,44,22,66,11,33};
		int arr[]= {11,22,33,44,55,66};
		System.out.println("Array before sorted :"+ Arrays.toString(arr));
		InsertionSort(arr,arr.length);
		System.out.println("Array after sorted :"+ Arrays.toString(arr));
	}

}
