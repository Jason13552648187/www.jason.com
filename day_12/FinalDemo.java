public class FinalDemo{
	public static void main(String[] args){
		final C c = new C();//��ջ���c�����ڵ�ַ���ˣ��ٸ�ֵ�ͱ���
		c = new C();
	}
}
class C{
	C(){}

}























class A{

	final int NUM = 5;//��final���εı�����һ���������޷��ı��ֵ
	
	void run(){
		System.out.println("show A..........");
	}
}

class B extends A{

	void run(){
		System.out.println("show B.........." );
	}
}

/*
fianl  
	���η���ʱ�������޷���д�÷�����
	�����࣬�����޷��̳�
	���α���ʱ����������ͱ�̳���������������ֵ���ð󶨡���
*/