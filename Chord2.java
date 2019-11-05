import java.util.Scanner;
public class Chord2 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("hello");
 
        int number = input.nextInt();
        int count = 0;
 
        int temp = number;
        for (int i = number * number; i > 0; i--) {
 
            System.out.print(" ");
            count++;
            if (count == temp) {
                System.out.println("*");
                count = 0;
                temp = temp - 1;
            }
 
        }
    }
}