package CollectionFramework;
import java.util.*;
public class Sets {
	public static void main(String[] args)
	{
		Set<Integer> S1=new HashSet<>();
		S1.add(123);
		S1.add(24455);
		S1.add(3);
		S1.add(44);
		S1.add(51343);
		S1.add(64);
		
		SortedSet<Integer> S2=new TreeSet<>();
		S2.add(123);
		S2.add(24455);
		S2.add(3);
		S2.add(44);
		S2.add(51343);
		S2.add(64);
		
		Iterator<Integer> it1=S1.iterator();
		while(it1.hasNext())
		{
			int t=it1.next();
			System.out.print(t+"\t");
		}
		System.out.println("\n\n\n");
		Iterator<Integer> it2=S2.iterator();
		while(it2.hasNext())
		{
			int t=it2.next();
			System.out.print(t+"\t");
		}
		System.out.println("\n\n\n");
		Integer[] array1 = S1.toArray(new Integer[S1.size()]);
		Integer[] array2 = S2.toArray(new Integer[S1.size()]);

        // Print the array
        for (Integer element : array1) {
            System.out.println(element);
        }
        System.out.println("\n\n\n");
        for (Integer element : array2) {
            System.out.println(element);
        }
	}
}
