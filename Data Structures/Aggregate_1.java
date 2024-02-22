package CollectionFramework;
import java.util.*;

public class Aggregate_1 {
	public static int count(int n)
	{
		int m=n;
		int c=0;
		while(m!=0)
		{
			m=m/10;
			c++;
		}
		return c;
	}
	public static void main(String[] args)
	{
		List<Integer> L=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		//Sum of all elements
		int sum1=L.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of all elements is "+sum1+"\n");
		
		//Sum of all single digit numbers
		int sum2=L.stream().filter(element ->count(element)==1).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of all single digit elements is "+sum2+"\n");
		
		//Sum of all double digit numbers
		int sum3=L.stream().filter(element ->count(element)==2).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of all double digit elements is "+sum3+"\n");
		
		//Print the greatest element
		int max=L.stream().mapToInt(Integer::intValue).max().getAsInt();
		System.out.println("The greatest element in the collection is "+max+"\n");
	}
	

}
