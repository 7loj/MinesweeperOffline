import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class GameOver extends JComponent {
	 
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		g2.drawString("Game Over! D:", 20, 20);
	}
	
	public static void gameOverWindow() {
	JFrame gameOverFrame = new JFrame();
	gameOverFrame.setSize(300, 300);
	gameOverFrame.setTitle("Oh No!");
	
	GameOver gameOverWindow = new GameOver();
	gameOverFrame.setLocation(400,150);
	gameOverFrame.add(gameOverWindow);
	gameOverFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	gameOverFrame.setVisible(true);
	}
	
}
