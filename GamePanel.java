import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
public class GamePanel extends JPanel{
	
	public JLabel text = new JLabel();  
	private LifePanel lPanel = null;
	private ScorePanel sPanel = null;
	private ImageIcon userImage = new ImageIcon("sangsangBoogie.png");
	private JLabel user = new JLabel(); //�����̴� ĳ����

	public GamePanel() {
		
		this.setBackground(Color.WHITE);
		setLayout(null);
		
		setVisible(true);
		
	}
}
