package sample;

public class OverTest1 {
	
	static void temp() {
		System.out.println("�����̂Ȃ�temp���\�b�h");
	}
	
	static void temp(int x) {
		System.out.println("int�^�̈������ЂƂ���temp���\�b�h");
	}
	
	public static void main(String[] args) {
		temp();
		temp(10);
	}
}