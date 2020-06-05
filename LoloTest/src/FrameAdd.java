import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameAdd extends GUIMain{
	
	
	public static void addButton() {
		//ArrayList<StudentInformation> stud=new ArrayList<StudentInformation>();
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
					GUIMain.menu();
                    
					
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
}
