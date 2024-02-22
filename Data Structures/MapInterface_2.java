package CollectionFramework;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
public class MapInterface_2 {
	public static void main(String[] args)
	{
		Map<Integer, String> M1=new HashMap<>();
		Map<Integer, String> M2=new HashMap<>();
		Map<Integer, String> M3=new HashMap<>();
		Map<Integer, String> M4=new HashMap<>(); 
		
		M1.put(1, "Pulkit");
		M1.put(2, "Ashneer");
		M1.put(3, "Shashank");
		M1.put(4, "Rupak");
		
		M2.put(1, "Daksh");
		M2.put(2, "Kay");
		M2.put(3, "Jughead");
		M2.put(4, "Archie");
		
		M3.put(11, "Pulkit");
		M3.put(22, "Ashneer");
		M3.put(33, "Shashank");
		M3.put(44, "Rupak");
		
		M4.put(1, "Pulkit");
		M4.put(2, "Ashneer");
		M4.put(3, "Shashank");
		M4.put(4, "Rupak");
		
		//Checking for the entire Map
		if (M1.entrySet().containsAll(M2.entrySet())) {
		    System.out.println("M1 and M2 have the same entry set.");
		}
		if (M1.entrySet().containsAll(M3.entrySet())) {
		    System.out.println("M1 and M3 have the same entry set.");
		}
		if (M1.entrySet().containsAll(M4.entrySet())) {
		    System.out.println("M1 and M4 have the same entry set.");
		}
		System.out.println();
				
		//Checking for the Key Set of the Map
		if (M1.keySet().containsAll(M2.keySet())) {
			System.out.println("M1 and M2 have the same Key set.");
		}
		if (M1.keySet().containsAll(M3.keySet())) {
			System.out.println("M1 and M3 have the same Key set.");
		}
		if (M1.keySet().containsAll(M4.keySet())) {
			System.out.println("M1 and M4 have the same Key set.");
		}
		System.out.println();
		
		//Checking for the Values of the Map
		if (M1.values().containsAll(M2.values())) {
			System.out.println("M1 and M2 have the same values.");
		}
		if (M1.values().containsAll(M3.values())) {
			System.out.println("M1 and M3 have the same values.");
		}
		if (M1.values().containsAll(M4.values())) {
			System.out.println("M1 and M4 have the same values.");
		}
		
	}

}
