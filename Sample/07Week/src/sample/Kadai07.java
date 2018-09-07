package sample;

class Superkadai
{
	void func(){
		System.out.println("10");
	}
	//funcメソッドを定義
}
class Subkadai extends Superkadai
{

	//フィールド(変数)を宣言
	//コンストラクタを定義
	void func(int inner1,double inner2){
		System.out.println("inner1="+inner1);
		System.out.println("inner2="+inner2);
	}
	//funcメソッドをオーバーライド
}
class Kadai07
{
	public static void main(String[] args)
		{
			int x=5;
			double y=3.0;
			Superkadai supk=new Superkadai();
			Subkadai subk=new Subkadai();
			//Superkadaiのインスタンス生成
			supk.func();
			subk.func(x,y);
			//Subkadaiのインスタンス生成
			//****
		}
}