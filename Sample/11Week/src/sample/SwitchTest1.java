package sample;

public class SwitchTest1 {

	public static void main(String[] args) {
		java.util.Random r = new java.util.Random();
		int i = r.nextInt(3);
		switch(i) {
		case 0:
			System.out.println("i��0");
			break;
		case 1:
			System.out.println("i��1");
			break;
		case 2:
			System.out.println("i��2");
			break;
		}
	}
}