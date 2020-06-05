import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ComponentFactory {
	public static JButton createButton(String title) {
		JButton btn=new JButton(title);
		btn.setForeground(Color.PINK);	
		btn.setBackground(Color.blue);
		btn.setPreferredSize(new Dimension(300,60));
		btn.setFont(new Font("Arial",Font.ITALIC,20));
		return btn;
	}
	
	public static JTextField createTextField(int width) {
		JTextField txt=new JTextField(width);
		txt.setPreferredSize(new Dimension(80,40));
		txt.setBorder(BorderFactory.createLineBorder(Color.white));
		txt.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				txt.setBackground(Color.white);
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				txt.setBackground(Color.pink);
			}
		});
		return txt;
	}
}
