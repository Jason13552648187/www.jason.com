class  PersonDemo{
	public static void main(String[] args) {
		Person person = new Person();
		//person.name = "张三";
		//person.sex = "female";
		//person.age = -9;
		person.setAge(45);
		person.setName("邓贺");
		person.setSex("female");
		System.out.println("性别为" + person.getSex()  + "的" + person.getName() + ",年龄为" + person.getAge() + "跳芭蕾！");
		//不安全，封装，对外一个接口来简介访问内部属性
	}
}

class Person{

	private String name;
	private String sex;
	private int age;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setSex(String sex){
		this.sex = sex;
	}

	public String getSex(){
		return this.sex;
	}


	public void setAge(int age){
		if (age < 0){
			System.out.println("年龄错误");
		}else this.age = age;
	}

	public int getAge(){
		return this.age;
	}

	void run(){
		System.out.println(name + "在以50m/s的速度在跑!");
	}

	void sleep(){
		System.out.println(name + "在睡觉！");
	}
}


