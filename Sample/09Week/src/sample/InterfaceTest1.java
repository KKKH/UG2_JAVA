/* ����+�}�[�N���N���b�N���āA�R�����g��\�����Ă��������B
 * interface���ɒ�`�����萔�́Astatic final�錾�Ɠ��������ł��B
 * ���̂��߃C���X�^���X�����ĎQ�Ƃ���ƁA�x�����o�܂���
 * �C�ɂ��Ȃ��Č��\�ł��B*/
package sample;

interface MyInterface {
	String NAME = "MyInterface";
	void temp();
}

class MyClass implements MyInterface {
	public void temp() {
		System.out.println("MyInterface�Ő錾����Ă���temp���\�b�h");
	}
}

public class InterfaceTest1 {
	public static void main(String[] args) {
		MyClass m = new MyClass();
		System.out.println("�������Ă���̂�" + m.NAME);
		m.temp();
	}
}