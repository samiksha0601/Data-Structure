package CircularQueue;

import java.util.Scanner;

public class CircularMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int choice;
		CircularQueue c=new CircularQueue(size);
		do {
			System.out.println("0. Exit \n1. Enqueue \n2.Dequeue \n3.Peek ");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				if(c.isFull())
					System.out.println("Queue is Full");
				else
				{
					System.out.println("Enter the data");
					int data=c.Enqueue(sc.nextInt());
					System.out.println(data);
				}
				break;
				
			case 2:
				if(c.isEmpty())
					System.out.println("Queue is Empty");
				else
				{
				  int data=	c.Dequeue();
				  System.out.println(" element is Dequeued "+data);
				}
				break;
				
			case 3:
				if(c.isEmpty())
					System.out.println("Queue is Empty");
				else
				{
					int data=c.peek();
					System.out.println("Peeked element is "+data);
				}
				break;
			}
		}while(choice!=0);
	}

}
