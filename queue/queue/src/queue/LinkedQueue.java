package queue;
import java.util.LinkedList;;
public class LinkedQueue implements QueueInterface{

	private LinkedList<Integer> l = new LinkedList<Integer>();
	
	public void Enqueue(int a)
	{
		l.addLast(a);
	}
	
	public void Dequeue()
	{
		if(l.isEmpty())
		{
			System.out.println("Yumty Linked List");
		}
		else
		{
			l.removeFirst();
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
