package CollectionFramework;

import java.util.*;

public class Name implements Comparable<Name> {
    private final String firstName, lastName;

    public Name(String firstName, String lastName) {
        if (firstName == null || lastName == null)
            throw new NullPointerException();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String firstName() { return firstName; }
    public String lastName()  { return lastName;  }

    public boolean equals(Object o) {
        if (!(o instanceof Name))
            return false;
        Name n = (Name) o;
        return n.firstName.equals(firstName) && n.lastName.equals(lastName);
    }

    public int hashCode() {
        return 31*firstName.hashCode() + lastName.hashCode();
    }

    public String toString() {
	return firstName + " " + lastName;
    }
    public int compareTo(Name n) {
        int lastCmp = lastName.compareTo(n.lastName);
        return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
    }
    public static void main(String[] args)
    {
    	Name N1=new Name("Suyash","Yadav");
    	Name N2=new Name("Amit","Misra");
    	Name N3=new Name("Amit","Misra");
    	
    	System.out.println("Name Object 1: \n"+N1.firstName()+"\n"+N1.lastName()+"\n");
    	System.out.println("Name Object 2: \n"+N2.firstName()+"\n"+N2.lastName()+"\n");
    	System.out.println("Name Object 3: \n"+N3.firstName()+"\n"+N3.lastName()+"\n");
    	
    	System.out.println("Name Object 1 and 2 are equal: \n"+N1.equals(N2));
    	System.out.println("Name Object 2 and 3 are equal: \n"+N2.equals(N3)+"\n");
    	
    	System.out.println("Name Object 1 and 2 when compared: \n"+N1.compareTo(N2));
    	System.out.println("Name Object 2 and 3 when compared: \n"+N2.compareTo(N3)+"\n");
    	
    	System.out.println("HashCode of Name Object 1: \n"+N1.hashCode());
    	System.out.println("HashCode of Name Object 2: \n"+N2.hashCode());
    	System.out.println("HashCode of Name Object 3: \n"+N3.hashCode());
    }
}