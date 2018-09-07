package sample;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

class TestTsk extends TimerTask {
	public void run() {
		Random r = new Random();
		int i = r.nextInt(10);
		TimerTest.label1.setText(String.valueOf(i));
	}
}

public class TimerTest extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	static JLabel label1 = new JLabel("0",JLabel.CENTER);
	public static void main(String[] args) {
		Timer timer = new Timer(true);
		TestTsk tsk = new TestTsk();
		timer.schedule(tsk, 0, 500);
		TimerTest frame = new TimerTest();
		frame.setBounds(200, 200, 200, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label1);
		frame.setVisible(true);
	}
}