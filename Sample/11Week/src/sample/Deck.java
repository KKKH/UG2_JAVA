package sample;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.ArrayList;

enum Mark{
	CLUB,
	DIAM,
	HEART,
	SPADE;
}

// enum�^��錾����
enum Number{
	ACE(1),
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(13);
	
	int number;
	Number(int i){this.number = i;}
	int Integer(){return number;}
}

// �J�[�h�N���X�̒�`
// �C���[�W�A�C�R�����p�����}�[�N�A�ԍ��A�摜���ЂƂ܂Ƃ߂ɂ��Ĉ���
class Card extends ImageIcon{
	private static final long serialVersionUID = 1L;
	
	Mark mark;
	Number num;
	
	Card(Mark mark,Number num,String str){
		super(str);
		this.mark = mark;
		this.num = num;
	}
	
	int Number(){return num.Integer();}
	Number ENumber(){return num;}
	Mark Mark(){return mark;};
}

public class Deck extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	boolean click = false;
	JButton fbutton = new JButton();
	JLabel slabel = new JLabel("",JLabel.CENTER);
	String str = new String();
	
	// �@JButton�̃A���C���X�gbutton�C���X�^���X���쐬����
	
	// �ACard�̃A���C���X�gcard�C���X�^���X���쐬����

	
	Deck(String title){
		super(title);
		setBounds(200, 200, 1000, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// �摜�����p���x��
		// �B�����z�u�����h�g�����v�摜�ꗗ�h�̕������JLabel�N���X��label�ɓo�^����

		
		// card�z�u�p�p�l�����쐬
		JPanel cardpanel = new JPanel();
		cardpanel.setLayout(new GridLayout(Mark.values().length,Number.values().length));
		
		for(Mark mark : Mark.values())
			for(Number num : Number.values())
				// �C�A���C���X�gcard�Ƀg�����v�̃}�[�N�A�����A�摜��Ή��Â��ēo�^����(1�s)

		
		// enhanced for���[�v���g���ā���card�ɒǉ�������for���܂킷
		for(Card c:card){
			JButton tmp = new JButton(c);
			tmp.setActionCommand(""+c.Number());
			// �Dbutton��tmp��ǉ�����B
			
		}

		// �E���œo�^�����S�Ẵ{�^����S�ăA�N�V�������X�i�[�ɓo�^
		// cardpanel�ɑS�Ẵ{�^����o�^����(Enhanced for���܂�3�s���x)
		
		
		// �F�{�[�_�[���C�A�E�g�̏㕔�ɕ�����label��z�u(1�s)
		

		// �G�{�[�_�[���C�A�E�g�̒�����cardpanel��z�u(1�s)
		

		// �H�{�[�_�[���C�A�E�g�̉�����slabel��z�u(1�s)

		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		// �N���b�N1��ڂ̑���
		if(click == false){
									// �I�A�N�V�����C�x���g����I�������{�^�����擾����
			fbutton.setBackground(Color.GREEN);		// �I�������{�^���̔w�i�̐F��΂ɂ���
			fbutton.setEnabled(false);				// �I�������{�^����I��s�ɂ���
			click = true;							// click��true�ɂ��đI���ς݂ł���t���O�𗧂Ă�
			str = e.getActionCommand();				// 1��ڂɑI�������{�^���ɐݒ肵����������擾����
		}
		// �N���b�N2��ڂ̑���
		else{
			if(e.getActionCommand().equals(str))
				// �Jslabel�ɓ��������ł���|�\������e�L�X�g��ݒ肷��
				
			else
				// �Kslabel�̈قȂ鐔���ł���|�\������e�L�X�g��ݒ肷��
				

			fbutton.setBackground(null);			//�@1��ڂɑI�������{�^���̔w�i�����ɖ߂�
			fbutton.setEnabled(true);				// 1��ڂɑI�������{�^����I���\�ɂ���
			click = false;							// click��false�ɂ��Ė��I���ł���t���O�𗧂Ă�
		}
	}

	public static void main(String[] args) {
		new Deck("�g�����v");
	}
}
