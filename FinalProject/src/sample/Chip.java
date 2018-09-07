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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chip extends JFrame implements ActionListener {
	
	private String chipIn;

	Chip() {
		super("chip");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		chipIn=JOptionPane.showInputDialog("Insert your chip");
		//Input window, insert chip
		int jug = Integer.parseInt(chipIn);
		//change chipIn to integer
		if(jug<100) {
		    JOptionPane.showMessageDialog(null,"Please Insert chip over $100", "Information",JOptionPane.INFORMATION_MESSAGE); //message window
		    System.exit(-1);
		    //Under $100 exit
		}
		else{
			JOptionPane.showConfirmDialog(this,"Will you insert $"+chipIn+" chip?","Information",JOptionPane.INFORMATION_MESSAGE);//information window
			setVisible(true);
			//Confirmation of chips
		}
	}
	
	public String getChipIn() {
		return chipIn;
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}

}
