package stack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		stack st=new stack(5);
		int choice;
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.print("0. Exit \n 1. Push \n 2. Pop \n 3. Peek\n");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				if(st.isFull())
				{
					System.out.println("Stack is full");
				}
				else
				{
					System.out.println("enter the data to push");
					st.push(sc.nextInt());
				}
				break;
				
			case 2:
				if(st.isEmpty())
				{
					System.out.println("Stack is empty");
				}
				else
				{
					int poppedElement=st.pop();
					System.out.println("Popped element is "+poppedElement);
				}
				break;
				
			case 3:
				if(st.isEmpty())
					System.out.println("stack is empty");
				else
				{
					int peekElement=st.peek();
					System.out.println("Peeked element is "+peekElement);
				}
				break;
			}
			
		}while(choice !=0);
		
	}

}
