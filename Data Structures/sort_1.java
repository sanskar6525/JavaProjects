package CollectionFramework;
import java.util.*;

public class sort_1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	List<String> list =new ArrayList<>();
    	String s=sc.next();
    	while(!(s.equals("END")))
    	{
    		list.add(s);
    		s=sc.next();
    	}
    	Collections.sort(list);
        System.out.println(list);
    }
}
