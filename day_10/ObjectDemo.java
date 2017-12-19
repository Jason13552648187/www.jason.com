public class ObjectDemo{
	public static void main(String[] args){
		Person person = new Person(45,'ÄÐ',"ÕÅÈý");
		System.out.println(person.getSex() + "  " + person.getAge() + "  "  +
			person.getName());

		getMaxValue(person);
		person.get
	}
}


class Person{
	private int age;
	private char sex;
	private String name;
	
	public Person(){
	
	}

	public Person(int age ,char sex,String name){
		this.age = age;
		this.sex = sex;
		this.name = name;
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
	
	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
}