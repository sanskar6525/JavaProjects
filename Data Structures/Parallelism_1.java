package CollectionFramework;
import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

import BasicClasses.Person;
public class Parallelism_1  {
	public static void main(String[] args)
	{
		List<Person> R=	Person.createRoster();
		Map<Person.Gender, List<Person>> byGender1 =
			    R.stream()
			        .collect(
			            Collectors.groupingBy(Person::getGender));
		
		System.out.println(byGender1+"\n\n");
		
		
		ConcurrentMap<Person.Gender, List<Person>> byGender2 =
			    R.parallelStream()
			        .collect(
			            Collectors.groupingByConcurrent(Person::getGender));
		
		System.out.println(byGender2+"\n\n");
		
	}

}
