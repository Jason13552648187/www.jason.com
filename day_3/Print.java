public class Print{
	public  static void main(String[] agrs){
		//hello world
		//+号的两种使用方式：
		/*
			1：字符串和数字之间进行连接
				1）：首先将数值转换为字符串类型然后两者就可以进行一起显示
			2：数值之间的相加
				1):若两者都是数值类型，那么就直接进行相加
		
		*/
		System.out.println("hello world" + 56);
		System.out.println(56 + 36);
		System.out.println(56 + 36  + "hello world");

		System.out.println(6 + 6 + "=6+6");//12=6+6
		System.out.println("6+6=" + 6 + 6);//6+6=66
		System.out.println("6+6=" + (6 + 6));//6+6=12


		int num = 6;
		System.out.println(num + 5);
	}
}