package CollectionFramework;
import java.util.*;
public class ConversionConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> C1=new HashSet<Integer>();
		C1.add(12);
		C1.add(21332);
		List<Integer> L1=new ArrayList<>(C1);
		System.out.println(L1);
		
		HashSet<String> C2=new HashSet<>();
		C2.add("Test1");
		List<String> L2=new ArrayList<>(C2);
		System.out.println(L2);
		
		List<String> L3=new ArrayList<>();
		L3.add("dfdt");
		L3.add("tomcat");
		L3.add("Dfdt");
		L3.add("a");
		System.out.println(L3);
		Collection<String> noDups = new HashSet<>(L3);
		System.out.println(noDups);
		
		
	}

}
