package sample;

public class SubstringTest {
	public static void main(String[] args) {
		String s1 = "あいうえお";
		System.out.println(s1.substring(2));
		String s2 = new String("かきくけこ");
		System.out.println(s2.substring(2,4));
		System.out.println("さしすせそ".substring(3));
	}
}