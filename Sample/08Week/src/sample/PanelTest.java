package sample;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelTest extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		PanelTest frame = new PanelTest();
		frame.setBounds(200, 200, 200, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.add(new JButton("ƒ{ƒ^ƒ“‚P"));
		p.add(new JButton("ƒ{ƒ^ƒ“‚Q"));
		frame.add("Center",p);
		frame.setVisible(true);
	}
}