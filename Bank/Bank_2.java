package Bank;
import java.util.*;
public class Bank_2 {
	
	String name; //Declaring the instance variables
	double bal;
	String type;
	int id;
	static int b_id=00; //Declaring the class variables
	static double i1=10.0; 
	static double i2=8.0;
	static double i3=7.5;
	
	interface D  //Functional Interface
	{
		 public void display();
	}
	public void info(D a)
	{
		a.display();
	}
	interface T  //Functional Interface
	{
		 public void trans(double am);
	}
	public void bal(double r,T a)
	{
		a.trans(r);
	}
	Bank_2(String n, double r, String t) //Parameterized Constructor to set values into the instance variables
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
	}
	
	public void Operations(int ch) //Method to perform all different operations
	{
		Scanner sc=new Scanner(System.in);
		if(ch==1)
		{
			//Lambda expression to display the customer details
			D details=()->{ 
					System.out.println("Name: "+name
							+"\nBank ID: "+id
							+"\nAccount type: "+type
							+"\nBalance Amount: "+bal+"\n");
			};
			info(details);
			this.input();
		}
		else if(ch==2)
		{
			System.out.println("Enter the amount to deposit: ");
			double am=sc.nextDouble();
			//Lambda expression to perform the deposit action
			T dep=(a)->{bal=bal+a;
			System.out.println("Your new balance is "+bal+" rupees.\n");
			};
			bal(am,dep);
			this.input();
		}
		else if(ch==3)
		{
			System.out.println("Enter the amount to withdraw: ");
			double am=sc.nextDouble();
			//Lambda expression to perform the withdraw action
			T wit=(a)->{bal=bal-a;
			System.out.println("Your new balance is "+bal+" rupees.\n");
			};
			bal(am,wit);
			this.input();
		}
		else if(ch==4)
		{
			//Lambda expression to display the loan details
			D loan=()->{ 
				System.out.println("Enter loan amount: ");
				double p=sc.nextDouble();
				System.out.println("Enter loan period in years: ");
			    int  n=sc.nextInt();
			    double si=0.0;
				if(type=="SAVINGS")
					si=(p*n*i1)/100.0;
				else if(type=="CURRENT")
					si=(p*n*i2)/100.0;
				else
					si=(p*n*i3)/100.0;
				System.out.println("For the required amount and tenure, you need to pay an interest of "
					+si+" rupees.\n");
				};
			info(loan);
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
