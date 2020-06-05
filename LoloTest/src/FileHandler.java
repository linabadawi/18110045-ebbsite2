import java.awt.List;
import java.awt.image.ConvolveOp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import javax.xml.bind.ParseConversionEvent;

public class FileHandler {
	
	
	
	   
	
	 

		



		/*public FileHandler(int numID, String userName, double avg) {
		super(numID,  userName, avg);
		// TODO Auto-generated constructor stub
	}*/

	/*	public static void addStud(ArrayList<StudentInformation> stud) {
	        Scanner sc = new Scanner(System.in);
	        int numID;
	        double avg;
	        String userName;

	        int addMore;
	        int i = 0;

	        do {

	            System.out.println("1. Enter Student ID: ");
	            numID = sc.nextInt();
	            sc.nextLine();
	            System.out.println("2. Enter Student Name");
	            userName = sc.nextLine();
	            System.out.println("3. Enter Student avg");
	            avg = sc.nextDouble();
	            
	            stud.add(new StudentInformation(numID, userName, avg));
	            ++i;
	           
	            System.out.println("To add another Student Record Press 1");
	            addMore = sc.nextInt();
	        } while (addMore == 1);	      */  
	        
	  
	    
public static void write( ArrayList<StudentInformation> stud) {
	
         try {
			
			FileWriter f =new FileWriter("F:\\linaFile\\sara.csv");
			
		    PrintWriter p=new PrintWriter(f);
			
			StringBuilder s=new StringBuilder();
			
			
			
			 for (StudentInformation element : stud) {
				
				 if(null!=element) {
				    s.append(element.getNumID());
	    			s.append(",");
	    			s.append(element.getUserName());
	    			s.append(",");
	    			s.append(element.getAvg());
	    			s.append("\n");
				 }
		        }
			 p.write(s.toString());
				p.close();
				System.out.println("finished");
				
				
			}catch (Exception e) {
				// TODO: handle exception
			}
	     
		
		
		
	}
		 
	         
		
				 
	    					            	
		        
				

    public static void read(ArrayList<StudentInformation> stud)  {
	try {
    File file = new File("F:\\linaFile\\sara.csv"); 
	FileReader fileReader = new FileReader(file); 
	BufferedReader bufferedReader = new BufferedReader (fileReader);
	
	 String line;
	 while ((line = bufferedReader.readLine()) != null) {
	
	String[] tokens = line.split(",");
	 if (tokens.length > 0) { 

	 StudentInformation student = new StudentInformation(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble (tokens [2]));
	
	 stud.add(student); 
	} 
	 }
	 bufferedReader.close();

	 } catch (Exception e) {
	 e.printStackTrace();
	 }

	
   }




		
}
		
		
		
		
				
			
			



