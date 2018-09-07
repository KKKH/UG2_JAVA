package sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Golf extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	final int MAX = 7;
	Timer timer = new Timer(200 , this);

	// �ۑ�1.Timer�N���X�̃I�u�W�F�N�g��錾����ۂɃ^�C�}�[�̃C�x���g���������鎞�Ԃ�200m�b�ɐݒ肷��(1�s�ŏ�����)
	
	JLabel label= new JLabel("�X�^�[�g�Ŏn�܂��",JLabel.CENTER);
	
	JButton[] bt = {new JButton("�X�^�[�g"),new JButton("�X�g�b�v")};
	
	JLabel player = new JLabel(new ImageIcon("player1.jpg"),JLabel.CENTER);
	JLabel ball = new JLabel(new ImageIcon("ball0.jpg"),JLabel.CENTER);
	
	ImageIcon[] player_icon = new ImageIcon[MAX];
	ImageIcon[] ball_icon = new ImageIcon[3];

	int iCount = 1;   //��Ԃ�\�����߂̐����^�ϐ�(0�`6�͈̔͂ŕω�������)
	int number=1;     //iCount�𑝌������邽�߂̐����^�ϐ�(����������ꍇ��1�C����������ꍇ��-1)
	
	Golf(String title) {
		super(title);
		timer.setActionCommand("timer");
		setBounds(200, 200, 450, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i = 0;i < player_icon.length; i++)
			player_icon[i] = new ImageIcon("player" + (i) + ".jpg");

		//�ۑ�2. player_icon[0]��player0.jpg, player_icon[1]��player1.jpg, �E�E�E,
		//       player_icon[6]��player6.jpg���i�[����Bfor�����g���Ƃ悢�B2�s�ŏ�����
		
		for(int i = 0;i < ball_icon.length; i++)
			ball_icon[i] = new ImageIcon("ball" + (i) + ".jpg");

		//�ۑ�3. ball_icon[0]��ball0.jpg, ball_icon[1]��ball1.jpg,
		//       ball_icon[2]��ball2.jpg���i�[����Bfor�����g���Ƃ悢�B2�s�ŏ�����
		
			
		
		add("North",label);
		add("West",player);
		add("East",ball);
		
		JPanel p = new JPanel();
		for (int i = 0; i < bt.length;i++) {
			bt[i].addActionListener(this);
			p.add(bt[i]);
		}
		add("South",p);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Golf("�S���t");
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		
		player.setIcon(player_icon[iCount]);
		//�ۑ�4.�E�B���h�E���iCount�ɑΉ�����摜(player0.jpg�`player6.jpg)��\������(1�s�ŏ�����)
		ball.setIcon(ball_icon[0]);
		//�ۑ�5.�E�C���h�E���ball_icon[0](ball0.jpg)��\������(1�s�ŏ�����)
		
		
		if(cmd.equals("timer")) {
			iCount+=number;			// iCount�𑝌�������
			if(iCount == player_icon.length-1) number = -1;

			// �ۑ�6. iCount��player_icon.length-1(=6)�ɂȂ��number��-1�ɕύX����(1�`2�s)
			player.setIcon(player_icon[iCount]);
				
			//�ۑ�4.�E�B���h�E���iCount�ɑΉ�����摜(player0.jpg�`player6.jpg)��\������(1�s�ŏ�����)
			
		}
		if(e.getSource() == bt[0] && !timer.isRunning()) {
			label.setText("������1�ɂȂ�����X�g�b�v��������");
			timer.start();

			//�ۑ�7.�^�C�}�[���X�^�[�g������(1�s�ŏ�����)
			
		}
		else if(e.getSource() == bt[1] && timer.isRunning()) {
			
			if(iCount==1){
				label.setText("�i�C�X�V���b�g�I�X�^�[�g�������ƍĊJ���܂��B");
				ball.setIcon(ball_icon[2]);
			}
			//�ۑ�8.iCount��1�ł���΁u�i�C�X�V���b�g�I�X�^�[�g�������ƍĊJ���܂��B�v�ƕ\�����C
			//      �E�C���h�E���ball_icon[2](ball2.jpg)��\������(4�s�ŏ�����)
			
				
			if(iCount!=1){
				label.setText("�~�X�V���b�g�I�X�^�[�g�������ƍĊJ���܂��B");
				ball.setIcon(ball_icon[1]);
			}
			
			//�ۑ�9.iCount��1�ȊO�̐����ł���΁u�~�X�V���b�g�I�X�^�[�g�������ƍĊJ���܂��B�v
			//       �ƕ\�����C�E�C���h�E���ball_icon[1](ball1.jpg)��\������(4�s�ŏ�����)
			
				
				
			timer.stop();
			//�ۑ�10.�^�C�}�[���X�g�b�v������(1�s�ŏ�����)
			
			
			iCount = 1;
			number = 1;
		}
		else if (iCount==0){
			label.setText("��U��I�X�^�[�g�������ƍĊJ���܂��B");
			ball.setIcon(ball_icon[0]);
			timer.stop();
			iCount=1;
			number=1;
		}
		// �ۑ�11.iCount��0�ł���΁u��U��I�X�^�[�g�������ƍĊJ���܂��B�v�ƕ\�����C
		//       �E�B���h�E���ball_icon[0](ball0.jpg)��\��������Ƀ^�C�}�[���X�g�b�v�����C
		//       iCount��1, number��1�ɐݒ肷��Belse if���Ƃ��ď���(7�s�ŏ�����)
				
			
			
			
			
			
		
	}
}