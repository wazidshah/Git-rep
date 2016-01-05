package queue;
import java.util.*;
public class ArrayListQueue implements QueueInterface {

	private ArrayList<Integer> al = new ArrayList<Integer>();
	//private int front=-1,back=-1;
	
	public void Enqueue(int a)
	{
		
			al.add(a);
	}
	
	public void Dequeue()
	{
		if(al.isEmpty())
		{
			System.out.println("Yumty");
		}
		else
		{
		al.remove(0);
		}
	}
	
	public void display()
	{
		
		if(al.isEmpty())
		{
			System.out.println("Yumty");
		}
		else
		{
			for(Integer i:al)
			{
			System.out.println(i);
			}
		}
	}
	
	
}
