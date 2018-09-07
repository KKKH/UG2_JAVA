package sample;

class TestClass2{
	private static void temp1(){
		System.out.println("クラスメソッドです。");
	}
	private void temp2(){
		System.out.println("インスタンスメソッドです。");
	}
}

public class VariableTest3 {
	public static void main(String[] args) {
		TestClass2.temp1();
		TestClass2 t = new TestClass2();
		t.temp2();

	}
}
