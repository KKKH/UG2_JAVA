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

	// 課題1.Timerクラスのオブジェクトを宣言する際にタイマーのイベントが発生する時間を200m秒に設定する(1行で書ける)
	
	JLabel label= new JLabel("スタートで始まるよ",JLabel.CENTER);
	
	JButton[] bt = {new JButton("スタート"),new JButton("ストップ")};
	
	JLabel player = new JLabel(new ImageIcon("player1.jpg"),JLabel.CENTER);
	JLabel ball = new JLabel(new ImageIcon("ball0.jpg"),JLabel.CENTER);
	
	ImageIcon[] player_icon = new ImageIcon[MAX];
	ImageIcon[] ball_icon = new ImageIcon[3];

	int iCount = 1;   //状態を表すための整数型変数(0～6の範囲で変化させる)
	int number=1;     //iCountを増減させるための整数型変数(増加させる場合は1，減少させる場合は-1)
	
	Golf(String title) {
		super(title);
		timer.setActionCommand("timer");
		setBounds(200, 200, 450, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i = 0;i < player_icon.length; i++)
			player_icon[i] = new ImageIcon("player" + (i) + ".jpg");

		//課題2. player_icon[0]にplayer0.jpg, player_icon[1]にplayer1.jpg, ・・・,
		//       player_icon[6]にplayer6.jpgを格納する。for文を使うとよい。2行で書ける
		
		for(int i = 0;i < ball_icon.length; i++)
			ball_icon[i] = new ImageIcon("ball" + (i) + ".jpg");

		//課題3. ball_icon[0]にball0.jpg, ball_icon[1]にball1.jpg,
		//       ball_icon[2]にball2.jpgを格納する。for文を使うとよい。2行で書ける
		
			
		
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
		new Golf("ゴルフ");
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		
		player.setIcon(player_icon[iCount]);
		//課題4.ウィンドウ上にiCountに対応する画像(player0.jpg～player6.jpg)を表示する(1行で書ける)
		ball.setIcon(ball_icon[0]);
		//課題5.ウインドウ上にball_icon[0](ball0.jpg)を表示する(1行で書ける)
		
		
		if(cmd.equals("timer")) {
			iCount+=number;			// iCountを増減させる
			if(iCount == player_icon.length-1) number = -1;

			// 課題6. iCountがplayer_icon.length-1(=6)になればnumberを-1に変更する(1～2行)
			player.setIcon(player_icon[iCount]);
				
			//課題4.ウィンドウ上にiCountに対応する画像(player0.jpg～player6.jpg)を表示する(1行で書ける)
			
		}
		if(e.getSource() == bt[0] && !timer.isRunning()) {
			label.setText("数字が1になったらストップを押して");
			timer.start();

			//課題7.タイマーをスタートさせる(1行で書ける)
			
		}
		else if(e.getSource() == bt[1] && timer.isRunning()) {
			
			if(iCount==1){
				label.setText("ナイスショット！スタートを押すと再開します。");
				ball.setIcon(ball_icon[2]);
			}
			//課題8.iCountが1であれば「ナイスショット！スタートを押すと再開します。」と表示し，
			//      ウインドウ上にball_icon[2](ball2.jpg)を表示する(4行で書ける)
			
				
			if(iCount!=1){
				label.setText("ミスショット！スタートを押すと再開します。");
				ball.setIcon(ball_icon[1]);
			}
			
			//課題9.iCountが1以外の数字であれば「ミスショット！スタートを押すと再開します。」
			//       と表示し，ウインドウ上にball_icon[1](ball1.jpg)を表示する(4行で書ける)
			
				
				
			timer.stop();
			//課題10.タイマーをストップさせる(1行で書ける)
			
			
			iCount = 1;
			number = 1;
		}
		else if (iCount==0){
			label.setText("空振り！スタートを押すと再開します。");
			ball.setIcon(ball_icon[0]);
			timer.stop();
			iCount=1;
			number=1;
		}
		// 課題11.iCountが0であれば「空振り！スタートを押すと再開します。」と表示し，
		//       ウィンドウ上にball_icon[0](ball0.jpg)を表示した後にタイマーをストップさせ，
		//       iCountを1, numberを1に設定する。else if文として書く(7行で書ける)
				
			
			
			
			
			
		
	}
}