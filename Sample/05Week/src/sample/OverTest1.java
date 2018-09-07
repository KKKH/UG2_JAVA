package sample;

public class OverTest1 {
	
	static void temp() {
		System.out.println("引数のないtempメソッド");
	}
	
	static void temp(int x) {
		System.out.println("int型の引数をひとつ持つtempメソッド");
	}
	
	public static void main(String[] args) {
		temp();
		temp(10);
	}
}