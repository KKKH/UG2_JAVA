package sample;

class MySuper {
	void temp1(){
		System.out.println("�X�[�p�[�N���X��temp1");
	}
}
public class GenericsTest2 extends MySuper{
	void temp2(){
		System.out.println("�T�u�N���X��temp2");
	}
	public static void main(String[] args) {
		MySuper m = new GenericsTest2();
		m.temp2();
	}
}
