public class CarDemo{
	public static void main(String[] argrs){
			Car che = new Car();//通过new关键字来真正创建一辆车


			che.color = "red";//把车的color属性赋值  对象名.属性名称
			che.num = 7;//把车的轮胎装上
			che.run();//车开始跑了    对象名.方法名（）
			Person person = new Person();
			person.height = 210.0;
			person.name = "张三";
			person.age = 56;
			person.sex = "male";
			person.salary = 13000.0;

			person.run(12,52,41,32);
			person.sleep();
			person.study(12);
			person.eat();
	
	}
}
//人：
//属性：身高， 姓名，年龄，性别，工资
//行为：学习，跑步，吃饭，睡觉
//210，张三,56,male,13000
//跑步：谁在跑步
class Person{
	double height;
	String name;
	int age;
	String sex;
	double salary;
	
	void study(int hour){
		System.out.println("正在学习！已经学习了" + hour + "个小时");
	}

	void run(String name , int... nums){
		System.out.print(name + "在跑步！");
		for (int i : nums){
			System.out.print(i +  "  ");//nums数组
		}
	}

	void eat(){
		System.out.println(name + "在吃饭");
	}

	void  sleep(){
		System.out.println("正在睡觉中");
	}
}


class Car{
	//属性
	String	 color;  //成员变量
	int num;  //成员变量

	//行为
	void run(){   //成员方法
		int num2 = 45;

		System.out.println(color + " 溜了溜了，在大马路上跑！" + num);
	}
}







