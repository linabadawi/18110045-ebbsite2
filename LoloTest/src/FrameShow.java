import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FrameShow extends GUIMain{
	
  
	public static void view() {
		//ArrayList<StudentInformation> stud=new ArrayList<StudentInformation>();
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
	
	
}
