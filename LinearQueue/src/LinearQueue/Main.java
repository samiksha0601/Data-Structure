package LinearQueue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of queue");
		int size=sc.nextInt();
		Queue q=new Queue(size);
		int choice;
		do
		{
			
			System.out.println("0. Exit \n1. Enqueue \n2. Dequeue \n3. Peek");
			System.out.println("enter the choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				if(q.isFull())
				{
					System.out.println("Queue is full");
				}
				else
				{
					System.out.println("Enter the Data");
					int data=q.enqueue(sc.nextInt());
					System.out.println(data);
				}
				
				break;
				
				
			case 2:if(q.isEmpty())
				   System.out.println("Queue is Empty");
			      else
			      {
			    	 int data= q.Dequeue();
				    System.out.println("Element is Dequeue "+data);
			      }
				break;
				
				
			case 3:
				if(q.isEmpty())
					System.out.println("Queue is empty");
				else {
				int data=q.peek();
				System.out.println("Peeked element is "+ data	);
				}
					
				break;
				
			}
		}while(choice !=0);
	}

}
