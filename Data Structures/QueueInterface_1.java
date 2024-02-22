package CollectionFramework;

import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;
public class QueueInterface_1 {
	public static void main(String[] args)
	{
		Queue<String> q1=new LinkedList<>();
		System.out.println("Is the Queue empty: "+q1.isEmpty());
		
		//Storing the head of the queue
		//String head1=q1.element(); //Returns an exception if there is no head
		String head2=q1.peek(); //Returns null if there is no head
		//System.out.println("Head of the queue is: "+head1); 
		System.out.println("Head of the queue is: "+head2);
		
		q1.add("A1");
		q1.add("B2");
		String head1=q1.element();
		System.out.println("Head of the queue after adding an element is: "+head1); 
		//q1.remove();
		//q1.poll();
		
		Iterator<String> T=q1.iterator();
		while(T.hasNext())
		{
			System.out.println(T.next());
		}

	}

}
