package sample;

class TestClass2 {
	void temp() {
		System.out.println("TestClass�̈����̂Ȃ�temp���\�b�h");
	}	
	void temp(int x) {
		System.out.println("TestClass��int�^�̈������ЂƂ���temp���\�b�h");
	}	
}

public class OverTest2 {
	public static void main(String[] args) {
		TestClass2 m = new TestClass2();
		m.temp();
		m.temp(10);
	}
}