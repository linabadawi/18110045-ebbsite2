
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;





public class GUIMain {
	static ArrayList<StudentInformation> stud=new ArrayList<StudentInformation>();
	public static void main(String[] args) {
	
		 menu();
		 FileHandler.read( stud);

	}
		public static void menu() {
		JFrame frmCal=new JFrame("Student System");
		frmCal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCal.setSize(600, 350);
		frmCal.setLayout(new FlowLayout());
		frmCal.setLocationRelativeTo(null);

		
		JButton btnAdd=ComponentFactory.createButton("Add student");
		JButton btnView=ComponentFactory.createButton("show all students");
		JButton btnSearch=ComponentFactory.createButton("Find student ");
		
		JButton btnExit=ComponentFactory.createButton("Exit");
		  btnExit.addActionListener(new ActionListener() {
	 			
	 			@Override
	 			public void actionPerformed(ActionEvent e) {
	 				
	 				
	 				frmCal.setVisible(false);
	 			}
	 		});
			
		
		
		//to control the size of the button
	/*	btnAdd.setPreferredSize(new Dimension(200, 40));
		btnView.setPreferredSize(new Dimension(200, 40));
		btnSearch.setPreferredSize(new Dimension(200, 40));
		
		btnExit.setPreferredSize(new Dimension(200, 40));*/
		
         btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				addButton();
				frmCal.add(btnAdd);
				frmCal.add(btnView);
				frmCal.add(btnSearch);
			
				frmCal.add(btnExit);
				frmCal.setVisible(false);
				
			}
		});
         
         btnView.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				
 				view();
 				frmCal.setVisible(false);
 			}
 		});
		
         btnSearch.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				FindStud();
 				frmCal.setVisible(false);
 				
 			}
 		});
         
         
		
		frmCal.add(btnAdd);
		frmCal.add(btnView);
		frmCal.add(btnSearch);
	
		frmCal.add(btnExit);
		frmCal.setVisible(true);
		}
		   
		public static void view() {
			JFrame frmCal=new JFrame("Show all students");
			frmCal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmCal.setSize(400, 600);
			frmCal.setLayout(new FlowLayout());
			frmCal.setLocationRelativeTo(null);

			
			JTextArea t =new JTextArea(30, 20);
			
			StudentInformation. viewStud(stud); //View MethodDDDDDD
			for (StudentInformation element : stud) {
	           if (null != element) {
			// System.out.println("1. Student ID: " + element.getNumID());
           //    System.out.println("2. Student Name: " + element.getUserName());
             //   System.out.println("3. Student Avg: " + element.getAvg() + "\n");
	        	   t.append( element.getNumID()+"\n");
	        	   t.append(element.getUserName()+"\n");
	        	   t.append(element.getAvg()+"\n");
	        	
	        	   
	        	   
	        	   }}
			
             JButton b=ComponentFactory.createButton("Back");
          //   b.setPreferredSize(new Dimension(200, 40));
	         b.addActionListener(new ActionListener() {
	 			
	 			@Override
	 			public void actionPerformed(ActionEvent e) {
	 				menu();
	 				frmCal.setVisible(false);
	 				
	 			}
	 		});
			
		   	frmCal.add(t);
			frmCal.add(b);
				frmCal.setVisible(true);
		}
		
		
		
		public static void addButton() {
			JFrame frmCal=new JFrame("Add Student");
			frmCal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmCal.setSize(1010, 200);
			frmCal.setLayout(new FlowLayout());
			frmCal.setLocationRelativeTo(null);
			
			JLabel lbl1 = new JLabel("Student id");
			JTextField txt1=ComponentFactory.createTextField(20);
			JLabel lbl2 = new JLabel("Name");
			JTextField txt2=ComponentFactory.createTextField(20);
			JLabel lbl3 = new JLabel("Avg");
			JTextField txt3=ComponentFactory.createTextField(20);
			JButton btnadd=ComponentFactory.createButton("Add");

			 btnadd.addActionListener(new ActionListener() {
				// ArrayList<StudentInformation> stud=new ArrayList<StudentInformation>();
					@Override
					public void actionPerformed(ActionEvent e) {
						
						int numID=Integer.parseInt(txt1.getText());
						String userName=txt2.getText();
						double avg= Double.parseDouble(txt3.getText());
						int addMore=0;
						
						StudentInformation.addStud(stud, numID, userName, avg, addMore); 
						
							 
					      
					    		
						
						
					}
				});
			
			JButton btnback=ComponentFactory.createButton("Back");
			
			  btnback.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						menu();
                        
						
						frmCal.setVisible(false);
						
					}
				});
			
		//	btnadd.setPreferredSize(new Dimension(200, 40));
		//	btnback.setPreferredSize(new Dimension(200, 40));
			
			frmCal.add(lbl1);
			frmCal.add(txt1);
			
			frmCal.add(lbl2);
			frmCal.add(txt2);
			
			frmCal.add(lbl3);
			frmCal.add(txt3);
			frmCal.add(btnadd);
			frmCal.add(btnback);
			
			frmCal.setVisible(true);

		}
		
	    		      public static void FindStud() {
	    		    	
	    		  			JFrame frmCal=new JFrame("Find Student");
	    		  			frmCal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    		  			frmCal.setSize(1010, 200);
	    		  			frmCal.setLayout(new FlowLayout());
	    		  			frmCal.setLocationRelativeTo(null);
	    		  			
	    		  			JLabel lbl1 = new JLabel("Student id");
	    		  			JTextField txt1=ComponentFactory.createTextField(25);
	    		  			JLabel lbl2 = new JLabel("Name");
	    		  			JTextField txt2=ComponentFactory.createTextField(25);
	    		  			JLabel lbl3 = new JLabel("Avg");
	    		  			JTextField txt3=ComponentFactory.createTextField(25);
	    		  			JButton btnfind=ComponentFactory.createButton("Find");
	    		  			
	    		  			
	    		  			

	    		  			 btnfind.addActionListener(new ActionListener() {
	    		  				// ArrayList<StudentInformation> stud=new ArrayList<StudentInformation>();
	    		  					@Override
	    		  					public void actionPerformed(ActionEvent e) {
	    		  						
	    		  						int numID=Integer.parseInt(txt1.getText());
	    		  							 
	    		  						
	    			                	 
	    			                  
	    							StudentInformation.search(stud );  //Search MethoddDDddd
	    			                   
	    			               	 for (StudentInformation element : stud) {
	    			     	    			if(element.getNumID()==numID) {
	    			     	    			//	System.out.println(element.getUserName());
	    			     	    				//System.out.println(element.getAvg());
	    			     	    				
	    			     	    				txt2.setText(element.getUserName());
	    			     	    		
	    			     	    			//txt3.setText(element.getAvg());
	    			     	    			//	avg = Double.parseDouble(element.getAvg()) ;
	    			     	    				txt3.setText(String.valueOf(element.getAvg()));
	    			     	    	
	    			     	    			}}
	    		  						
	    		  					}
	    		  				});
	    		  			
	    		  			JButton btndelete=ComponentFactory.createButton("Delete");
	    		  			
	    		  			  btndelete.addActionListener(new ActionListener() {
	    		  					
	    		  					@Override
	    		  					public void actionPerformed(ActionEvent e) {
	    		  						
	    		  						
	    		  						int ID=Integer.parseInt(txt1.getText());
	    		  						
	    			                      for (StudentInformation ea : stud) {
	    			                    	     if (ea.getNumID()==ID) {
	    			                    	         stud.remove(ea);
	    			                    	     
	    			                    	         break;
	    			                    	     }

	    			                    	     else {
	    			                    	       

	    			                    	     }
	    			                      }
	    			                      StudentInformation.delete(stud);
	    			                    
	    		  					}
	    		  				});
	    		  			
	    		  		
	    		  			JButton btnback1=ComponentFactory.createButton("Back");
	    		  		  btnback1.addActionListener(new ActionListener() {
  		  					
  		  					@Override
  		  					public void actionPerformed(ActionEvent e) {
  		  						menu();
  		                          
  		  						
  		  						frmCal.setVisible(false);
  		  						
  		  					}
  		  				});
	    		  		/*	btnback1.setPreferredSize(new Dimension(200, 40));
	    		  			btnfind.setPreferredSize(new Dimension(200, 40));
	    		  			btndelete.setPreferredSize(new Dimension(200, 40));*/
	    		  			
	    		  			frmCal.add(lbl1);
	    		  			frmCal.add(txt1);
	    		  			
	    		  			frmCal.add(lbl2);
	    		  			frmCal.add(txt2);
	    		  			
	    		  			frmCal.add(lbl3);
	    		  			frmCal.add(txt3);
	    		  			frmCal.add(btnfind);
	    		  			frmCal.add(btndelete);
	    		  			frmCal.add(btnback1);
	    		  			
	    		  			frmCal.setVisible(true);

	    		  		
	    		  		
	    		      }
	
}
