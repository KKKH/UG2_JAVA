package sample;

public class RandomTest1 {
	public static void main(String[] args) {
		java.util.Random r = new java.util.Random();
		int i = r.nextInt(10);
		System.out.println(i);
	}
}