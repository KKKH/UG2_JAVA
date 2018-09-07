/* 左の+マークをクリックして、コメントを表示してください。
 * プロジェクト内にエラーのあるソースファイルが含まれるため、
 * 実行すると「ワークスペースでエラー」ダイアログが出る場合があります。
 * その場合は、ダイアログの「常に確認なしで起動する」にチェックを入れ、
 * [続行]ボタンをクリックしてください。*/
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