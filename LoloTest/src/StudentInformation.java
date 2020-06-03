import java.util.ArrayList;
import java.util.Scanner;

public class StudentInformation {

	private int numID;
	private String userName;
	private double avg;

	


	

	public  StudentInformation(int numID, String userName, double avg) {

	    this.numID = numID;
	    this.userName = userName;
	    this.avg=avg;
	   

	}


	public StudentInformation() {
		// TODO Auto-generated constructor stub
	}


	


	


	 


	public int getNumID() {
	    return numID;
	}

	public void setNumID(int numID) {
	    this.numID = numID;
	}

	
	public double getAvg() {
		return avg;
	}


	public void setAvg(double avg) {
		this.avg = avg;
	}


	public String getUserName() {
	    return userName;
	}

	public void setUserName(String userName) {
	    this.userName = userName;
	}


	
	
	 public static void viewStud(ArrayList<StudentInformation> stud) {

	        for (StudentInformation element : stud) {
	            if (null != element) {
	                System.out.println("1. Student ID: " + element.getNumID());
	                System.out.println("2. Student Name: " + element.getUserName());
	                System.out.println("3. Student Avg: " + element.getAvg() + "\n");
	                
	               
	                	      	       
	     	       
	           }
	        }

	    }
	    
	    public static void search(ArrayList<StudentInformation> stud) {
	      
	        	Scanner s=new Scanner(System.in);
	    		System.out.println("Please enter student id: ");
	    		int id=s.nextInt();
	    		for (StudentInformation element : stud) {
	    			if(element.getNumID()==id) {
	    				System.out.println(element.getUserName());
	    				System.out.println(element.getAvg());
	    				break;
	    			}
	    		}
	    }
	    
		public static void addStud(ArrayList<StudentInformation> stud) {
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
	        } while (addMore == 1);	 
	        
	       
	        FileHandler.write(stud);
	       
		}
	    		
	    		      
	    
   public static void delete(ArrayList<StudentInformation> stud) {
 	  
 	  
 	  Scanner input = new Scanner(System.in);

 System.out.println("Please, enter numID to remove the Student: ");
 int id = input.nextInt();

 for (StudentInformation e : stud) {
     if (e.getNumID()==id) {
         stud.remove(e);
         System.out.println("Student removed");
         break;
     }

     else {
         System.out.println("Sorry, no such student with this " + id + " " + "number exist");

     }

 }
   FileHandler.write(stud);

   }       







	

	
	}
