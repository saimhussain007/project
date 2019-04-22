import java.util.*;
class Atm{
	public static void main(String arg[]){
	Scanner ob=new Scanner(System.in);
	int balance=1000;
	System.out.print("Email: ");
	String email=ob.nextLine();
	System.out.print("Password: ");
	String pass=ob.nextLine();
		
		//String eMail = "manzooralimemon@gmail.com";
		//String pAssword = "memon";
	
	if((email.equals("Ramesh123@gmail.com"))&&(pass.equals("computer")))
	{
	System.out.println("1). Balance Enquiry.");
	System.out.println("2). With draw. ");
	System.out.println("3). Deposit. ");
	System.out.println("");
	System.out.print("Enter Your Choice: ");
	int choice =ob.nextInt();
	
		if(choice==1)
		{
		System.out.println("Available Balance : "+balance);
		} 
	
		else if(choice==2)
		{
		int a=500;
		int b=1000;
		int c=2000;
		int d=4000;
		int e=5000;
		int f=10000;
		System.out.println("1). "+a);
		System.out.println("2). "+b);
		System.out.println("3). "+c);
		System.out.println("4). "+d);
		System.out.println("5). "+e);
		System.out.println("6). "+f);
		System.out.println("7). Other. ");
		System.out.println(" ");
		System.out.println("Enter Your Choice: ");
		int c1=ob.nextInt();
		if((c1==1)&&(a>=balance))
		{
		System.out.println("You Withdraw "+a);
		System.out.println("Now Your Available Balance is: "+(balance-a));
		}
		else if((c1==2)&&(balance>=b))
		{
		System.out.println("You Withdraw "+b);
		System.out.println("Now Your Available Balance is: "+(balance-b));
		}
		else if((c1==3)&&(balance>=c))
		{
		System.out.println("You Withdraw "+c);
		System.out.println("Now Your Available Balance is: "+(balance-c));
		}
		else if((c1==4)&&(balance>=d))
		{
		System.out.println("You Withdraw "+d);
		System.out.println("Now Your Available Balance is: "+(balance-d));
		}
		else if((c1==5)&&(balance>=e))
		{
		System.out.println("You Withdraw "+e);
		System.out.println("Now Your Available Balance is: "+(balance-e));
		}
		else if((c1==6)&&(balance>=f))
		{
		System.out.println("You Withdraw "+f);
		System.out.println("Now Your Available Balance is: "+(balance-f));
		}
		else if(c1==8)
		{
		System.out.println("Enter Amount: ");
		int amount=ob.nextInt();
		if(amount<=balance)
		{
		System.out.println("You Withdraw "+amount);
		System.out.println("Available Balance: "+(amount-balance));
		}
		else
		System.out.println("I Can Not Afford "+amount);
		}		
		else 
		System.out.println("I Can not Afford this Amount.");
		}
		
	else if(choice==3)
	{
	System.out.println("Enter Amount: ");
	int deposit=ob.nextInt();
	System.out.println("You Deposit "+deposit+" Amount. ");
	System.out.println("Now your Available Balance is "+(balance+deposit));
	} 
	
	}
	else
	System.out.println("Try Again");
	}
}