package dsa;

import java.util.Arrays;

public class SelectionSortMain {
  
	int comp;int pass;
     public static int SelectionSort(int arr[],int n){
    	 int comp=0;int pass=0;int flag;
    	
    	for(int i=0;i<n-1;i++)
    	{ 
    		flag=0;
    		pass++;
    	
    		for(int j=i+1;j<n;j++)
    		{
    			comp++;
		
    				if(arr[i]>arr[j])
    			{
    			    int temp;
    				temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    				flag=1;
    			}
    			
    		}
    		if(flag==0)
    			break;
    	}
    	System.out.println("coparisons : "+comp);
		System.out.println("passes : "+pass);
    	 
       return -1;         
	}
	
	public static void main(String[] args) {
	//int arr[]= {44,11,55,22,66,33};
		int arr[]= {11,22,33,44,55,66};
		System.out.println("array before sorted: "+ Arrays.toString(arr));
		int res=SelectionSort(arr,arr.length);
		System.out.println("array after sorted: "+ Arrays.toString(arr));
		
		
	}

}
