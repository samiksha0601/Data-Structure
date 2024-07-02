package dsa;

import java.util.Arrays;

public class BubbleSortMain {

	public static int bubbleSort(int arr[],int size){
		int comp=0;int passes=0;int flag;
		
		
	for(int i=1;i<size;i++)
	{ 
		flag=0;
		passes++;
		for(int j=0;j<size-i;j++)
		{
			comp++;
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
		   }
			

		}
		if(flag==0)
			break;
		
		
	}
	System.out.println("Comparisons is: "+comp);
	System.out.println("passes is: "+passes);
	return 0;
	}
	


public static void main(String[] args) {
		
		int arr[]= {33,22,66,55,44,11};
		//int arr[]= {11,22,33,44,55,66};
	//int arr[]= {22,11,33,44,55,66};
		System.out.println("array before sorted is: "+ Arrays.toString(arr));
		int res=bubbleSort(arr,arr.length);
		System.out.println("array after sorted is: "+Arrays.toString(arr));
		
	}

}
