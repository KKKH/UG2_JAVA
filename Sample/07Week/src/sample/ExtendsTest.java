package sample;

class MySuper {
	int i;
	void temp() {
		System.out.println("i = " + i + " スーパークラス");
	}
}

class MySub extends MySuper {
}

public class ExtendsTest {
	public static void main(String[] args) {
		MySub m = new MySub();
		m.i = 5;
		m.temp();
	}
}