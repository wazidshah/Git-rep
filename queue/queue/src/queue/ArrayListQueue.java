package queue;
import java.util.*;
public class ArrayListQueue implements QueueInterface {

	private ArrayList<Integer> al = new ArrayList<Integer>();
	//private int front=-1,back=-1;
	
	
	
	public boolean Enqueue(int a)
	{
		
			al.add(a);
			return true;
	}
	
	public boolean Dequeue()
	{
		if(al.isEmpty())
		{
			//System.out.println("Yumty");
			return false;
		}
		else
		{
		al.remove(0);
		return true;
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
