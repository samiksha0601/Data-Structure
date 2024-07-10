package LinearSearchLinkedList;

public class LinearSearch{

	
	private Node head;
	public LinearSearch() {
		super();
		this.head = null;
	}
	
	 public boolean insert(int data) {

	        Node newNode = new Node(data);
	        if (newNode == null) {
	            return false;
	        }


	        if (head == null) {
	            head = newNode;
	            return true;
	        }

	        Node temp = head;
	        if(head.getData() == data) {
	            return false;
	        }
	        while (temp.getNext() != null) {
	            temp = temp.getNext();
	            if(temp.getData() == data) {
	                return false;
	            }
	        }

	        temp.setNext(newNode);
	        return true;
	    }
	 
	 
	 public void display() {
	        Node temp = head;

	        while(temp != null) {
	            System.out.print(temp.getData() + " ");
	            temp = temp.getNext();
	        }
	        System.out.println();
	    }
	
	 //search data at particular position
	 public boolean search(int data)
	 {
		 if(head==null)
		 {
			 return false;
		 }
//		  
		 int pos=1;
		 Node temp=head;
		 while(temp!=null)
		 {
			 if(temp.getData()==data)
			 {
			 System.out.println(temp.getData()+" is at postion "+pos);
			
			 }
			 temp=temp.getNext();
			 ++pos;
		 }
		 
		 return false;
		 
		 }
	 
	 
	
	 }
		 
