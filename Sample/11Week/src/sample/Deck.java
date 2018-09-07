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

// enum型を宣言する
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

// カードクラスの定義
// イメージアイコンを継承しマーク、番号、画像をひとまとめにして扱う
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
	
	// ①JButtonのアレイリストbuttonインスタンスを作成する
	
	// ②Cardのアレイリストcardインスタンスを作成する

	
	Deck(String title){
		super(title);
		setBounds(200, 200, 1000, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 画像説明用ラベル
		// ③中央配置した”トランプ画像一覧”の文字列をJLabelクラスのlabelに登録する

		
		// card配置用パネルを作成
		JPanel cardpanel = new JPanel();
		cardpanel.setLayout(new GridLayout(Mark.values().length,Number.values().length));
		
		for(Mark mark : Mark.values())
			for(Number num : Number.values())
				// ④アレイリストcardにトランプのマーク、数字、画像を対応づけて登録する(1行)

		
		// enhanced forループを使って↑でcardに追加した分forをまわす
		for(Card c:card){
			JButton tmp = new JButton(c);
			tmp.setActionCommand(""+c.Number());
			// ⑤buttonにtmpを追加する。
			
		}

		// ⑥↑で登録した全てのボタンを全てアクションリスナーに登録
		// cardpanelに全てのボタンを登録する(Enhanced for文含め3行程度)
		
		
		// ⑦ボーダーレイアウトの上部に文字列labelを配置(1行)
		

		// ⑧ボーダーレイアウトの中央にcardpanelを配置(1行)
		

		// ⑨ボーダーレイアウトの下部にslabelを配置(1行)

		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		// クリック1回目の操作
		if(click == false){
									// ⑩アクションイベントから選択したボタンを取得する
			fbutton.setBackground(Color.GREEN);		// 選択したボタンの背景の色を緑にする
			fbutton.setEnabled(false);				// 選択したボタンを選択不可にする
			click = true;							// clickをtrueにして選択済みであるフラグを立てる
			str = e.getActionCommand();				// 1回目に選択したボタンに設定した文字列を取得する
		}
		// クリック2回目の操作
		else{
			if(e.getActionCommand().equals(str))
				// ⑪slabelに同じ数字である旨表示するテキストを設定する
				
			else
				// ⑫slabelの異なる数字である旨表示するテキストを設定する
				

			fbutton.setBackground(null);			//　1回目に選択したボタンの背景を元に戻す
			fbutton.setEnabled(true);				// 1回目に選択したボタンを選択可能にする
			click = false;							// clickをfalseにして未選択であるフラグを立てる
		}
	}

	public static void main(String[] args) {
		new Deck("トランプ");
	}
}
