package sample;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

class DanceTsk extends TimerTask {
	
	public void run() {
		Random r = new Random();
		int i = Dance.MyImage.length;
		Dance.label1.setIcon(Dance.MyImage[r.nextInt(i)]);
	}
}

public class Dance extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	static JLabel label1;
	static ImageIcon[] MyImage = { new ImageIcon("Deke0.gif"),
		new ImageIcon("Deke1.gif"),new ImageIcon("Deke2.gif"),
		new ImageIcon("Deke3.gif"),new ImageIcon("Deke4.gif")};
	
	public static void main(String[] args) {
		Dance frame = new Dance();
		frame.setBounds(200, 200, 200, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label1 = new JLabel(MyImage[0]);
		frame.add(label1);
		Timer timer = new Timer(true);
		timer.schedule(new DanceTsk(), 0, 500);
		frame.setVisible(true);
	}
}