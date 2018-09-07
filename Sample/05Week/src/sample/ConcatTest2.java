package sample;

public class ConcatTest2 {
	public static void main(String[] args) {
		String s1 = "‚ ‚¢‚¤";
		String s2 = "‚¦‚¨";
		String s3 = s2.concat(s1);
		System.out.println(s3);
	}
}