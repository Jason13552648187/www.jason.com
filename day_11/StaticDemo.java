public class StaticDemo{
	public static void main(String[] agrs){
		/*Person person = new Person();
		Person person1 = new Person();
		System.out.println(person.water + "   " +  person1.water + "  " + Person.water);
		Person.run();//对象也可以调用
		Person.age;*/
		//Person person = new Person();
		int[] arr = {10,44,52,5852,4552,5,12};
		ArrayTool.printArray(arr);
		int[] arr1 = ArrayTool.selectSort(arr);
		System.out.println();
		for (int j : arr1){
			System.out.print(j + "  ");
		}
	}
}

class ArrayTool{
		
	static void printArray(int[] arr){
		for (int i : arr){
			System.out.print(i + "  ");
		}
	}


	static int[] selectSort(int[] arr){
		for (int i = 0;i < arr.length ;i++ ){
			for (int  j = i;j < arr.length ;j++ ){
				if (arr[j]> arr[i]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	
	}
}

class Person{
	int age;
	String name;
	String water;
	static String country = "中国";

	
	static{
		System.out.println("hello world");
	}


	public Person(String country){
		this.country = country;
	}

	static void run(){
		System.out.println("跑！");
	}
}


class Person{
	int age;
	String name;
	char age;
	static String country = "zh_cn";
	public  static void show(){
		System.out.println(this.name + "在show ....." + age);
	}
}