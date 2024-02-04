package CollectionFramework;
import java.util.*;
public class EnumSet_1 {
	public static void main(String[] args)
	{

		enum Day {
		    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
		}

		// Creating an EnumSet
		EnumSet<Day> weekendSet = EnumSet.of(Day.SATURDAY, Day.SUNDAY);

		// Adding enum constants to EnumSet
		EnumSet<Day> weekdaysSet = EnumSet.range(Day.MONDAY, Day.FRIDAY);
		weekdaysSet.add(Day.WEDNESDAY);

		// Checking if an EnumSet contains an enum constant
		boolean containsMonday = weekdaysSet.contains(Day.MONDAY);
		System.out.println(containsMonday);

		// Iterating over an EnumSet
		for (Day day : weekendSet) {
		    System.out.println(day);
		}

	}

}
