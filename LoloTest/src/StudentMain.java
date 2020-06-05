import java.io.FileNotFoundException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;



public class StudentMain  {
	 

	 public static void main(String[] args) {
		 
		           /* Scanner scc = new Scanner(System.in);
		 
		         StudentInformation st =new StudentInformation();
		         st.setNumID(scc.nextInt());
		         st.setUserName(scc.nextLine());
		         st.setAvg(scc.nextDouble());*/
		         
		         
	       
           ArrayList<StudentInformation> stud=new ArrayList<StudentInformation>();
	     
           
         
           
           FileHandler.read( stud);

	        Scanner sc = new Scanner(System.in);
	        while (true) {

	            int select;
	            System.out.println("1. Add Student Record");
	            System.out.println("2. View Student Record");
	            System.out.println("3. Search Student Record");
	            System.out.println("4. Delete Student Record");
	            System.out.println("0. Exit");
	            
	            select = sc.nextInt();

	            switch (select) {
	                case 1:
	                	 System.out.println("1. Enter Student ID: ");                	
	                	 int  numID = sc.nextInt();
	                	  sc.nextLine();
	                	  System.out.println("2. Enter Student Name");
	                	 String userName = sc.nextLine();
	                	
	                	 System.out.println("3. Enter Student avg");
	                	double avg = sc.nextDouble();
	                	 System.out.println(" Press 0");
	                	int addMore = sc.nextInt();
	                	
	                	StudentInformation.addStud( stud, numID,userName, avg , addMore);
	                	
	                	  break;
	                case 2:
	                	StudentInformation. viewStud(stud); //View MethodDDDDDD
						for (StudentInformation element : stud) {
				           if (null != element) {
						 System.out.println("1. Student ID: " + element.getNumID());
			               System.out.println("2. Student Name: " + element.getUserName());
			                System.out.println("3. Student Avg: " + element.getAvg() + "\n");}}
		                    break;
					
					
					
	                case 3:
	                	Scanner s=new Scanner(System.in);
	                	System.out.println("Please enter student id: ");
	                	 int id=s.nextInt();
	                	 
	                  
					StudentInformation.search(stud );  //Search MethoddDDddd
	                   
	               	 for (StudentInformation element : stud) {
	     	    			if(element.getNumID()==id) {
	     	    				System.out.println(element.getUserName());
	     	    				System.out.println(element.getAvg());}}
	     	    				break;
	     	    			
	     	    		
	                	
	                   
	                case 4:
	                	  Scanner input = new Scanner(System.in);
	                	  System.out.println("Please, enter numID to remove the Student: ");
	                      int id1 = input.nextInt();
	                      for (StudentInformation e : stud) {
	                    	     if (e.getNumID()==id1) {
	                    	         stud.remove(e);
	                    	         System.out.println("Student removed");
	                    	         break;
	                    	     }

	                    	     else {
	                    	      //   System.out.println("Sorry, no such student with this " + id1 + " " + "number exist");

	                    	     }
	                      }
	                      StudentInformation.delete(stud);
	                    break;
	                case 0:
	                    return;
	                default:
	                    System.out.println("Invalid Option");
	            }
	        }

	    }

	  
	 /*   public static void viewStud(ArrayList<StudentInformation> stud) {
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
      }       */

   
  		
      
		  


      
      
	
	
		
	
    
 }