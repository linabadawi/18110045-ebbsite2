

import java.util.Scanner;
public class Square {
 
	public static void main(String args []) {
		Scanner x = new Scanner (System.in);
		int number1= x.nextInt();
		int number2 = number1*number1;

		for(int i =0; i<number2; i++)
		{
			System.out.print("*");
			int n1=(i+1)%number1;
			if (n1 == 0) {
				System.out.println();
				
			}
		}
		
	}
}



