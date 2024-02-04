package CollectionFramework;
import java.util.*;
public class Collect_1 {
	public static void main(String[] args)
	{
		List<Integer> Age=Arrays.asList(12,34,55,22,21,19,23,45,44,60);
		
		Averager averageCollect = Age.stream().collect(Averager::new, Averager::accept, Averager::combine);
  
		System.out.println("Average age of male members: " +averageCollect.average());
	}

}
