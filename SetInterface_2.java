package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface_2 {
	public static <T> void display(Set<T> Q)
	{
		for(T t:Q)
		{
			System.out.print(t+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Set<String> c1=new HashSet<>();
		boolean f=c1.add("alpha");
		System.out.println("Element added: "+f);
		f=c1.add("beta");
		System.out.println("Element added: "+f);
		f=c1.add("delta");
		System.out.println("Element added: "+f);
		f=c1.add("gamma");
		System.out.println("Element added: "+f);
		f=c1.add("gamma"); //Ignores duplicate element and returns false
		System.out.println("Element added: "+f+"\n\nElements present are:");
		display(c1);
		System.out.println("Set conatins "+c1.size()+" elements.\n");
		
		f=c1.remove("gamma");
		System.out.println("Element removed: "+f+"\n\nElements present are:");
		display(c1);
		System.out.println("Set conatins "+c1.size()+" elements.\n");
		
		f=c1.remove("omega"); //Returns false if the asked element is already non-existing
		System.out.println("Element removed: "+f+"\n");
		
		System.out.println("Set contains gamma in it: "+c1.contains("gamma")+"\n");
		
		
		Iterator<String> iter=c1.iterator();
		while(iter.hasNext())
		{
			String temp=iter.next();
			System.out.println(temp);
		}
		System.out.println("\n");	
	}
}
