import java.util.ArrayList;
import java.util.Scanner;

public class Choose extends StudentInformation{


public static void main(String[] args) {
	
     
	 Scanner sc = new Scanner(System.in);
    System.out.println("Choose number" +"\n" + " 1.Gui " + "  \n"+ " 2.Command line ");
	int select = sc.nextInt();

     switch (select) {
     
     case 1:
    GUIMain.readd();
    GUIMain.menu();
    
       break;
     case 2:
        StudentMain.list();
     break;
 
     
     }
}
}
