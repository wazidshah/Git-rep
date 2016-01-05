package queue;


public class ArrayQueue implements QueueInterface{

	private int []queue = new int [100];
	private int front=-1,back=-1;
	
	
	public void Enqueue(int a)
	{
		if(front==-1 && back==-1)
		{
			front+=1;
			back+=1;
			queue[back]=a;
		}
		else
		{
			back+=1;
			queue[back]=a;
		}
	}
	
	public void Dequeue()
	{
		int temp=0;
		if(front==-1 && back==-1)
		{
			System.out .println("No elements to pop");
			
		}
		else
		{
			
			temp=queue[front];
			
			front+=1;
			
		}
		
	}
	
	public void display()
	{
		if(front==-1 && back==-1)
		{
			System.out.println("No Elements");
		}
		else
		{
			for(int i=front;i<=back;i++)
			{
				System.out.println(queue[i]);
			}
		}
	}
}
