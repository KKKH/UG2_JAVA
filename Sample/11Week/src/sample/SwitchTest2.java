package sample;

public class SwitchTest2 {
	
	public static void main(String[] args) {
		
		java.util.Random r = new java.util.Random();
		int i = r.nextInt(4);
		switch(i) {
		case 0:
			System.out.println("iは0");
			break;
		case 1:
			System.out.println("iは1");
			break;
		default:
			System.out.println("iは0,1以外です");
		}
	}
}