import java.awt.*;

public class DrawLine1 {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(200, 100);
		panel.setBackground(Color.BLUE);

		Graphics g = panel.getGraphics();
		g.fillRect(25, 50, 20, 20);
		g.drawRect(150, 10, 40, 20);

		g.setColor(new Color(255, 128, 0));
		g.drawOval(50, 25, 20, 20);
		g.fillOval(150, 50, 40, 20);

		g.setFont(new Font("Monospaced", Font.BOLD + Font.ITALIC, 36));
		g.drawString("Hello", 50, 60);
	}
}
