package sample;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Random;

public class Omikuji extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	static String getStick(String[] kuji) {
		Random r = new Random();
		int no = r.nextInt(kuji.length);
		return "�����́A" + kuji[no] + "�ł��B";
	}
	
	public static void main(String[] args) {
		Omikuji frame = new Omikuji();
		frame.setBounds(200, 200, 200, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String[] kuji ={"��g","���g","���g","�g","�g","�g","��","��","��","�勥"};
		String s = getStick(kuji);
		frame.add(new JLabel(s, JLabel.CENTER));
		frame.setVisible(true);
	}
}