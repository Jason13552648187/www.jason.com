public class CarTest{
	public static void main(String[] args) {
		/*Car car = new Car();
		car.setWheel(19);
		car.setColor("pink");
		car.setEngine("Inter");
		System.out.println(car.getWheel() + "�����ӣ�" + car.getColor() + "��ɫ��" + car.getEngine() + 
			" ������������ˣ��ڴ���·��һ·�𻨴�������ܣ�" );*/
		
		//�ù��췽������ʼ������
		//�������û����������ʾд���췽������ôϵͳ��ִ�е�ʱ����Լ�����һ��������һ���Ĺ��캯��
		//���������ʾ��д�˹��췽������ôϵͳ�Ͳ������ṩĬ�ϵĹ��췽����


		/*person.setAge(45);
		person.setName("����");*/


		Person person = new Person();
		Person person1 = new Person(12,"����");
		Person person2 = new Person(48);
		System.out.println("����Ϊ " + person.getAge() + "������Ϊ��" 
			+ person.getName() + "�ڡ�������");
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



