package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class SetInterface_1 {
	public static <T> void display(Set<T> Q)
	{
		for(T t:Q)
		{
			System.out.print(t+"\t");
		}
		System.out.println();
	}
	public static <T extends Shape> void display2(Set<T> Q)
	{
		for(T t:Q)
		{
			System.out.print(t.getName()+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Set<String> c1=new HashSet<>();
		c1.add("alpha");
		c1.add("beta");
		c1.add("delta");
		c1.add("gamma");
		display(c1);
		c1.add("alpha"); //This entry is ignored
		display(c1);
		c1.add("omega");
		display(c1);
		
		Set<Shape> c2=new HashSet<>();
		c2.add(new Shape("Red","Triangle1"));
		c2.add(new Shape("Yellow","Triangle2"));
		display2(c2);		
	}
}
