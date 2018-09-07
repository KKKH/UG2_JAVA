/* 左の+マークをクリックして、コメントを表示してください。
 * interface内に定義した定数は、static final宣言と同じ扱いです。
 * そのためインスタンス化して参照すると、警告が出ますが
 * 気にしなくて結構です。*/
package sample;

interface MyInterface {
	String NAME = "MyInterface";
	void temp();
}

class MyClass implements MyInterface {
	public void temp() {
		System.out.println("MyInterfaceで宣言されているtempメソッド");
	}
}

public class InterfaceTest1 {
	public static void main(String[] args) {
		MyClass m = new MyClass();
		System.out.println("実装しているのは" + m.NAME);
		m.temp();
	}
}