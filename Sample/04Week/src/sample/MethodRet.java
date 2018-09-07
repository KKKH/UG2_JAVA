package sample;

public class MethodRet {
	static int myRet() {
		return 3;
	}
	public static void main(String[] args) {
		int x;
		x = myRet();
		System.out.println (x);
	}
}
