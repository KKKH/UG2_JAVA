package sample;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

enum Stop {ONE, TWO, THREE}

public class ThreeSlot extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	int currentChip = 0;
	final int MAX = 7;
	Stop iStopCount = Stop.ONE;
	int[] iCount = {1,3,5};
	ArrayList<ImageIcon> SlotImage = new ArrayList<ImageIcon>();
	ArrayList<JLabel> slot = new ArrayList<JLabel>();
	Timer timer;
	JButton[] bt;
	JLabel lbel = new JLabel("Good luck",JLabel.CENTER);
	JLabel chipCalc = new JLabel("Your current chip is: $" + currentChip, JLabel.CENTER);
	JLabel rule = new JLabel("Win $1000 when you get 777");
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
	Random rd = new Random();
	
	ThreeSlot(String title, String chipIn) {
		super(title);
		timer = new Timer(300 , this);
		timer.setActionCommand("timer");
		setBounds(500, 500, 500, 500);
		//size of window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// add lbel on the north
		add("North",lbel);
		
		// add label on the east
		currentChip = Integer.parseInt(chipIn);
		chipCalc.setText("Your current chip is: $" + currentChip);
		JPanel chipInfo = new JPanel(new GridLayout(3,1));
		JLabel chipAmt = new JLabel("Your chip is: $" + chipIn);
		chipInfo.add(chipAmt);
		chipInfo.add(rule);
		chipInfo.add(chipCalc);
		add("East", chipInfo);
		//add 3 information to the right part of interface

		
		// center panel used to show numbers
		JPanel numberP = new JPanel(new GridLayout(1, 3));
		for(int k = 1;k <= MAX; k++)
			SlotImage.add(new ImageIcon(ThreeSlot.class.getResource("Slot" + k + ".jpg")));
		for(int i = 0; i < iCount.length; i++) {
			iCount[i] = rd.nextInt(7);
			slot.add(new JLabel(SlotImage.get(iCount[i])));
		}
		for(JLabel l : slot) numberP.add(l);
		add("Center",numberP);
		
		// south panel used to show buttons
		add("South",init_Button("Stop","Stop", "Stop", "Start", "Again"));
		bt[3].setEnabled(true);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("timer")) {
			int i = 0;
			if(iStopCount == Stop.TWO) i = 1;
			else if(iStopCount == Stop.THREE) i = 2;
			for(; i < iCount.length; i++) {
				iCount[i] = rd.nextInt(7);
				slot.get(i).setIcon(SlotImage.get(iCount[i]));
			}
		}

		if(e.getSource() == bt[3]) {
			timer.start();
			lbel.setText("Lucky wheel is rolling");
			bt[3].setEnabled(false);
			bt[0].setEnabled(true);
		}
		//wheel is rolling
		else if(e.getSource() == bt[0]) {
			iStopCount = Stop.TWO;
			lbel.setText("First lucky number is " + (iCount[0]+1) + ".");
			bt[0].setEnabled(false);
			bt[1].setEnabled(true);
		}
		//first number
		else if (e.getSource() == bt[1]) {
			iStopCount = Stop.THREE;
			lbel.setText("Second lucky number is " + (iCount[1]+1) + ".");
			if(iCount[0] == iCount[1]) lbel.setText("Second lucky number is " + (iCount[1]+1) + ".");
			bt[1].setEnabled(false);
			bt[2].setEnabled(true);
		}
		//second number
		else if(e.getSource() == bt[2]) {
			timer.stop();
			lbel.setText("Third lucky number is " + (iCount[2]+1) + ".");
			if(iCount[0] == iCount[1] && iCount[1] == iCount[2]) {
				if(iCount[0] == MAX-1) {
					lbel.setText("You win the prize");
					currentChip=currentChip+1000;
					chipCalc.setText("Your current chip is: $" + currentChip);
				}
				//win the price
			}
			else {
				lbel.setText("Bad luck. How about try again?");
				currentChip=currentChip-100;
				//balance -100
				chipCalc.setText("Your current chip is: $" + currentChip);
				if(currentChip < 100) {
					JOptionPane.showMessageDialog(this,
						    "Game over. Better luck next time");
					System.exit(0);
					//under 100, exit
				}
			}
			bt[2].setEnabled(false);
			bt[4].setEnabled(true);
		}
		else if(e.getSource() == bt[4]) {
			//again loop
			for(int i = 0; i < iCount.length; i++) {
				iCount[i] = 0;
				slot.get(i).setIcon(SlotImage.get(iCount[i]));
			}
			//'slot' back to origin
			bt[3].setEnabled(true);
			bt[4].setEnabled(false);
			iStopCount = Stop.ONE;
		}
	}
}