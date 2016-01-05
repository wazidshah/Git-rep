package queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayQueue a = new ArrayQueue();
		ArrayListQueue al = new ArrayListQueue();
		LinkedQueue l = new LinkedQueue();
		
		if(l.Dequeue() == false)
		{
			System.out.println("Gu Kha");
			
		}
	}
	

}
