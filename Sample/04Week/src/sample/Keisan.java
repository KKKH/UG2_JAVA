package sample;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Keisan extends JFrame{

	private static final long serialVersionUID = 1L;

	static int tasizan(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		Keisan frame = new Keisan();
		frame.setBounds(200, 200, 200, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String s = "3 + 4 = " + tasizan(3,4);
		frame.add(new JLabel(s, JLabel.CENTER));
		frame.setVisible(true);
	}
}