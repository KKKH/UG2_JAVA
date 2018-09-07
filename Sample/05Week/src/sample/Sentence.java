package sample;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Random;

public class Sentence extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	static String getWeather() {
		String MySentence1 = "ふるいけや、なつくさや、なのはなや、あさがおに、";
		String MySentence2 = "かわずとびこむ、つわものどもが、つきはひがしに、つるべとられて、";
		String MySentence3 = "みずのおと.ゆめのあと.ひはにしに.もらいみず.";
		Random r = new Random();
		int i = r.nextInt(3);
		int j = r.nextInt(3);
		int k = r.nextInt(3);
		String str1 = MySentence1.substring(i * 6, i * 6 + 6);
		String str2 = MySentence2.substring(j * 8, j * 8 + 8);
		String str3 = MySentence3.substring(k*6,k*6+6);
		return str1+ str2+str3;
	}
	
	public static void main(String[] args) {
		Sentence frame = new Sentence();
		frame.setBounds(200, 200, 300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new JLabel(getWeather(),JLabel.CENTER));
		frame.setVisible(true);
	}
}