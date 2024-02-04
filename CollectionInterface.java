package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInterface 
{
	public static void main(String[] args)
	{
		Collection<String> c1 = new ArrayList<>();
		c1.add("Hello");
		c1.add("World");
		List<String> list = new ArrayList<>(c1); //Conversion Constructor
		System.out.println(list.get(0)+" and "+list.get(1));
		
		List<String> list2=new ArrayList<>();
		list2.add("Hello");
		list2.add("World");
		System.out.println(list2.get(0)+" and "+list2.get(1));
	}	

}
