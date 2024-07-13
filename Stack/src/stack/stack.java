package stack;

public class stack {
    private int arr[];
	private int top=-1;
    private final int  SIZE;
	
    
	
   public stack(int size) {
		super();
		SIZE = size;
		arr=new int [size];
		top=-1;
	}


	
	public void push(int data)
	{
		top++;
		arr[top]=data;
	}
	
	public int pop()
	{
		return arr[top--];
		
	}
	public int peek()
	{
		return arr[top];
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public boolean isFull()
	{
		return top==(SIZE-1);
	}
}
