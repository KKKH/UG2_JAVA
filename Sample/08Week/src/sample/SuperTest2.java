package sample;

class MySuper2 {
	MySuper2() {
		System.out.println("パラメータなし");
	}
	
	MySuper2(String msg) {
		System.out.println(msg);
	}
}
public class SuperTest2 extends MySuper2 {
	SuperTest2() {
		// super("パラメータを渡す");
		System.out.println("サブクラス");
	}
	
	public static void main(String[] args) {
		SuperTest2 m = new SuperTest2();
	}
}