package queue;
import java.util.LinkedList;;
public class LinkedQueue implements QueueInterface{

	private LinkedList<Integer> l = new LinkedList<Integer>();
	
	public boolean Enqueue(int a)
	{
		l.addLast(a);
		return true;
	}
	
	public boolean Dequeue()
	{
		if(l.isEmpty())
		{
			//System.out.println("Yumty Linked List");
			return false;
		}
		else
		{
			l.removeFirst();
			return true;
		}
		
	}
	
	public void display()
	{
		if(l.isEmpty())
		{
			System.out.println("Yumty Linked List");
		}
		else
		{
			for(Integer i:l)
			{
				System.out.println(i);
			}
		}
	}
	
}
