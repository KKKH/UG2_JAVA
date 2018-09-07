package sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class TimerTest extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	Timer timer = new Timer(500 , this);
	JLabel label= new JLabel("0",JLabel.CENTER);
	JButton bt = new JButton("タイマー");
	int iCount = 0;
	
	TimerTest() {
		setBounds(200, 200, 200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		timer.setActionCommand("timer");
		add("North",label);
		bt.addActionListener(this);
		add("Center",bt);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TimerTest();
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("timer")) {
			if(++iCount > 9) iCount = 0;
			label.setText(String.valueOf(iCount));
		}
		if(e.getSource() == bt && !timer.isRunning())
			timer.start();
		else if(e.getSource() == bt && timer.isRunning())
			timer.stop();
	}
}