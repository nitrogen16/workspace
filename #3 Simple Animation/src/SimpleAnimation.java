import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleAnimation {
	int x = 70;
	int y = 70;

	public static void main(String[] args) {

		SimpleAnimation gui = new SimpleAnimation();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyDrawPanel drawPanel = new MyDrawPanel();

		frame.getContentPane().add(drawPanel);
		frame.setSize(750, 450);
		frame.setVisible(true);

		for (int i = 0; i < 200; i++) {
			x++;
			y++;
			drawPanel.repaint();
			try {
				Thread.sleep(50);
			} catch (Exception e) {
			}
		}
	}

	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			
			g.setColor(Color.green);
			g.fillOval(x, y, 40, 40);
		}
	}
}
