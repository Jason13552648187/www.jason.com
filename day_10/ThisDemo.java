public class ThisDemo{
	public static void main(String[] args){
		Person person = new Person();
		/*person.age = 45;
		person.name = "����";
		person.run();*/
		setPerson(new Person());
		//����˵ջ�ڴ���û������ָ���������
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
		System.out.println(age + "���ܣ�");
		//�����ջ�ڴ�����age����
		//��ô�ͽ�ԭ��ֱ����age�����û�вŵ����ڴ���ȥ��

		System.out.println(this.age + "���ܣ�");
		//�����Ҫ�����ڴ���ȥ�ң���ô�������Ե�ǰ��Ӹ�this
	}
}