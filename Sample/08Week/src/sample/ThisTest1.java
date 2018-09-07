package sample;

public class ThisTest1 {
	
	int i;
	
	void temp1() {
		i = 3;
		temp2();
	}
	
	void temp2(){
		System.out.println("i = " + i);
	}
	
	public static void main(String[] args) {
		ThisTest1 t = new ThisTest1();
		t.temp1();
	}
}
