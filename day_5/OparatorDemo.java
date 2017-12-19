public class OparatorDemo{
	public static void main(String[] args){
		//三目运算符
		//格式：   条件表达式?表达式1：表达式2
		int num1 = 45;
		int num2 = 56;
		int num3 = num1 > num2?num1:num2; // 56
		//实现了一个两个数求最大值
		/*
			首先对条件表达式进行执行，若执行的结果为true（真）,那么就执行表达式1,
			否则执行返回表达式2.
		*/
		System.out.println("num3= " + num3);
		System.out.println("----------------------");
		int num4 = 12;
		int num5 = 13;
		int num6 = 10;
		//实现对三个数求最大值
		/*
			先比较两个数的最大值，得到最大值之后用该值与
			第三数进行，然后得出最大值。
		*/
		//int num7 = num4 > num5 ? num4 : num5;
		//实现了num4 和num5 的比较并将最大值返回并赋值给num7,那么num7就存储了这
		//两个数的最大值。
		//int num8 = num7 > num6?num7 : num6;
		//最终实现了三个数求最大值
		//System.out.println("num4,num5,num6之间的最大值为：" +  num8);
		System.out.println("-------三个数求最大值的优化------");

		int num7 = num4 > num5 ? (num4 > num6 ?num4:num6 ):(num5 > num6 ? num5:num6);
		/*
			首先将num4与num5进行比较，如果结果为true，说明num4 大于 num5 ,然后我们
			拿到num4 和第三个数进行比较,同样道理这种比较也可以用三运算符，即三元
			运算符的嵌套。
		z
		*/
		System.out.println("num4,num5,num6之间的最大值为：" +  num7);
		System.out.println("-------------------");
		int a = 45;
		int b = 34;
		int c = 36;
		int d = a > b ?( b < c ?b : c ) :  (a > c ? c : a);
		System.out.println("d= " + d);
		/*
			求三个数最小值
			
		*/
		System.out.println("---------------------");

		
		 
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}