class  TestDemo2{
	static int age = 2;
	int age1 = 5;
	public static void main(String[] args) {//args 接收就是传入的参数
		//System.out.println(age);
		run1();
		//System.out.println(age1);
		//run();
	}


	void run(){
		System.out.println("run。。。。。。。。。。。。");
	}

	static void run1(){
		System.out.println(this.age1);
		System.out.println("run1...................");
	}
}
