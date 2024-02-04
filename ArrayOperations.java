package CollectionFramework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayOperations {
	public static void display(Object[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" : ");
			Shape t=(Shape) a[i];
			System.out.println(t.getName());
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Collection<Shape> c1=new ArrayList<>();
		c1.add(new Shape("Red","Triangle1"));
		c1.add(new Shape("Yellow","Triangle2"));
		c1.add(new Shape("Green","Triangle3"));
		c1.add(new Shape("Blue","Triangle4"));
		Collection<String> c2=new ArrayList<>(Arrays.asList("A","B","C"));
		
		Object[] ar1=c1.toArray();
		display(ar1);
		
		String[] a = c2.toArray(new String[0]);
		for(String s:a)
		{
			System.out.println(s);
		}
	}
}
