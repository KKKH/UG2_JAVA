package sample;

class TestClass2 {
	void temp() {
		System.out.println("TestClassの引数のないtempメソッド");
	}	
	void temp(int x) {
		System.out.println("TestClassのint型の引数をひとつ持つtempメソッド");
	}	
}

public class OverTest2 {
	public static void main(String[] args) {
		TestClass2 m = new TestClass2();
		m.temp();
		m.temp(10);
	}
}