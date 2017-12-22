public class SuperDemo{
	public static void main(String[] args){
		//new Zi();//zi  构造函数............
		/*
			fu 构造函数................
			zi  构造函数............
		*/
		//DuLunChe che = new DuLunChe();

		//che.work();
		//Trunk trunk = new Trunk();
		//trunk.work();
		/*new A();
		new A();//如果前面已经加载过了类，后面在新建的对象就不需要在加载了。
		new A();*/
		/*
			A static .............
			A 构造代码块..........
			A 构造函数............
			
			static 代码块-->构造代码块-->构造函数

			A static .............
			A 构造代码块..........
			A 构造函数............

			A 构造代码块..........
			A 构造函数............

			A 构造代码块..........
			A 构造函数............
		*/

		new Zi();
		new Zi();


/*
fu  static 。。。。
zi  static 。。。。
fu 构造代码块.....
fu 构造函数.......21
zi 构造代码块.....
zi 构造函数.......

fu 构造代码块.....
fu 构造函数.......
zi 构造代码块.....
zi 构造函数.......

*/

/*
	Fu static...........
	zi static ..........

	先将父类加载进内存并执行静态代码块，开始加载子类的静态代码块。

	fu 构造代码块.......
	fu构造函数..........
	zi 构造代码块.......
	Zi  构造函数........

	先执行父类的构造代码和构造函数来对类进行初始化，然后在执行子类构造代码块和构造函数。
*/



	}
}

class Fu{
	static {
		System.out.println("Fu static...........");
	}
	{
		System.out.println("fu 构造代码块.......");
	}

	Fu(){
		System.out.println("fu构造函数..........");
	}
}

class Zi extends Fu{
	static{
		System.out.println("zi static ..........");
	}

	{
		System.out.println("zi 构造代码块.......");
	}

	Zi(){
		System.out.println("Zi  构造函数........");
	}

}


























class A{
	//静态代码块
	static {
		System.out.println("A static .............");
	}

	//构造代码块
	{
		System.out.println("A 构造代码块..........");
	}

	//构造函数
	A(){
		System.out.println("A 构造函数............");
	}
}






















class DuLunChe{
	private int num;
	
	private void work(){
		System.out.println("运货！");
	}
}

/*
	基于继承
	方法名相同
	子类覆盖父类的方法，方法的权限要大于或者等于父类方法的权限
	private -->      -->  protected -->  public 
	
*/

class Trunk extends DuLunChe{
	private int person_num;

	private void work(){
		//super.work();//运货的事让父类帮我们做。
		System.out.println("即可以运人");//自己扩展运人的功能即可。
	}
}




























/*
class Fu{
	private int num ;
	Fu(){
		System.out.println("fu 构造函数................");
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
		System.out.println("zi  构造函数............");
		this(56);
	}
	
	public Zi(int num){
		System.out.println("zi 有参构造函数...........");
		
	}




	void show(){
		System.out.println(super.getNum());
	}
}*/