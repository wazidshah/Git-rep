package queue;



public class ArrayQueue implements QueueInterface{

	private int []queue = new int [100];
	private int front=-1,back=-1;
	
	
	public boolean Enqueue(int a)
	{
		if(queue.length <100)
		{
		
		if(front==-1 && back==-1)
		{
			front+=1;
			back+=1;
			queue[back]=a;
			return true;
		}
		else
		{
			back+=1;
			queue[back]=a;
			return true;
		}
		}
		else
		{
			return false;
		}
	}
	
	public boolean Dequeue()
	{
		@SuppressWarnings("unused")
		int temp=0;
		if(front==-1 && back==-1)
		{
			//System.out .println("No elements to pop");
			return  false;
			
		}
		else
		{
			
			temp=queue[front];
			
			front+=1;
			return true;
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
