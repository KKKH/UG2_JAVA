package sample;

public class ConcatTest1 {
	public static void main(String[] args) {
		String s1 = "‚ ‚¢‚¤";
		String s2 = "‚¦‚¨";
		String s3 = s1.concat(s2);
		System.out.println(s3);
	}
}