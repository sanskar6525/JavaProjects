package CollectionFramework;
import java.util.*;
public class TreeSet_1 {
	public static void main(String[] args) {
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("Banana");
        collection1.add("Mango");
        collection1.add("Apple");
        
        SortedSet<String> sortedSet1 = new TreeSet<>();
        sortedSet1.add("Banana");
        sortedSet1.add("Mango");
        sortedSet1.add("Apple");

        Collection<Integer> collection2 = new ArrayList<>();
        collection2.add(10);
        collection2.add(5);
        collection2.add(12);
        
        SortedSet<Integer> sortedSet2 = new TreeSet<>();
        sortedSet2.add(10);
        sortedSet2.add(5);
        sortedSet2.add(12);

      
        TreeSet<String> treeSet1 = new TreeSet<>(collection1);
        TreeSet<String> treeSet2 = new TreeSet<>(sortedSet1);
        TreeSet<Integer> treeSet3 = new TreeSet<>(collection2);
        TreeSet<Integer> treeSet4 = new TreeSet<>(sortedSet2);
        
        
        
        System.out.println("TreeSet1 with natural ordering: " + treeSet1);
        System.out.println("TreeSet1 from SortedSet: " + treeSet2);
        
        System.out.println("TreeSet2 with natural ordering: " + treeSet3);
        System.out.println("TreeSet2 from SortedSet: " + treeSet4);
      
        Comparator<String> lengthComparator = Comparator.comparingInt(String::length);
        TreeSet<String> treeSet = new TreeSet<>(lengthComparator);

        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Mangoes");

        System.out.println("TreeSet with custom Comparator: " + treeSet);
      
    }

}
