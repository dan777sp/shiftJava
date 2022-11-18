package aula_06;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel {

	public static void main(String[] args) {
		//teste
		DrawSmiley panel = new DrawSmiley();
		JFrame application = new JFrame();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(250, 250);
		application.setVisible(true);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200);

		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);
		g.fillOval(50, 110, 120, 60);

		g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 120, 40);
	}
}
