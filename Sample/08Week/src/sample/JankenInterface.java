package sample;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JankenInterface extends JFrame{
	private static final long serialVersionUID = 1L;
	
	JButton rock;
	JButton scissors;
	JButton paper;
	JLabel label;
	
	
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		FlowLayout flow=new FlowLayout();
		
		frame.setBounds(200, 200, 380, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new FlowLayout());
		
		JButton paper = new JButton(new ImageIcon("paper.gif"));
		frame.add(paper);
		JButton rock = new JButton(new ImageIcon("rock.gif"));
		frame.add(rock);
		JButton scissors = new JButton(new ImageIcon("scissors.gif"));
		frame.add(scissors);
		
		JPanel p = new JPanel();
		
		frame.setVisible(true);

	}

}
