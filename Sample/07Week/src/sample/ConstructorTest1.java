/* 左の+マークをクリックして、コメントを表示してください。
 * 書籍のソースコードは、Testというクラス名ですが、
 * 同じパッケージ内にTestクラスを複数所属させることができないので、
 * 下記コードでは、クラス名をTest1に変更しています。*/
package sample;

class Test1{
	Test1() {
		System.out.println("Testクラスのコンストラクタが実行されました");
	}
}
public class ConstructorTest1{
	public static void main(String[] args) {
		Test1 t = new Test1();
	}
}