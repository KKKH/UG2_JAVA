package sample;

class MySuper {
	void temp1(){
		System.out.println("スーパークラスのtemp1");
	}
}
public class GenericsTest2 extends MySuper{
	void temp2(){
		System.out.println("サブクラスのtemp2");
	}
	public static void main(String[] args) {
		MySuper m = new GenericsTest2();
		m.temp2();
	}
}
