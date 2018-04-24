package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	private Rectangle rect = new Rectangle(200, 300, 300, 300);
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(new Color(200, 100, 100));
		g.fillRect(rect.x, rect.y, rect.width, rect.height);
	}

	public void setRect(Rectangle rect) {
		this.rect = rect;
	}
}
