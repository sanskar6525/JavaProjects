package CollectionFramework;
import java.util.*;

public class RangeView_1 {
	public static void main(String[] args)
	{
		List<String> L=new ArrayList<>();
		L.add("Alpha");
		L.add("Beta");
		L.add("Gamma");
		
		List<String> Q=L.subList(0, 2);
		System.out.println(Q); //Printing the subList before modification to original
		
		L.remove("Gamma");
		System.out.println(Q); //Printing the subList after modification to original
		
	}

}
