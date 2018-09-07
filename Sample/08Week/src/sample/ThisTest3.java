package sample;

class TempClass {
	
	ThisTest3 x;
	
	void temp2(ThisTest3 x){
		this.x = x;
		temp3();
	}
	
	void temp3(){
		x.temp4();	
	}
}

public class ThisTest3 {	
	public static void main(String[] args) {
		ThisTest3 t = new ThisTest3();
		t.temp1();
	}
	
	void temp1(){
		TempClass c = new TempClass();
		c.temp2(this);
	}
	
	void temp4(){
		System.out.println("ThisTest3のインスタンスメソッド");
	}
}
