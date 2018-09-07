package sample;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ButtonTest2 extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		ButtonTest2 frame = new ButtonTest2();
		frame.setBounds(200, 200, 200, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button1 = new JButton(new ImageIcon("ButtonSelect.jpg"));
		frame.add(button1);
		frame.setVisible(true);
	}
}
