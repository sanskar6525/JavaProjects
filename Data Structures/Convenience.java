package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Convenience {

	public static void main(String[] args) {
		List<Integer> L1= Arrays.asList(1,234,23,45,6,88);
		System.out.println("L1 : "+L1+"\n");
		
		List<String> L2=new ArrayList<>(Collections.nCopies(10, "Height!"));
		System.out.println("L2 : "+L2+"\n");
		List<Integer> L3=new ArrayList<>(Collections.nCopies(5,99));
		System.out.println("L3 : "+L3+"\n");
		
	
		
		List<Integer> L11 = new ArrayList<>();
		List<Integer> L33 = new ArrayList<>();
		L33.add(1);
		L33.add(2);
		L33.add(3);
		L11.add(445);
		L11.addAll(L33);
		System.out.println("L11: " + L11);
		

	}

}
