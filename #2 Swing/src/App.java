import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App implements ActionListener{

	JButton button;
	
	public static void main(String[] args) {
		
		App gui = new App();
		//gui.go();

		MyDrawPanel panel = new MyDrawPanel();
		
	}
		
		public void go(){
			JFrame frame = new JFrame();
			button = new JButton("Click on me!");
			
			button.addActionListener(this);
			
			frame.getContentPane().add(button);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(150, 150);
			frame.setVisible(true);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = "Hi there!";
		button.setText(text);
	}

}
