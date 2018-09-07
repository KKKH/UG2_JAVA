package sample;//1.パッケージの宣言

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWindow extends JFrame{		//2.クラスの宣言

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(200, 200, 200, 150);//3.ウィンドウの位置とサイズを定義
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new JLabel("電16-198　Zhang Jiawei",JLabel.CENTER));//4.文字の表示
		frame.setVisible(true);
	}
}