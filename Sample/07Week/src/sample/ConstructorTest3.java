/* ����+�}�[�N���N���b�N���āA�R�����g��\�����Ă��������B
 * ���Ђ̃\�[�X�R�[�h�́ATest�Ƃ����N���X���ł����A
 * �����p�b�P�[�W����Test�N���X�𕡐����������邱�Ƃ��ł��Ȃ��̂ŁA
 * ���L�R�[�h�ł́A�N���X����Test3�ɕύX���Ă��܂��B*/
package sample;

class Test3{
	String name;
	Test3() {
		name = "���Y";
	}
	Test3(String s) {
		name = s;
	}
}

public class ConstructorTest3{
	public static void main(String[] args) {
		Test3 t = new Test3();
		System.out.println("���O��" + t.name + "�ł�");
		t = new Test3 ("�Ԏq");
		System.out.println("���O��" + t.name + "�ł�");
	}
}