package sample;
class MySuper2 {
	// ���Ђ̃\�[�X�R�[�h�ɂ́A�ȉ��̃R�[�h��void�������Ă��܂��B
	void temp() {
		System.out.println("����̓X�[�p�[�N���X��temp���\�b�h");
	}
}
class MySub2 extends MySuper2 {
	void temp() {
		System.out.println("����̓T�u�N���X��temp���\�b�h");
	}
}
public class ExtendsTest2 {
	public static void main(String[] args) {
		MySuper2 m = new MySub2();
		m.temp();
	}
}