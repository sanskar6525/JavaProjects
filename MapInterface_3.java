package CollectionFramework;

import java.util.*;
public class MapInterface_3 {
	public static Set<String> required()
	{
		Set<String> r=new HashSet<>();
		r.add("C1");
		r.add("RQ");
		r.add("OT");
		return r;
	}
	public static Set<String> legal()
	{
		Set<String> r=new HashSet<>();
		r.add("C1");
		r.add("RQ");
		r.add("OT");
		r.add("A1");
		r.add("EW");
		r.add("WQ");
		r.add("ESS");
		r.add("TRW");
		return r;
	}
	public static <K,T> boolean results(Map<K,T> M, Set<K> R, Set<K> L)
	{
		boolean allow=true;
		//System.out.println(allow);
		Set<K> keys=M.keySet();
		
		if(!keys.containsAll(R))
		{
			Set<K> missing=new HashSet<>(R);
			missing.removeAll(keys);
			System.out.println("Missing attributes: " + missing);
	        allow= false;
		}
		
		if(!L.containsAll(keys))
		{
			Set<K> illegal=new HashSet<>(keys);
			illegal.removeAll(L);
			System.out.println("Illegal attributes: " + illegal);
			allow=false;
		}
		return allow;
	}
	public static void main(String[] args)
	{
		Set<String> req=required();
		Set<String> legal=legal();
		
		Map<String, Integer> M1=new HashMap<>();
		M1.put("C1", 12);
		M1.put("RQ", 2);
		M1.put("OT", 98);
		M1.put("WQ", 1221);
		M1.put("TRW", 12212);
		
		Map<String, Integer> M2=new HashMap<>();
		M2.put("C1", 12);
		M2.put("RQ", 2);
		M2.put("ABDSDHJ", 98);
		M2.put("WQ", 1221);
		M2.put("TRW", 12212);
		
		
		Map<String, Integer> M3=new HashMap<>();
		M3.put("EW", 12);
		M3.put("ESS", 2);
		M3.put("A1", 98);
		M3.put("WQ", 1221);
		M3.put("TRW", 12212);
		
		
		System.out.println(M1);
		boolean res=results(M1,req,legal);
		System.out.println("Production of M1 is possible: "+res+"\n");
		
		System.out.println(M2);
		res=results(M2,req,legal);
		System.out.println("Production of M2 is possible: "+res+"\n");
		
		System.out.println(M3);
		res=results(M3,req,legal);
		System.out.println("Production of M3 is possible: "+res+"\n");
	}

}
