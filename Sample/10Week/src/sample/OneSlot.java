package sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class OneSlot extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	final int MAX = 7;
	Timer timer = new Timer(300 , this);
	JLabel label= new JLabel("slot machine",JLabel.CENTER);
	JButton[] bt = {new JButton("start"),new JButton("stop")};
	JLabel slot= new JLabel(new ImageIcon("Slot1.jpg"),JLabel.CENTER);
	ImageIcon[] slot_icon = new ImageIcon[MAX];
	int iCount = 0;
	
	public void Chip(){
		Scanner input=new Scanner(System.in);
		JFrame frame=new JFrame("chip");
		String str=JOptionPane.showInputDialog("Input your chip");
		JOptionPane.showConfirmDialog(frame,"You have insert $"+str+"chip","Information",JOptionPane.INFORMATION_MESSAGE);
		
		initFrame(frame,400,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	OneSlot(String title) {
		super(title);
		timer.setActionCommand("timer");
		setBounds(500, 500, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i = 0;i < slot_icon.length; i++)
			slot_icon[i] = new ImageIcon("Slot" + (i+1) + ".jpg");
		add("North",label);
		//add("Left",slot);
		add("Center",slot);
		//add("Right",slot);
		JPanel p = new JPanel();
		for (int i = 0; i < bt.length;i++) {
			bt[i].addActionListener(this);
			p.add(bt[i]);
		}
		add("South",p);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chip();
		new OneSlot("slot machine sample");
	}
	
	private static void initFrame(JFrame frame, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand(	);
		if(cmd.equals("timer")) {
			if(++iCount == slot_icon.length) iCount = 0;
			slot.setIcon(slot_icon[iCount]);
		}
		if(e.getSource() == bt[0] && !timer.isRunning()) {
			label.setText("good luck");
			timer.start();
		}
		else if(e.getSource() == bt[1] && timer.isRunning()) {
			if(iCount+1 == MAX) label.setText("you win");
			else label.setText("you lost");
			timer.stop();
		}
	}
}