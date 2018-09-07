package sample;
class TestClass3 {
	int i;
	static int c;
}
public class VariableTest {
	public static void main(String[] args) {
		TestClass3 m1 = new TestClass3();
		TestClass3 m2 = new TestClass3();
		m1.i = 3;
		m2.i = 5;
		m1.c = 3;
		m2.c = 5;
		System.out.println("m1.i = " + m1.i + " m2.i = " + m2.i);
		System.out.println("m1.c = " + m1.c + " m2.c = " + m2.c);
	}
}