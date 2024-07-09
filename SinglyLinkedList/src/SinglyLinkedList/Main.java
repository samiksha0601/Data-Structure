package SinglyLinkedList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll=new LinkedList();
	Scanner sc=new Scanner(System.in);
	boolean exit =false;
	while(!exit)
	{
	System.out.println("Enter the choice \n1.For Insertion \n2.For Display \n3.Insert at postion \n4.Insert at First \n5.Insert at Last"
			+ "\n6. Deletion first \n7.Delete At Postion \n8.Delete at Value \n9.Count \n10.Find at Value \n11.Find Max");
	int choice=sc.nextInt();
	//System.out.println(choice);
		
	switch(choice)
	{
	case 1:
		ll.insert(sc.nextInt());
		break;
		
		
		
	case 2:
        ll.display();
		break;
		
	case 3:
		System.out.println("Enter data and postion");
		ll.insertAtPostion(sc.nextInt(),sc.nextInt());
		
		break;
		
	case 4:
		ll.InsertAtFirst(sc.nextInt());
		break;
		
	case 5:
		ll.InsertAtLast(sc.nextInt());
		
	case 6:
		ll.DeleteAtFirst();
		
	case 7:
		ll.DeleteAtPostion(sc.nextInt());
		
		break;
		
	case 8:
		ll.DeleteByValue(sc.nextInt());
		break;
		
	case 9:
		ll.Count();
		break;
		
	case 10:
		ll.FindAtValue(sc.nextInt());
		break;
		
	case 11:
		ll.FindMax();
		break;
	
	}	
	}

}
}
