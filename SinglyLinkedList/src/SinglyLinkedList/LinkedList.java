package SinglyLinkedList;

public class LinkedList {

	Node head=null;
	
	//constr
	public LinkedList() {
		super();
		this.head = head;
	}
	
	public boolean insert(int data)
	{
		Node newnode=new Node(data);
		if(newnode==null)
		{
			return false;
		}
		
		if(head==null)
		{
			head=newnode;
			return true;
		}
		
		Node temp=head;
		//for traversing
		while(temp.getNext() !=null)
		{
			temp=temp.getNext();
			//To avoid duplicate data 
//			if(temp.getData()==data)
//				return false;
		}
		//for adding new node
		temp.setNext(newnode);
		return true;
	}
	
	
	public boolean InsertAtFirst(int data)
	{
		Node newnode=new Node(data);
		if(head!=null)
		{
			
			newnode.setNext(head);
			head=newnode;
		}
		else
		{
			head=newnode;
		}
		return true;
		
	}
	
	public boolean InsertAtLast(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
		}
		if(head!=null)
		{
			Node temp=head;
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
				
			}
			if(temp.getNext()==null)
			{
			temp.setNext(newnode);
			}
		}
		return true;
	}
	public boolean insertAtPostion(int data,int pos)
	{
		

		Node newnode=new Node(data);
		if(newnode==null)
		{
			return false;
		}
		if(head==null)
		{
			head=newnode;
		}
		
		if(pos==1)
		{  newnode.setNext(head);
			head=newnode;
			return true;
			
			
		}
		
		Node temp=head;
		for(int i=1;i<pos-1;i++)
		{
			temp=temp.getNext();
//			
		}
			newnode.setNext(temp.getNext());
			temp.setNext(newnode);
			
		
		return true;
	}

	
	public boolean DeleteAtFirst()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		if(head!=null)
		{
			head=head.getNext();
		}
		return true;
	}
//	
//	public boolean DeleteAtLast()
//	{
//		Node temp=head;
//		while(temp.getNext()!=null)
//		{
//			temp=temp.getNext();
//		}
//		
//		if(temp.getNext()==null)
//		{
//			
//		}
//	}
//	
	public boolean DeleteAtPostion(int pos)
	{
		Node temp=head;
		if(head!=null)
		{
			head=head.getNext();
		}
		for(int i=1;i<pos-1;i++)
		{
			temp=temp.getNext();
		}
		temp.setNext(temp.getNext().getNext());
		//temp.setNext(null);
		return true ;
	}
	
	public boolean DeleteByValue(int data)
	{
		Node temp=head;
		int pos=0;
		while(temp!=null)
		{
			pos++;
			if(temp.getData()==data )
			{
				//System.out.println(data+" is found at "+pos);
				temp.setNext(temp.getNext().getNext());
				//System.out.println("");
			}
			temp=temp.getNext();
		}
		return true ;
	}
	
	
	public boolean FindAtValue(int data)
	{
		Node temp=head;
		int pos=0;
		while(temp.getNext()!=null)
		{
			pos++;
			if(temp.getData()==data)
			{
				System.out.println(data+" is found at "+pos);
			}
			temp=temp.getNext();
		}
		return true ;
	}
	
	public boolean Count()
	{
		int count=0;
		Node temp=head;
		while(temp.getNext()!=null)
		{
			count++;
			System.out.println(".....");
		}
		System.out.println("count: "+count);
		return true;
	}
	
	public boolean FindMax()
	{
		Node max=head;
		Node temp=head;
		while(temp!=null)
		{
			if(temp.getData()>=max.getData())
			{
				max=temp;
			}
			temp=temp.getNext();
		}
		System.out.println("max: "+max.getData());
		return true;
	}

	public void display()
	{
		Node temp=head;
		System.out.print("List: ");
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	
}
