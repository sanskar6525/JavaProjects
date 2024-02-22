package CollectionFramework;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class MapInterface_1 {
	public static List<Employee> create()
	{
		List<Employee> d=new ArrayList<>();
		d.add(new Employee("Suresh",23004,"CTG"));
		d.add(new Employee("Manish",20000,"Storage"));
		d.add(new Employee("Surendra",23004,"GIT"));
		d.add(new Employee("Rohit",100000,"VI"));
		d.add(new Employee("Sourab",56789,"GT"));
		d.add(new Employee("Tanmay",90000,"VI"));
		d.add(new Employee("Samay",4567,"GIT"));
		d.add(new Employee("Rahul",2000,"GIT"));
		d.add(new Employee("Sree",67008,"Storage"));
		d.add(new Employee("Sanskar",150678,"CTG"));
		return d;
	}
	public static void main(String[] args)
	{
		List<Employee> details=create();
		Map<String,Employee> data=new HashMap<>();
		int size=details.size();
		Integer i=1;
		//System.out.println(size);
		for(Employee T:details)
		{
			String id=i.toString();
			id=(i<=9)?("0"+id):id;
			data.put(id,T);
			i++;
		}
		Set<String> a=data.keySet();
		a.stream().forEach(e -> System.out.println(e+" ------ "+data.get(e).name+" ["+data.get(e).de+"] ("+data.get(e).s+")"));
		
		System.out.println();
		Collection<Employee> t=data.values();
		t.stream().forEach(f ->System.out.println(f));
		
		System.out.println();
		Set<Entry<String, Employee>> temp=data.entrySet();
		temp.stream().forEach(f ->System.out.println(f));
		//Map<String, Integer> G1=data.stream().collect(Collectors.groupingBy(e ->e.de));
	}

}
