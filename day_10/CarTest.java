public class CarTest{
	public static void main(String[] args) {
		/*Car car = new Car();
		car.setWheel(19);
		car.setColor("pink");
		car.setEngine("Inter");
		System.out.println(car.getWheel() + "个轮子，" + car.getColor() + "颜色的" + car.getEngine() + 
			" 引擎的溜了溜了，在大马路上一路火花带闪电的跑！" );*/
		
		//用构造方法来初始化对象
		//如果我们没有在类里显示写构造方法，那么系统在执行的时候会自己生成一个与类名一样的构造函数
		//如果我们显示的写了构造方法，那么系统就不会在提供默认的构造方法。


		/*person.setAge(45);
		person.setName("李四");*/


		Person person = new Person();
		Person person1 = new Person(12,"李四");
		Person person2 = new Person(48);
		System.out.println("年龄为 " + person.getAge() + "的名字为：" 
			+ person.getName() + "在。。。。");
	}
}
class Person{
	private int age;
	private String name;
	public Person(){
	}

	public Person(int age){
		this.age = age;
	}

	public Person(int age,String name){
		this.age = age;
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return this.age;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
}



























class Car{
	private int wheel;
	private String color;
	private String engine;

	public void setWheel(int wheel){
		this.wheel = wheel;
	}

	public int getWheel(){
		return this.wheel;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return this.color;
	}
	
	public void setEngine(String engine){
		this.engine = engine;
	}

	public String getEngine(){
		return this.engine;
	}
}



