public class ExtendsDemo{
	public static void main(String[] args){
		BMW bmw = new BMW(45,"red","����7");
		bmw.num  = 7;
		bmw.run();
	}
}


class Car{  //����
	int num;
	String color;
	String name;

	void carRun(){
		System.out.println("fu..run");
	}
}


class BMW /*����*/ extends Car{
	public BMW(){}
	
	public BMW(int num,String color,String name){
		super.num = num;//super  ������
		super.color = color;
		super.name = name;
	}
	
	void run(){
		System.out.println(super.name + "�ڴ���·���ܣ�" + super.color);
	}
}

class MSLD /*����*/extends Car{
	
	void run(){
		System.out.println(this.name + "�ڴ���·���ܣ�");
	}
}

class DaYun/*����*/ extends Car{
	

	void run(){
		System.out.println(this.name + "�ڴ���·���ܣ�");
	}
}

class LSLS /*����*/extends Car{

	void run(){
		System.out.println(this.name + "���ܣ�");
	}
}










