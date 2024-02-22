package CollectionFramework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
public class ObjectOrdering {
	public static void main(String[] args) throws ParseException
	{
		Set<String> S=new HashSet<>(Arrays.asList("jacket", "noble", "java", "fault", "newspaper", "faith"));
		List<Character> C=new LinkedList<>(Arrays.asList('A', 'M','Z', 'B','E','C','O'));
		Queue<Integer> Q=new LinkedList<>(Arrays.asList(1,23,14,33,6,0));
		Map<Date,String> M=new HashMap<>();
		M.put(new Date(2023, 10, 1), "Ayush");
	    M.put(new Date(2023, 5, 31), "Suyash");
	    M.put(new Date(2000,8, 12), "Laxman");
	    
		String dateString = "2021-01-01";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date parsedDate = dateFormat.parse(dateString);
		System.out.println(parsedDate);
		
		System.out.println("Before Sorting: ");
		System.out.println("Set: "+S);
		System.out.println("List: "+C);
		System.out.println("Queue: "+Q);
		System.out.println("Map: "+M+"\n\n");
		
		//Sorting a Set
		List<String> sortedList1 = new ArrayList<>(S);
        Collections.sort(sortedList1);
        Set<String> SS = new LinkedHashSet<>(sortedList1);
		
        //Sorting a List
		Collections.sort(C); 
		
		//Sorting a Queue
		List<Integer> sortedList2 = new ArrayList<>(Q);
		Collections.sort(sortedList2);
		Queue<Integer> SQ = new LinkedList<>(sortedList2);
		
		//Sorting a Map
		Map<Date,String> SM = M.entrySet().stream().sorted(Map.Entry.comparingByKey())
	            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	                (oldValue, newValue) -> oldValue, LinkedHashMap::new));
	     
		
		System.out.println("After Sorting: ");
		System.out.println("Set: "+SS);
		System.out.println("List: "+C);
		System.out.println("Queue: "+SQ);
		System.out.println("Map: "+SM);
		
	}

}
