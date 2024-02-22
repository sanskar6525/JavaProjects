package CollectionFramework;
import java.util.*;

public class RangeView_2 {
	public static void main(String[] args)
	{
		SortedSet<String> S=new TreeSet<>();
		S.add("Beta");
		S.add("Gamma");
		S.add("Alpha");
		
		System.out.println(S);
		SortedSet<String> Q=S.subSet("Alpha", "Gamma");
		System.out.println(Q); //Printing the subList before modification to original
		
		S.remove("Gamma");
		System.out.println(Q); //Printing the subList after modification to original
		
		S.add("Gamma");
		S.subSet("A", "B").clear();
		System.out.println(S);
		
		SortedSet<String> v1 = S.headSet("Gamma");
		SortedSet<String> v2 = S.tailSet("Beta");
		System.out.println(v1);
		System.out.println(v2);
		
		String la=S.last();
		String fi=S.first();
		System.out.println("First: "+fi+"  Last: "+la);
		
	}
}
