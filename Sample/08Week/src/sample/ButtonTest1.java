package sample;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonTest1 extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		ButtonTest1 frame = new ButtonTest1();
		frame.setBounds(200, 200, 200, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton bt = new JButton("ƒ{ƒ^ƒ“1");
		frame.add(bt);
		frame.setVisible(true);
	}
}