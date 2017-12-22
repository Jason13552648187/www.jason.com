public class ExtendsDemo2{
	public static void main(String[] args){
		B b = new B();
		b.run();//5
		b.show();

	}
}

class A{
	int num = 5;
	void run(){
		System.out.println("A.............RUN");
	}
}

class B extends A{
	int num = 6;
	void show(){
		int num = 4;
		System.out.println(num);//4
		System.out.println(this.num);//6
		System.out.println("zi show............" + super.num);//5
	}
}
