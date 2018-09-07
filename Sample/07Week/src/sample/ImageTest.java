package sample;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ImageTest extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		ImageTest frame = new ImageTest();
		frame.setBounds(200, 200, 200, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon1 = new ImageIcon("Image.gif");
		JLabel label1 = new JLabel(icon1);
		frame.add(label1);
		frame.setVisible(true);
	}
}