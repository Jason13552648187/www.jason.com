public class FinalDemo{
	public static void main(String[] args){
		final C c = new C();//将栈里的c引用于地址绑定了，再赋值就报错
		c = new C();
	}
}
class C{
	C(){}

}























class A{

	final int NUM = 5;//用final修饰的变量是一个常量，无法改变的值
	
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
	修饰方法时，子类无法重写该方法。
	修饰类，子类无法继承
	修饰变量时，这个变量就编程常量。（变量与数值永久绑定。）
*/