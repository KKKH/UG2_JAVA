package sample;

class TestClass1 {
	void temp() {
		System.out.println("TestClassの引数のないtempメソッド");
	}
}

public class ReferenceTest {
	static void temp(TestClass1 x) {
		x.temp();
	}
	public static void main(String[] args) {
		TestClass1 m = new TestClass1();
		temp(m);
	}
}