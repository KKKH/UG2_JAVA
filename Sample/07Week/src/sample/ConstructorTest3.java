/* 左の+マークをクリックして、コメントを表示してください。
 * 書籍のソースコードは、Testというクラス名ですが、
 * 同じパッケージ内にTestクラスを複数所属させることができないので、
 * 下記コードでは、クラス名をTest3に変更しています。*/
package sample;

class Test3{
	String name;
	Test3() {
		name = "太郎";
	}
	Test3(String s) {
		name = s;
	}
}

public class ConstructorTest3{
	public static void main(String[] args) {
		Test3 t = new Test3();
		System.out.println("名前は" + t.name + "です");
		t = new Test3 ("花子");
		System.out.println("名前は" + t.name + "です");
	}
}