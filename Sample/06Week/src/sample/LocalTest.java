package sample;

public class LocalTest {
	static void temp1(int i) {
		i = 3;
		System.out.println("temp1メソッドのローカル変数i = " + i);
	}
	
	static void temp2() {
		int i = 5;
		System.out.println("temp2メソッドのローカル変数i = " + i);
	}
	
	public static void main(String[] args) {
		int i = 1;
		temp1(i);
		i = 7;
		temp2();
		System.out.println("mainメソッドのローカル変数i = " + i );
	}
}