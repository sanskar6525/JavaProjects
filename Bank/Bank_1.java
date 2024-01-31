package Bank;
import java.util.*;
public class Bank_1 //For implementing a bank setup using local and anonymous classes
{
	String name; //Declaring the instance variables
	double bal;
	String type;
	int id;
	static int b_id=00; //Declaring the class variables
	static double i1=10.0; 
	static double i2=8.0;
	static double i3=7.5;
	
	interface D  //Interface to the anonymous class being used
	{
		public void display();
	}
	public Bank_1(String n, double r, String t) //Parameterized Constructor to set values into the instance variables
	{
		name=n;
		bal=r;
		type=t;
		b_id++;
		id=b_id;
	}
	public void input() //Method to display list of different actions available for user
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("Hello "+this.name+",");
		System.out.println("Select the operation you want to perform :");
		System.out.println("Enter 1 to view your details "
				+ "\nEnter 2 to deposit money "
				+ "\nEnter 3 to withdraw moeny "
				+ "\nEnter 4 to opt for a loan "
				+ "\nEnter 0 to exit \n");
		ch=sc.nextInt();
		this.Operations(ch);
		System.out.println("Hello World");
	}
	public void Transactions(int c) //Method to perform all kinds of transactions including debit and credit
	{
		Scanner sc=new Scanner(System.in);
		class changes  //Local class to perform deposit and withdrawal operations
		{
			public void add() //Local class method to add money to account
			{
				System.out.println("Enter the amount to deposit: ");
				double am=sc.nextDouble();
				bal=bal+am;
				System.out.println("Your new balance is "+bal+" rupees.\n");
			}
			public void sub()  //Local class method to deduct money from account
			{
				System.out.println("Enter the amount you want to withdraw: ");
				double am=sc.nextDouble();
				bal=bal-am;
				System.out.println("Your new balance is "+bal+" rupees.\n");
			}
		}
		changes ob=new changes(); //Object creation for the local class
		if(c==2)
			ob.add(); //Invoking local class methods
		else
			ob.sub(); //Invoking local class methods
	}
	public void Operations(int ch) //Method to perform all different operations
	{
		Scanner sc=new Scanner(System.in);
		if(ch==1)
		{
			//Anonymous Class implementing the interface to display customer details
			D details=new D() { 
				public void display()
				{
					System.out.println("Name: "+name+"\nBank ID: "+id+"\nAccount type: "+type+"\nBalance Amount: "+bal+"\n");
				}
			};
			details.display();
			this.input();
		}
		else if((ch==2)||(ch==3))
		{
			Transactions(ch);
			this.input();
		}
		else if(ch==4)
		{
			System.out.println("Enter loan amount: ");
			double p=sc.nextDouble();
			System.out.println("Enter loan period in years: ");
		    int  n=sc.nextInt();
		  //Anonymous Class implementing the interface to display interest
		    D IN=new D(){
				public void display()
				{
					double si=0.0;
					if(type=="SAVINGS")
						si=(p*n*i1)/100.0;
					else if(type=="CURRENT")
						si=(p*n*i2)/100.0;
					else
						si=(p*n*i3)/100.0;
					System.out.println("For the required amount and tenure, you need to pay an interest of "+si+" rupees.\n");
				}
			};
			IN.display();
			this.input();
		}
		else
		{
			System.out.println("Thanks for banking with us!!\n");
		}
	}
	public static void main(String[] args)
	{
		Bank_1 obj1=new Bank_1("Subhash", 0,"SAVINGS");
		Bank_1 obj2=new Bank_1("Anil", 12340,"CURRENT");
		Bank_1 obj3=new Bank_1("Jack", 4567,"RECURRING");
		obj1.input();
		obj2.input();
		obj3.input();
	}
	
}
