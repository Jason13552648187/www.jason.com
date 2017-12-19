import java.util.Scanner;
public class DataInputDemo{
	public static void main(String[] ags){
		/*
			从键盘输入数据的步骤：
				1:）导入包，因为我们要使用某一个类
					import  java.util.Scanner;
				2):创建一个对象。
					Scanner  zhangSan = new Scanner(System.in);
				3）：让这个对象（人）来帮我们做事情，
					
		*/
		//创建对象
		Scanner sc = new Scanner(System.in);

		//让对象帮我们做事情，从键盘输入int类型数据，并存储到num变量里去
		//System.out.println("请输入int类型的数据：");
		//int num = sc.nextInt();
		//System.out.println("请输入字符串类型的数据：");
		//String  str = sc.nextLine();
		//System.out.println("num=" + num);
		//System.out.println("str = " +  str);
		//int num = sc.nextInt();
		//System.out.println("num=" + num);
		

		//动态求两个数的之和
		/*System.out.print("请输入第一个变量：");
		int num1 =  sc.nextInt();
		System.out.print("请输入第二个变量：");
		int num2 =  sc.nextInt();
		
		int num3 = num1 + num2;
		System.out.println("两数之和为：" + num3);*/

		//求两个数的最大值
		System.out.print("input first number please:");//print
		int a =  sc.nextInt();
		System.out.print("input second number please:");
		int b = sc.nextInt();
		System.out.println( a + "与" + b + "'s Maxnuim value is ：" + (a>b?a:b));



	}
} 