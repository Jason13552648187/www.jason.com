public class ThisDemo{
	public static void main(String[] args){
		Person person = new Person();
		/*person.age = 45;
		person.name = "张三";
		person.run();*/
		setPerson(new Person());
		//就是说栈内存中没有引用指向这个对象。
	}
	
	public static  void setPerson(Person person){
		System.out.println(person.getAge() + "  ");
	}


}

class Person{
	int age;
	String name;
	public Person(){}
	public Person(int age,String name){
		this.age = age;
		this.name = name;
	}
	
	void run(){
		int age = 13;
		System.out.println(age + "在跑！");
		//如果在栈内存中有age变量
		//那么就近原则直接拿age，如果没有才到堆内存中去找

		System.out.println(this.age + "在跑！");
		//如果非要到堆内存中去找，那么就在属性的前面加个this
	}
}