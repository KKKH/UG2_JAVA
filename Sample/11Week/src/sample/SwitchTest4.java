package sample;

public class SwitchTest4 {
	
	public static void main(String[] args) {
		java.util.Random r = new java.util.Random();
		int i = r.nextInt(4);
		System.out.println("i��" + i);
		switch(i) {
		case 0:
		case 1:
			System.out.println("i��0��1");
			break;
		case 2:
		case 3:
			System.out.println("i��2��3");
		}
	}
}