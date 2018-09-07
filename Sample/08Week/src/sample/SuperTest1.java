package sample;

class MySuper1 {

	MySuper1() {
		System.out.println("スーパークラス");
	}
}
public class SuperTest1 extends MySuper1 {
	SuperTest1() {
		System.out.println("サブクラス");
	}
	
	public static void main(String[] args) {
		SuperTest1 m = new SuperTest1();
	}
}