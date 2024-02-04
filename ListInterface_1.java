package CollectionFramework;
import java.util.List;
import java.util.ArrayList;
public class ListInterface_1 {
	public static <T> void display(List<T> L)
	{
		for(T temp:L)
		{
			System.out.print(temp+"\t");
		}
		System.out.println("\n");
	}
	public static void main(String[] args)
	{
		List<String> L1=new ArrayList<String>();
		L1.add("Anmol");
		L1.add("Tanya");
		L1.add("Raunak");
		L1.add("Ramesh");
		System.out.println("List 1: ");
		display(L1);
		
		List<String> L2=new ArrayList<String>();
		L2.add("0");
		L2.add("1");
		L2.add("TEST");
		L2.add("2");
		L2.add("3");
		L2.add("TEST");
		System.out.println("List 2: ");
		display(L2);
	
		List<String> L3=new ArrayList<String>(L1);
		L3.addAll(L2);
		System.out.println("List 3: ");
		display(L3);
		
		L3.remove("TEST"); //Removes the first occurrence of the specified element
		System.out.println("List 3: ");
		display(L3);
	}
}
