package sample;

class MySuper2 {
	MySuper2() {
		System.out.println("�p�����[�^�Ȃ�");
	}
	
	MySuper2(String msg) {
		System.out.println(msg);
	}
}
public class SuperTest2 extends MySuper2 {
	SuperTest2() {
		// super("�p�����[�^��n��");
		System.out.println("�T�u�N���X");
	}
	
	public static void main(String[] args) {
		SuperTest2 m = new SuperTest2();
	}
}