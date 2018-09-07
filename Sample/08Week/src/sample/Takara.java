package sample;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Takara extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	JButton hidariue;
	JButton hidarishita;
	JButton migiue;
	JButton migishita;
	JLabel label;
	ImageIcon icon= new ImageIcon("treasure.jpg");
	
	public Takara(String title) {
		super(title);
		setBounds(200, 200, 350, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		label = new JLabel("ïÛíTÇµÉQÅ[ÉÄ",JLabel.CENTER);
		add("North",label);
		hidariue = new JButton(new ImageIcon("shibafu.jpg"));
		hidariue.addActionListener(this);
		p.add(hidariue);
		hidarishita = new JButton(new ImageIcon("shibafu.jpg"));
		hidarishita.addActionListener(this);
		p.add(hidarishita);
		migiue = new JButton(new ImageIcon("shibafu.jpg"));
		migiue.addActionListener(this);
		p.add(migiue);
		migishita = new JButton(new ImageIcon("shibafu.jpg"));
		migishita.addActionListener(this);
		p.add(migishita);
		add("Center",p);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Takara("ïÛíTÇµÉQÅ[ÉÄ");
	}
	
	public void actionPerformed(ActionEvent e) {
		int iYou = 0;
		if(e.getSource() == hidariue) iYou = 0;
		else if(e.getSource() == migiue) iYou = 1;
		else if(e.getSource() == hidarishita) iYou = 2;
		else if(e.getSource() == migishita) iYou = 3;

		Random r = new Random();
		int i = r.nextInt(3);
		String[] Hand = {"ç∂è„","âEè„","ç∂â∫","âEâ∫"};
		if(i == iYou){
			label.setText("ïÛÇ" + Hand[i] + "Ç≈î≠å©ÇµÇ‹ÇµÇΩÅB");
			label.setIcon(icon);
		}
		else
			label.setText("ïÛÇ" + Hand[iYou] + "Ç≈î≠å©Ç≈Ç´Ç‹ÇπÇÒÇ≈ÇµÇΩÅB");
	}
}