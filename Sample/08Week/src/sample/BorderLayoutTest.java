package sample;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		BorderLayoutTest frame = new BorderLayoutTest();
		frame.setBounds(200, 200, 200, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add("Center",new JButton("1"));
		frame.add("North",new JButton("2"));
		frame.add("South",new JButton("3"));
		frame.add("West",new JButton("4"));
		frame.add("East",new JButton("5"));
		frame.setVisible(true);
	}
}