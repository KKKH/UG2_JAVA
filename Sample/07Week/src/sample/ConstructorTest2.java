/* ����+�}�[�N���N���b�N���āA�R�����g��\�����Ă��������B
 * ���Ђ̃\�[�X�R�[�h�́ATest�Ƃ����N���X���ł����A
 * �����p�b�P�[�W����Test�N���X�𕡐����������邱�Ƃ��ł��Ȃ��̂ŁA
 * ���L�R�[�h�ł́A�N���X����Test2�ɕύX���Ă��܂��B*/
package sample;

class Test2 {
	String name;
	String country = "���{";
	Test2() {
		name = "�����Ȍ�";
	}
}

public class ConstructorTest2 {
	public static void main(String[] args) {
		Test2 t = new Test2();
		System.out.println("���O�́A" + t.name);
		System.out.println("���Ђ́A" + t.country);
	}
}