public class CarDemo{
	public static void main(String[] argrs){
			Car che = new Car();//ͨ��new�ؼ�������������һ����


			che.color = "red";//�ѳ���color���Ը�ֵ  ������.��������
			che.num = 7;//�ѳ�����̥װ��
			che.run();//����ʼ����    ������.����������
			Person person = new Person();
			person.height = 210.0;
			person.name = "����";
			person.age = 56;
			person.sex = "male";
			person.salary = 13000.0;

			person.run(12,52,41,32);
			person.sleep();
			person.study(12);
			person.eat();
	
	}
}
//�ˣ�
//���ԣ���ߣ� ���������䣬�Ա𣬹���
//��Ϊ��ѧϰ���ܲ����Է���˯��
//210������,56,male,13000
//�ܲ���˭���ܲ�
class Person{
	double height;
	String name;
	int age;
	String sex;
	double salary;
	
	void study(int hour){
		System.out.println("����ѧϰ���Ѿ�ѧϰ��" + hour + "��Сʱ");
	}

	void run(String name , int... nums){
		System.out.print(name + "���ܲ���");
		for (int i : nums){
			System.out.print(i +  "  ");//nums����
		}
	}

	void eat(){
		System.out.println(name + "�ڳԷ�");
	}

	void  sleep(){
		System.out.println("����˯����");
	}
}


class Car{
	//����
	String	 color;  //��Ա����
	int num;  //��Ա����

	//��Ϊ
	void run(){   //��Ա����
		int num2 = 45;

		System.out.println(color + " �������ˣ��ڴ���·���ܣ�" + num);
	}
}







