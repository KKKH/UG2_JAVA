package sample;

public class InstanceTest4 {
	void temp() {
		System.out.println("インスタンスメソッドです。");
	}

	public static void main(String[] args) {
		InstanceTest4 t = new InstanceTest4();
		t.temp();
	}
}