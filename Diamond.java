package programming2;
import java.util.Scanner;

public class Diamond {

   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
       System.out.println("Enter the row diamond Size");
       int h=sc.nextInt();
 
	   for (int i = 0; i < 5; i++) 
	          System.out.println("    *********".substring(i, 5 + 2*i));

	    for (int i =5; i>0;i--)
	        System.out.println("     **********".substring(i-1,5+(2*i)-3));
   }
}

