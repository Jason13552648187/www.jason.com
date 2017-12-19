public class FunctionDemo{
	public static void main(String[] args){
		/*
		方法：
			就是解决一类问题的代码集合。
			{1加油
			2启动
			3踩离合
			4挂挡
			5耕地}
			方法的格式：
			[修饰符]  [返回值类型]  [方法的名称]（传入的参数列表）{
					//具体处理的代码块
					return  [返回值];
			}  
		*/
		int a = 5;
		int b = 3;
		System.out.println("准备进入show方法里");
		show(); 
		System.out.println("show 方法执行完毕，已跳出show方法。");
		
		
		//int num  = getMaxValue( a , b);

		//int sum = getSum(a ,b );
		//System.out.println("max value = " + num);
		//System.out.println(a + "与" + b  + "的和为 ：" + sum);
	}
	/*
	演示方法的运行过程
	*/
	public static void show(){
		System.out.println("进入了show 方法了");
		for (int i = 1;i <= 9 ;i++ ){
			for (int j = 1 ; j <= i ; j++){
				System.out.print(i + "x" +  j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}

		System.out.println("show执行完毕，准备返回");
	
	}



	/**
		求两个数的和
	*/

	public static int getSum(int a,int b){

		int c = a + b;
		return c;
	}








	/**
		一个方法，这个方法能解决两个数求最大值问题。
	*/
	public  static  int  getMaxValue(int  a , int b ){
		if (a > b){
			return a;
		}else{
			return b;
		}
	}
}