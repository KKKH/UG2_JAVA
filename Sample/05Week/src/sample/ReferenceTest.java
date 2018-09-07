package sample;

class TestClass1 {
	void temp() {
		System.out.println("TestClass‚Ìˆø”‚Ì‚È‚¢tempƒƒ\ƒbƒh");
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