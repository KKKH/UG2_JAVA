package sample;

public class LocalTest {
	static void temp1(int i) {
		i = 3;
		System.out.println("temp1���\�b�h�̃��[�J���ϐ�i = " + i);
	}
	
	static void temp2() {
		int i = 5;
		System.out.println("temp2���\�b�h�̃��[�J���ϐ�i = " + i);
	}
	
	public static void main(String[] args) {
		int i = 1;
		temp1(i);
		i = 7;
		temp2();
		System.out.println("main���\�b�h�̃��[�J���ϐ�i = " + i );
	}
}