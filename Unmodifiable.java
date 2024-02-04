package CollectionFramework;
import java.util.*;
public class Unmodifiable {

	public static void main(String[] args) {
		List<Integer> S1= Arrays.asList(1,234,23,45,6,88);
		S1.add(2);
		
		List<Integer> S2=Collections.unmodifiableList(S1);
		S2.add(1222);
		

	}

}
