/* ����+�}�[�N���N���b�N���āA�R�����g��\�����Ă��������B
 * �v���W�F�N�g���ɃG���[�̂���\�[�X�t�@�C�����܂܂�邽�߁A
 * ���s����Ɓu���[�N�X�y�[�X�ŃG���[�v�_�C�A���O���o��ꍇ������܂��B
 * ���̏ꍇ�́A�_�C�A���O�́u��Ɋm�F�Ȃ��ŋN������v�Ƀ`�F�b�N�����A
 * [���s]�{�^�����N���b�N���Ă��������B*/
package sample;

import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyName1 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		JFrame frame = new MyName1();
		Rectangle r= new Rectangle(200,200,200,200);
		frame.setBounds(r);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new JLabel("ZHANG JIAWEI", JLabel.CENTER));
		frame.setVisible(true);
	}
}