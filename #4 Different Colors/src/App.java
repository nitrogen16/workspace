import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App implements ActionListener{
	JFrame frame;
	JButton button;
	public static void main(String[] args) {
		App gui = new App();
		gui.go();
	}
	
	public void go(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button = new JButton("Change colors");
		button.addActionListener(this);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.setSize(750, 450);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event){
		frame.repaint();
		//button.setText("Color was changed!");
	}

}
