package sample;

class Superkadai
{
	void func(){
		System.out.println("10");
	}
	//func���\�b�h���`
}
class Subkadai extends Superkadai
{

	//�t�B�[���h(�ϐ�)��錾
	//�R���X�g���N�^���`
	void func(int inner1,double inner2){
		System.out.println("inner1="+inner1);
		System.out.println("inner2="+inner2);
	}
	//func���\�b�h���I�[�o�[���C�h
}
class Kadai07
{
	public static void main(String[] args)
		{
			int x=5;
			double y=3.0;
			Superkadai supk=new Superkadai();
			Subkadai subk=new Subkadai();
			//Superkadai�̃C���X�^���X����
			supk.func();
			subk.func(x,y);
			//Subkadai�̃C���X�^���X����
			//****
		}
}