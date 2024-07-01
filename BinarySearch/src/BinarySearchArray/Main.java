package BinarySearchArray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter the size");
		size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("enter the element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int left=0;
		int right=size-1;
		System.out.println("Enter the key");
		int key=sc.nextInt();
		
		BinarySearch(arr, 0, right, key);
//		
		
	}
		
		public static void BinarySearch(int arr[],int left,int right,int  key)
		{
			
			
			if(left>right)
			{
				System.out.println("Element not present");
			}
			int mid=(left+right)/2;
			
     		 if(arr[mid]==key)
     		 {
					 System.out.println("Element is found at "+mid);
     		 }
			 else
			 {
					if(arr[mid]>key)
					{
						BinarySearch(arr,left,mid-1,key);
					}
					else
					{
						BinarySearch(arr,mid+1,right,key);
					}
			 }
			
			}
			
		
		}
			
		
	




