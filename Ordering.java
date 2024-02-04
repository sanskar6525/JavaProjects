package CollectionFramework;
import java.util.*;
public class Ordering {
	public static void main(String[] args)
	{
	
		List<Integer> listOfIntegers =Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("listOfIntegers:");
		listOfIntegers.stream()
		    .forEach(e -> System.out.print(e + " "));
		System.out.println("\n\n");
		
		System.out.println("listOfIntegers sorted in reverse order:");
		Comparator<Integer> normal = Integer::compare;
		Comparator<Integer> reversed = normal.reversed(); 
		Collections.sort(listOfIntegers, reversed);  
		listOfIntegers
		    .stream()
		    .forEach(e -> System.out.print(e + " "));
		System.out.println("\n\n");
	
		
		System.out.println("Parallel stream");
		listOfIntegers
		    .parallelStream()
		    .forEach(e -> System.out.print(e + " "));
		System.out.println("\n\n");
		
		System.out.println("Another parallel stream:");
		listOfIntegers
		    .parallelStream()
		    .forEach(e -> System.out.print(e + " "));
		System.out.println("\n\n");
		
		System.out.println("With forEachOrdered:");
		listOfIntegers
		    .parallelStream()
		    .forEachOrdered(e -> System.out.print(e + " "));
		System.out.println("");
	}

}
