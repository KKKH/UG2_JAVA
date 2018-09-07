package sample;

public class ThisTest2 {
	
	int i;
	
	void temp1() {
		this.i = 3;
		this.temp2();
	}
	
	void temp2(){
		System.out.println("i = " + this.i);
	}
	
	public static void main(String[] args) {
		ThisTest2 t = new ThisTest2();
		t.temp1();
	}
}
