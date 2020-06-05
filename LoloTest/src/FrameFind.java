import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameFind extends GUIMain{
	

	
	  public static void FindStud() {
		  //ArrayList<StudentInformation> stud=new ArrayList<StudentInformation>();
	    	
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
