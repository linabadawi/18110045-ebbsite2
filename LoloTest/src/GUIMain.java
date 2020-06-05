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
	
	public static void readd() {
		 FileHandler.read( stud);
	
	}
 
	
	
		public static void menu() {
			 //ArrayList<StudentInformation> stud=new ArrayList<StudentInformation>();
			
		
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
				FrameAdd.addButton();
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
 				
 			FrameShow.view();
 				frmCal.setVisible(false);
 			}
 		});
		
         btnSearch.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 			FrameFind.FindStud();
 				frmCal.setVisible(false);
 				
 			}
 		});
         
         
		
		frmCal.add(btnAdd);
		frmCal.add(btnView);
		frmCal.add(btnSearch);
	
		frmCal.add(btnExit);
		frmCal.setVisible(true);
		}
		   
	
	
}
