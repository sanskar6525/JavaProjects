package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Traversal_1 
{
	public static void main(String[] args)
	{
		Collection<Shape> c1=new ArrayList<>();
		c1.add(new Shape("Red","Triangle1"));
		c1.add(new Shape("Yellow","Triangle2"));
		c1.add(new Shape("Green","Triangle3"));
		c1.add(new Shape("Blue","Triangle4"));
		c1.add(new Shape("Red","Square5"));
		c1.add(new Shape("Yellow","Square6"));
		c1.add(new Shape("Green","Square7"));
		c1.add(new Shape("Blue","Square8"));
		c1.add(new Shape("Red","Circle9"));
		c1.add(new Shape("Yellow","Circle10"));
		c1.add(new Shape("Green","Circle11"));
		c1.add(new Shape("Blue","Circle12"));
		
		//Way 1 to traverse : Aggregate Operations
		c1.stream().forEach(e -> System.out.println(e.getName())); //Printing all the names of the Shape objects
		System.out.println("\n");
		
		c1.stream()
		.filter(e ->e.getColor()=="Red")
		.forEach(e -> System.out.println(e.getName())); //Printing all the names of the Shape objects whose color is Red*/
		
		
		c1.parallelStream().forEach(e -> System.out.println(e.getName())); //Printing all the names of the Shape objects
		System.out.println("\n");

		c1.parallelStream()
		.filter(e ->e.getColor()=="Red")
		.forEach(e -> System.out.println(e.getName())); //Printing all the names of the Shape objects whose color is Red
		System.out.println("\n");
		
		
		String combined=c1.stream().map(e ->e.getName()).collect(Collectors.joining(", "));
		System.out.println(combined);
		System.out.println("\nWay 2");
		
		//Way 2 to traverse : for-each construct
		for(Shape s:c1)
		{
			System.out.println(s.getName());
		}
		System.out.println("\nWay 3");
		
		//Way 3 to traverse : Iterators
		Iterator<Shape> iter=c1.iterator();
		while(iter.hasNext())
		{
			Shape temp=iter.next();
			System.out.println(temp.getName());
		}
		System.out.println("\n");		
	}

}
