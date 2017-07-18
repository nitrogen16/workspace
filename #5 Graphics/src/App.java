import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class App {

	public static void main(String[] args) {
		App gui = new App();
		gui.go();
	}
	
	public void go(){
		JFrame frame = new JFrame();
		
		JButton east = new JButton("East");
		JButton west = new JButton("West");
		JButton north = new JButton("North");
		JButton south = new JButton("South");
		JButton center = new JButton("Center");
		
		frame.getContentPane().add(BorderLayout.EAST, east);
		frame.getContentPane().add(BorderLayout.WEST, west);
		frame.getContentPane().add(BorderLayout.NORTH, north);
		frame.getContentPane().add(BorderLayout.SOUTH, south);
		frame.getContentPane().add(BorderLayout.CENTER, center);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(500, 500);
		frame.setVisible(true);
	}

}
