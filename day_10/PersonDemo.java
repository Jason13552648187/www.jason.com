class  PersonDemo{
	public static void main(String[] args) {
		Person person = new Person();
		//person.name = "����";
		//person.sex = "female";
		//person.age = -9;
		person.setAge(45);
		person.setName("�˺�");
		person.setSex("female");
		System.out.println("�Ա�Ϊ" + person.getSex()  + "��" + person.getName() + ",����Ϊ" + person.getAge() + "�����٣�");
		//����ȫ����װ������һ���ӿ����������ڲ�����
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
			System.out.println("�������");
		}else this.age = age;
	}

	public int getAge(){
		return this.age;
	}

	void run(){
		System.out.println(name + "����50m/s���ٶ�����!");
	}

	void sleep(){
		System.out.println(name + "��˯����");
	}
}


