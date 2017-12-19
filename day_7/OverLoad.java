public class OverLoad{
	public static void main(String[] args){
		
		int i = 5;
		int j = 4;
		int max = getMaxValue(i,j);
		int sum = getSum(i,j);
		System.out.println("max" + max + "，求和为：" + sum);
		double num1 = 3.1;
		double num2 = 3.2;
		double num3 = 6.3;

		double max1 = getMaxValue(num1,num2);
		double sum1 = getSum(num1,num2,num3);
		System.out.println("max1= " + max1 + ",求和为："  + sum1);
	}

	/*对int类型的值进行求和*/
	public static int getSum(int a,int b){
		return a + b;
	}


	/*
		对于double类型值进行求和
	*/
	public static double  getSum(double a ,double b){
		return a + b;
	
	}

	/*
		对于double类型值进行求和
	*/
	public static double  getSum(double a ,double b,double c){
		return a + b + c;
	
	}






	/*
		求double两个数的最大值
	*/
	public static double getMaxValue(double a ,double b){
		return a>b?a:b;
	} 


	/*
	求int类型两个数的最大值
	*/
	public static int getMaxValue(int m,int n){
		return m>n?m:n;
	}

}