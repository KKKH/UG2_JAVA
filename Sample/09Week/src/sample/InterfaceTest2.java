/* ����+�}�[�N���N���b�N���āA�R�����g��\�����Ă��������B
 * ���Ђł�interface�����AMyInterface�ł����A
 * �����p�b�P�[�W����MyInterface��2���������邱�Ƃ��ł��Ȃ��̂ŁA
 * �ȉ��̃R�[�h�ł�MyInterface1�ɕύX���Ă��܂��B*/
package sample;

interface MyInterface1 {
	String NAME = "MyInterface";
	void temp();
}

class MyClass1 implements MyInterface1 {
	
	public void temp() {
		System.out.println("MyInterface�Ő錾����Ă���temp���\�b�h");
	}
}

public class InterfaceTest2 {
	public static void main(String[] args) {
		MyInterface1 m = new MyClass1();
		//���Ђ̃\�[�X�R�[�h�ɂ́A�ȉ���1�s�������Ă��܂��B
		System.out.println("�������Ă���̂�" + m.NAME);
		m.temp();
	}
}