package CircularQueue;

public class CircularQueue {

	
	private int arr[];
	private int rear;
	private int front;
	private final int SIZE;
	
	public CircularQueue(int size) {
		super();
		SIZE = size;
		this.arr=new int[SIZE];
		this.front=-1;
		this.rear=-1;
	}	
		public boolean isEmpty()
		{
			return (rear == front) && (rear == -1);
				
		}
		public boolean isFull()
		{
			return (front == -1 && rear ==SIZE-1 ) || (front == rear && rear != -1);
		}
	
		public int Enqueue(int data)
		{
			
			rear=(rear+1)%SIZE;
			return arr[rear]=data;
		
		}
		
		public int Dequeue()
		{
			//front++;
			int data=arr[(front+1)%SIZE];
			front =(front+1)%SIZE;
			return data;
		}
	
		public int peek()
		{
		  return arr[(front+1)%SIZE];
		  
		}
	
	
	
}
