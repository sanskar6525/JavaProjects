package CollectionFramework;
import java.util.*;
public class Wrapper_1 {
	public static void main(String[] args)
	{
		List<Integer> S1= Arrays.asList(1,234,23,45,6,88);
		List<Integer> S2=Collections.synchronizedList(S1);
		synchronized(S2)
		{
			for(Integer i:S2)
			{
				System.out.print(i+"\t");
			}
		}
		
	}
}
