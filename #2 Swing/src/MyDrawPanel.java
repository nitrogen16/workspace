import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class MyDrawPanel extends JPanel {
	
	public void paintComponent(Graphics g){
		g.setColor(Color.orange);
		g.fillRect(20, 50, 100, 100);
		
		Image image = new ImageIcon("JPG.jpg").getImage();
		g.drawImage(image, 3, 4, this);
	}
}
