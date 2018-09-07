/* 左の+マークをクリックして、コメントを表示してください。
 * 書籍のソースコードは、Testというクラス名ですが、
 * 同じパッケージ内にTestクラスを複数所属させることができないので、
 * 下記コードでは、クラス名をTest2に変更しています。*/
package sample;

class Test2 {
	String name;
	String country = "日本";
	Test2() {
		name = "中島省吾";
	}
}

public class ConstructorTest2 {
	public static void main(String[] args) {
		Test2 t = new Test2();
		System.out.println("名前は、" + t.name);
		System.out.println("国籍は、" + t.country);
	}
}