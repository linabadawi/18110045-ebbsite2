

	import java.util.Scanner;

	public class Triangle {
		
			public static void main(String args []) {
				Scanner x = new Scanner (System.in);
				
				int number1= x.nextInt();
				double number2;
				int number3 = 0;
				number2 = (number1+1)*((0.5)*number1);
				int number4 =2;
				
				for(int i =0; i<number2; i++)
				{
					System.out.print("*");
					if (i == number3) {
						System.out.println();
						number3= number3+number4;
						number4= number4+1;
						
					}
				}
				
			}

}
