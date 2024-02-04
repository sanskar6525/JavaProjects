package CollectionFramework;

import java.util.*;

public class MapInterface_4 {
	public static String sort(String s) 
	{
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
	 public static List<String> generateAnagrams(String word) {
	        List<String> result = new ArrayList<>();
	        char[] characters = word.toCharArray();

	        // Call the recursive helper function
	        generateAnagramsRecursive(characters, 0, result);

	        return result;
	    }
	 private static void generateAnagramsRecursive(char[] characters, int index, List<String> result) {
	        if (index == characters.length - 1) {
	            // Reached the end of the character array, add the formed word to the result
	            result.add(String.valueOf(characters));
	        } else {
	            for (int i = index; i < characters.length; i++) {
	                // Swap the characters
	                swap(characters, index, i);

	                // Recursively generate anagrams for the remaining characters
	                generateAnagramsRecursive(characters, index + 1, result);

	                // Undo the swap to backtrack
	                swap(characters, index, i);
	            }
	        }
	    }
	 private static void swap(char[] characters, int i, int j) {
	        char temp = characters[i];
	        characters[i] = characters[j];
	        characters[j] = temp;
	    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> u = new HashSet<>();
        Map<String, List<String>> M=new HashMap<>();
        while (true) {
            String input = scanner.nextLine().trim(); 
            if (input.isEmpty()) {
                break; // Exit the loop if input line is empty
            }
            String a=sort(input);
            List<String> l = M.get(a);
            if (l == null)
            {
            	List<String> L=generateAnagrams(a);
            	M.put(a, L);
            } 
            u.add(input);
        }
        scanner.close();
        System.out.println("The input set is as follows: "+u+"\n");
        System.out.println("The results are as follows: \n"+M);
    }
}
        