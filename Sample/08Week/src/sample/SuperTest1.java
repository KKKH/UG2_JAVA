package sample;

class MySuper1 {

	MySuper1() {
		System.out.println("�X�[�p�[�N���X");
	}
}
public class SuperTest1 extends MySuper1 {
	SuperTest1() {
		System.out.println("�T�u�N���X");
	}
	
	public static void main(String[] args) {
		SuperTest1 m = new SuperTest1();
	}
}