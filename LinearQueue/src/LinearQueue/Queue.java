package LinearQueue;

public class Queue {

	private int rear;
	private int front;
	int arr[];
	private final int SIZE;
	
	public Queue(int size) {
		super();
		SIZE = size;
		this.arr=new int[size];//assigning size to arr
		this.front=-1;
		this.rear=-1;
	}
	
	public boolean isEmpty()
	{
		return front==rear;
			
	}
	
	public boolean isFull()
	{
		return rear==SIZE-1;
	}
	
	public int enqueue(int data)
	{
	
		rear++;
		return arr[rear]=data;		
	}
	
	public int Dequeue()
	{
		//System.out.println(arr[front]);
		front++;
		 return arr[front];
		
		//return arr[front]=data;
	}
	public int peek()
	{
	  return (arr[front+1]);	
	}
	
	
	
	
}
