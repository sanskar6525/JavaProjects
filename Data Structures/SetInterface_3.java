package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class SetInterface_3 {
	public static <T> void display(Set<T> Q)
	{
		System.out.println();
		for(T t:Q)
		{
			System.out.print(t+"\t");
		}
		System.out.println("\n");
	}
	public static void main(String[] args)
	{
		Set<String> c1=new HashSet<>();
		c1.add("alpha");
		c1.add("delta");
		c1.add("beta");
		c1.add("gamma");
		
		Set<String> c2=new HashSet<>();
		c2.add("alpha2");
		c2.add("delta2");
		c2.add("beta2");
		c2.add("gamma2");
		
		Set<String> c3=new HashSet<>();
		c3.add("alpha2");
		c3.add("delta2");
		c3.add("beta2");
		c3.add("gamma2");
		c3.add("omega2");
		
		Set<String> c4=new HashSet<>();
		
		c3.add("alpha2");
		display(c3);
		System.out.println("c2 is a subset of c3:"+c3.containsAll(c2));
		System.out.println("c3 is a subset of c2:"+c2.containsAll(c3));
		c4.addAll(c2);
		c2.addAll(c3);
		display(c2);
		c3.removeAll(c4);
		display(c3);
	}
}
