package sample;//1.�p�b�P�[�W�̐錾

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWindow extends JFrame{		//2.�N���X�̐錾

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(200, 200, 200, 150);//3.�E�B���h�E�̈ʒu�ƃT�C�Y���`
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new JLabel("�d16-198�@Zhang Jiawei",JLabel.CENTER));//4.�����̕\��
		frame.setVisible(true);
	}
}