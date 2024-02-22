package CollectionFramework;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class StreamReduce {
	public static void main(String[] args)
	{
		List<Integer> L=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		Integer sum = L.stream().reduce(0,(a, b) -> a + b);
		System.out.println(sum+"\n");
		
		List<String> S=Arrays.asList("A","p","p","l","e");
		String c="";
		for(String s:S)
		{
			c=c+s;
		}
		System.out.println(c+"\n");
		
		String concat=S.stream().reduce("",(res,pre)->res+pre);
		System.out.println(concat+"\n");
		
		 List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

	        double average = numbers.stream()
	                                .reduce(0, (a, b) -> a + b)
	                                .doubleValue() / numbers.size();

	        System.out.println("Average: " + average);
	}
}
