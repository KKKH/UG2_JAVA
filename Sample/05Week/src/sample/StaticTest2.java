package sample;

public class StaticTest2 {
	
	static void temp(){
		System.out.println("クラスメソッドです。");
	}
	
	public static void main(String[] args) {
		StaticTest2.temp();
		temp();
	}
}