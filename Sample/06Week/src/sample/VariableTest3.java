package sample;

class TestClass2{
	private static void temp1(){
		System.out.println("�N���X���\�b�h�ł��B");
	}
	private void temp2(){
		System.out.println("�C���X�^���X���\�b�h�ł��B");
	}
}

public class VariableTest3 {
	public static void main(String[] args) {
		TestClass2.temp1();
		TestClass2 t = new TestClass2();
		t.temp2();

	}
}
