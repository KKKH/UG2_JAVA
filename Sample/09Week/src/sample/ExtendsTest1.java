package sample;

class MySuper1 {
	void temp(){
		System.out.println("これはスーパークラスのtempメソッド");
	}
}

class MySub1 extends MySuper1 {
}

public class ExtendsTest1 {
	public static void main(String[] args) {
		MySuper1 m = new MySub1();
		m.temp();
	}
}
