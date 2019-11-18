package programming2;

import java.util.Scanner;

public class Calculator {
	
	public static int readNumber () {
		Scanner s=new Scanner(System.in);
		
		System.out.print("please enter number");
		
		int n=s.nextInt();
		return n;
		 }
	
	public static int add(int n1, int n2) {
		
		int sum= n1+n2;
		return sum;
	}
	
	public static int subtract(int n1, int n2) {
		
		int sub= n1-n2;
		return sub;	
	}
	
	public static int multiply(int n1,int n2) {
		
		int multi= n1*n2;
		return multi;
	}
	
	public static int divide(int n1,int n2) {
		 int div=n1/n2;
		 return div;
		 
		
	}
	
	public static void main(String[] args) {
		
		char choice;
		Scanner y =new Scanner(System.in);
		
		do
		{
			System.out.println("\n main menu: \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Quit\n");
			System.out.print("please enter your choice :");
			
		

			 choice= y.next().charAt(0);
			 
		switch(choice)
		{ 
		case'1':System.out.println("enter two numbers");
		
		int n1= readNumber();
		int n2= readNumber();
		
		 int t= add(n1,n2);
		  System.out.println(t);
		  break;
		  
		case'2':System.out.println("enter two numbers:");
		
		int n11= readNumber();
		int n21= readNumber();
		
		int u= subtract(n11,n21);
		System.out.println(u);
		break;
		
		case'3': System.out.println("enter two numbers:");
		
		int n33= readNumber();
		int n44= readNumber();
		
		int i= multiply(n33,n44);
		System.out.println(i);
		 break;
		 
		case'4': System.out.println("enter two numbers:");
		
		int n55=readNumber();
		int n66= readNumber();
		
		int o=divide(n55,n66);
		System.out.println(o);
		break;
		
		case'5': 
			System.exit(0);
			
			break;
			default: System.out.print("wrong choice....\n");
			break;
		}
		
		
		 
		
		
		
		  
		 
		  
	}
     
	while(choice!=5);
		
	   }
}
