package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class BulkOperations {
	public static void display(Collection<Shape> t)
	{
		String combined=t.stream().map(e ->e.getName()).collect(Collectors.joining(", "));
		System.out.println(combined+"\n");
	}
	public static void main(String[] args)
	{
		List<Shape> c1=new ArrayList<>();
		c1.add(new Shape("Red","Triangle1"));
		c1.add(new Shape("Yellow","Triangle2"));
		c1.add(new Shape("Green","Triangle3"));
		c1.add(new Shape("Blue","Triangle4"));
		c1.add(new Shape("Red","Square5"));
		
		List<Shape> c2=new ArrayList<>();
		c2.add(new Shape("Yellow","Square6"));
		c2.add(new Shape("Green","Square7"));
		c2.add(new Shape("Blue","Square8"));
		c2.add(new Shape("Red","Circle9"));
		c2.add(new Shape("Yellow","Circle10"));
		
		System.out.println("Collection 1:");
		display(c1);
		
		System.out.println("Collection 2:");
		display(c2);
		
		//Adding elements
		List<Shape> c3=new ArrayList<>();
		boolean f=c3.addAll(c1); //Adding all elements from c1 to c3
		f=c3.addAll(c2); //Adding all elements from c2 to c3
		System.out.println("Collection 3(after adding Collection 1 and 2): "+f);
		display(c3);
		
		//Removing elements
		f=c3.removeAll(c1); //Removing all elements of Collection 1 from Collection 3
		System.out.println("Collection 3(after removing Collection 2):"+f);
		display(c3);
		
		c3.add(new Shape("TEST","TEST"));
		System.out.println("Updated Collection 3:");
		display(c3);
		
		//Retaining elements
		f=c3.retainAll(c2); //Retaining only those elements in c3 which are also present in c2
		System.out.println("Collection 3(after retaining Collection 2):"+f);
		display(c3);
		
		f=c3.retainAll(c2); //Retaining only those elements in c3 which are also present in c2
		System.out.println("Collection 3(after retaining Collection 2):"+f);
		display(c3);
		
		//Clearing elements
		c3.clear();
		System.out.println("Collection 3(after clearing):"); //Clearing all elements in Collection 3
		display(c3);
	
	}
}
