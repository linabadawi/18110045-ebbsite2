import java.util.Scanner;
public class chord1 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("hello");
		int number = scanner.nextInt();
		double number2;
		int number1 = 0;
		number2 = (number + 1) * ((0.5) * number);
		int number3 = 2;
		for (int s = 0; s< number2; s++) {
			 System.out.print(" ");
			 if (s == number1) {
				 System.out.println("*");
				 number1 = number1 + number3;
				 number3 = number3 + 1; 
			 }
		}
	}
}