package sample;
class MySuper2 {
	// 書籍のソースコードには、以下のコードのvoidが抜けています。
	void temp() {
		System.out.println("これはスーパークラスのtempメソッド");
	}
}
class MySub2 extends MySuper2 {
	void temp() {
		System.out.println("これはサブクラスのtempメソッド");
	}
}
public class ExtendsTest2 {
	public static void main(String[] args) {
		MySuper2 m = new MySub2();
		m.temp();
	}
}