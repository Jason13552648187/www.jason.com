public class ExtendsDemo{
	public static void main(String[] args){
		BMW bmw = new BMW(45,"red","宝马7");
		bmw.num  = 7;
		bmw.run();
	}
}


class Car{  //父类
	int num;
	String color;
	String name;

	void carRun(){
		System.out.println("fu..run");
	}
}


class BMW /*子类*/ extends Car{
	public BMW(){}
	
	public BMW(int num,String color,String name){
		super.num = num;//super  代表父类
		super.color = color;
		super.name = name;
	}
	
	void run(){
		System.out.println(super.name + "在大马路上跑！" + super.color);
	}
}

class MSLD /*子类*/extends Car{
	
	void run(){
		System.out.println(this.name + "在大马路上跑！");
	}
}

class DaYun/*子类*/ extends Car{
	

	void run(){
		System.out.println(this.name + "在大马路上跑！");
	}
}

class LSLS /*子类*/extends Car{

	void run(){
		System.out.println(this.name + "在跑！");
	}
}










