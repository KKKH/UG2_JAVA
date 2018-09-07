/* 左の+マークをクリックして、コメントを表示してください。
 * 書籍ではinterface名が、MyInterfaceですが、
 * 同じパッケージ内にMyInterfaceを2つ所属させることができないので、
 * 以下のコードではMyInterface1に変更しています。*/
package sample;

interface MyInterface1 {
	String NAME = "MyInterface";
	void temp();
}

class MyClass1 implements MyInterface1 {
	
	public void temp() {
		System.out.println("MyInterfaceで宣言されているtempメソッド");
	}
}

public class InterfaceTest2 {
	public static void main(String[] args) {
		MyInterface1 m = new MyClass1();
		//書籍のソースコードには、以下の1行が抜けています。
		System.out.println("実装しているのは" + m.NAME);
		m.temp();
	}
}