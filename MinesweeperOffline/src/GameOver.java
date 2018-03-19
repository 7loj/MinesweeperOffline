import java.awt.Color;
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
	
	public static void revealMines() {
		for(int x = 1; x < 10; x++) {
			for(int y = 1; y < 10; y++) {
				if(MyPanel.colorArray[x][y].equals(MyPanel.hiddenMineColor)) {
					MyPanel.colorArray[x][y] = Color.BLACK;
				}
			}
		}
	}
	
}
