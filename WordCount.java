package CollectionFramework;
import java.util.*;
public class WordCount {
	public static SortedSet<String> input()
	{
		System.out.println("Enter the words (Type EXIT to terminate the input):");
		Scanner sc=new Scanner(System.in);
		SortedSet<String> S=new TreeSet<>();
		while(sc.hasNext())
		{
			String input=sc.next().trim();
			if(input.equals("EXIT"))
				break;
			//System.out.println(input);
			S.add(input);
		}
		sc.close();
		return S;
	}
	public static SortedSet<Character> firsts(SortedSet<String> S)
	{
		SortedSet<Character> F=new TreeSet<>();
		for(String s:S)
		{
			F.add(s.charAt(0));
		}
		return F;
	}
	public static Map<String, Integer> maps(SortedSet<String> S)
	{
		Map<String, Integer> M=new HashMap<>();
		SortedSet<Character> J=firsts(S);
		//System.out.println(J);
		for(char A:J)
		{
			char B=(char) (A+1);
			SortedSet<String> Tem=S.subSet(String.valueOf(A), String.valueOf(B)); 
			System.out.println(Tem);
			if(Tem.size()!=0)
				M.put(String.valueOf(A), Tem.size());
		}
		return M;
	}
	public static void main(String[] args)
	{
		SortedSet<String> S=input();
		System.out.println(S+"\n\n");
		Map<String, Integer> M=maps(S);
		System.out.println("\n"+M);
		
	}

}
