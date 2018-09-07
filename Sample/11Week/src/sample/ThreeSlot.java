package sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

enum Stop {ONE, TWO, THREE}

public class ThreeSlot extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	final int MAX = 7;
	Stop iStopCount = Stop.ONE;
	int[] iCount = {1,3,5};
	ArrayList<ImageIcon> SlotImage = new ArrayList<ImageIcon>();
	ArrayList<JLabel> slot = new ArrayList<JLabel>();
	Timer timer;
	JButton[] bt;
	JLabel lbel = new JLabel("Good luck",JLabel.CENTER);
	JPanel init_Button(String... args) {
		JPanel p = new JPanel();
		bt = new JButton[args.length];
		for (int i = 0; i < args.length; i++) {
			bt[i] = new JButton(args[i]);
			bt[i].setEnabled(false);
			bt[i].addActionListener(this);
			p.add(bt[i]);
		}
		return p;
	}
	
	ThreeSlot(String title) {
		super(title);
		timer = new Timer(300 , this);
		timer.setActionCommand("timer");
		setBounds(500, 500, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add("North",lbel);
		for(int k = 1;k <= MAX; k++)
			SlotImage.add(new ImageIcon("Slot" + k + ".jpg"));
		Random random=new Random();
		int a=random.nextInt(7);
		int b=random.nextInt(7);
		int c=random.nextInt(7);
		slot.add(new JLabel(SlotImage.get(a)));
		slot.add(new JLabel(SlotImage.get(b)));
		slot.add(new JLabel(SlotImage.get(c)));
		JPanel p = new JPanel();
		for(JLabel l : slot) p.add(l);
		add("Center",p);
		add("South",init_Button("Start","Stop"));
		bt[0].setEnabled(true);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ThreeSlot("Slot machine");
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("timer")) {
			int i = 0;
			if(iStopCount == Stop.TWO) i = 1;
			else if(iStopCount == Stop.THREE) i = 2;
			for(; i < iCount.length; i++) {
				if(++iCount[i] == MAX) iCount[i] = 0;
				slot.get(i).setIcon(SlotImage.get(iCount[i]));}
		}
		//这里原来是顺序排列的，我想把他变成随机排列的
		
		if(e.getSource() == bt[0]) {
			timer.start();
			lbel.setText("Lucky wheel is rolling");
			bt[0].setEnabled(false);
			bt[1].setEnabled(true);
		}
		else if(e.getSource() == bt[1]) {
			switch(iStopCount) {
			case ONE:
				lbel.setText("First lucky number is " + (iCount[0]+1) + ".");
				iStopCount = Stop.TWO;
				break;
			case TWO:
				lbel.setText("Second lucky number is "+ (iCount[0]+2) + ".");
				if(iCount[0] == iCount[1]) lbel.setText("���[�`��");
				iStopCount = Stop.THREE;
				break;
			case THREE:
				timer.stop();
				if(iCount[0] == iCount[1] && iCount[1] == iCount[2]) {
					if(iCount[0] == MAX-1) lbel.setText("You win the prize");
					else lbel.setText("How about try again?");
				}
				else lbel.setText("Bad luck");
				iStopCount = Stop.ONE;
				bt[0].setEnabled(true);
				bt[1].setEnabled(false);
			}
		}
	}
}