public class SuperDemo{
	public static void main(String[] args){
		//new Zi();//zi  ���캯��............
		/*
			fu ���캯��................
			zi  ���캯��............
		*/
		//DuLunChe che = new DuLunChe();

		//che.work();
		//Trunk trunk = new Trunk();
		//trunk.work();
		/*new A();
		new A();//���ǰ���Ѿ����ع����࣬�������½��Ķ���Ͳ���Ҫ�ڼ����ˡ�
		new A();*/
		/*
			A static .............
			A ��������..........
			A ���캯��............
			
			static �����-->��������-->���캯��

			A static .............
			A ��������..........
			A ���캯��............

			A ��������..........
			A ���캯��............

			A ��������..........
			A ���캯��............
		*/

		new Zi();
		new Zi();


/*
fu  static ��������
zi  static ��������
fu ��������.....
fu ���캯��.......21
zi ��������.....
zi ���캯��.......

fu ��������.....
fu ���캯��.......
zi ��������.....
zi ���캯��.......

*/

/*
	Fu static...........
	zi static ..........

	�Ƚ�������ؽ��ڴ沢ִ�о�̬����飬��ʼ��������ľ�̬����顣

	fu ��������.......
	fu���캯��..........
	zi ��������.......
	Zi  ���캯��........

	��ִ�и���Ĺ������͹��캯����������г�ʼ����Ȼ����ִ�����๹������͹��캯����
*/



	}
}

class Fu{
	static {
		System.out.println("Fu static...........");
	}
	{
		System.out.println("fu ��������.......");
	}

	Fu(){
		System.out.println("fu���캯��..........");
	}
}

class Zi extends Fu{
	static{
		System.out.println("zi static ..........");
	}

	{
		System.out.println("zi ��������.......");
	}

	Zi(){
		System.out.println("Zi  ���캯��........");
	}

}


























class A{
	//��̬�����
	static {
		System.out.println("A static .............");
	}

	//��������
	{
		System.out.println("A ��������..........");
	}

	//���캯��
	A(){
		System.out.println("A ���캯��............");
	}
}






















class DuLunChe{
	private int num;
	
	private void work(){
		System.out.println("�˻���");
	}
}

/*
	���ڼ̳�
	��������ͬ
	���า�Ǹ���ķ�����������Ȩ��Ҫ���ڻ��ߵ��ڸ��෽����Ȩ��
	private -->      -->  protected -->  public 
	
*/

class Trunk extends DuLunChe{
	private int person_num;

	private void work(){
		//super.work();//�˻������ø������������
		System.out.println("����������");//�Լ���չ���˵Ĺ��ܼ��ɡ�
	}
}




























/*
class Fu{
	private int num ;
	Fu(){
		System.out.println("fu ���캯��................");
	}

	Fu(int num){
		this.num = num;
	}
	public void setNum(int num){
		this.num = num;
	}

	public int getNum(){
		return this.num;
	}
}

class Zi extends Fu{
	
	public Zi(){
		super();
		System.out.println("zi  ���캯��............");
		this(56);
	}
	
	public Zi(int num){
		System.out.println("zi �вι��캯��...........");
		
	}




	void show(){
		System.out.println(super.getNum());
	}
}*/