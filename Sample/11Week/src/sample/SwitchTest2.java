package sample;

public class SwitchTest2 {
	
	public static void main(String[] args) {
		
		java.util.Random r = new java.util.Random();
		int i = r.nextInt(4);
		switch(i) {
		case 0:
			System.out.println("i‚Í0");
			break;
		case 1:
			System.out.println("i‚Í1");
			break;
		default:
			System.out.println("i‚Í0,1ˆÈŠO‚Å‚·");
		}
	}
}