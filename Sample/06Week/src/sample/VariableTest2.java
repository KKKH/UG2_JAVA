package sample;

public class VariableTest2 {
	private static int i;
	static void temp1(){
		System.out.println(i);
	}
	public static void main(String[] args) {
		i = 3;
		temp1();
	}
}