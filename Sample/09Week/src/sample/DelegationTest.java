package sample;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DelegationTest extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	JButton bt1;
	JButton bt2;
	JLabel label;
	
	public DelegationTest() {
		setBounds(200, 200, 200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("クリックしてください",JLabel.CENTER);
		add("North",label);
		bt1 = new JButton("ボタン１");
		bt2 = new JButton("ボタン２");
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		JPanel p = new JPanel();
		p.add(bt1);
		p.add(bt2);
		add("Center",p);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DelegationTest();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt1)
			label.setText("ボタン１");
		else if(e.getSource() == bt2)
			label.setText("ボタン２");
	}
}