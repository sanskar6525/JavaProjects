package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3};
		List<List<Integer>> L=new ArrayList<>();
		L=subset(arr);
		for(List<Integer> T:L)
		{
			System.out.println(T);
		}

	}
	public static List<List<Integer>> subset(int []arr)
	{
		List<List<Integer>> outer=new ArrayList<>();
		outer.add(new ArrayList<>());
		for(int num:arr)
		{
			int size=outer.size();
			for(int i=0;i<size;i++)
			{
				List<Integer> internal=new ArrayList<Integer>(outer.get(i));
				internal.add(num);
				outer.add(internal);
			}
		}
		return outer;
	}

}
