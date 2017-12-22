public class PersonDemo{
	public static void main(String[] args){
		//Worker worker = new Worker("李玉波",18,'男');
		//worker.work();
		Student student = new Student("邓贺",96,'男',"S001");
		student.sing();
		student.study();
	}
}


class People{
	//人：年龄，性别，姓名，身高。
	private String name;
	private int age;
	private char sex;


	public People(){}
	public People(String name,int age,char sex){
		this.name = name;
		this.age = age;
		this.sex =sex;

	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return this.age;
	}
	
	public void setSex(char sex){
		this.sex = sex;
	}

	public char getSex(){
		return this.sex;
	}
}


class Student extends People{
	private String stu_num;

	public Student(){}
	public Student(String name,int age,char sex,String stu_num){
		super(name,age,sex);
		this.stu_num = stu_num;
	}

	public void study(){
		System.out.println(super.getName() + "在努力学习！");
	}

	public void sing(){
		System.out.println(super.getName() + "在大声的唱歌！");	
	}
}
















class Worker extends People{
	
	public Worker(){
	
	}
	
	public Worker(String name,int age,char sex){
		super(name,age,sex);
	}

	public void work(){
		System.out.println(super.getName() + "干活");
	}
}

























class Person{
	//人：年龄，性别，姓名，身高。
	private String name;
	private int age;
	private char sex;
	private double hign;

	public Person(){}
	public Person(String name,int age,char sex,double hign){
		this.name = name;
		this.age = age;
		this.sex =sex;
		this.hign = hign;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return this.age;
	}
	
	public void setSex(char sex){
		this.sex = sex;
	}

	public char getSex(){
		return this.sex;
	}
	
	public void setHign(double hign){
		this.hign = hign;
	}

	public double getHign(){
		return this.hign;
	}
}