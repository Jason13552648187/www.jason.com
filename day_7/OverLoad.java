public class OverLoad{
	public static void main(String[] args){
		
		int i = 5;
		int j = 4;
		int max = getMaxValue(i,j);
		int sum = getSum(i,j);
		System.out.println("max" + max + "�����Ϊ��" + sum);
		double num1 = 3.1;
		double num2 = 3.2;
		double num3 = 6.3;

		double max1 = getMaxValue(num1,num2);
		double sum1 = getSum(num1,num2,num3);
		System.out.println("max1= " + max1 + ",���Ϊ��"  + sum1);
	}

	/*��int���͵�ֵ�������*/
	public static int getSum(int a,int b){
		return a + b;
	}


	/*
		����double����ֵ�������
	*/
	public static double  getSum(double a ,double b){
		return a + b;
	
	}

	/*
		����double����ֵ�������
	*/
	public static double  getSum(double a ,double b,double c){
		return a + b + c;
	
	}






	/*
		��double�����������ֵ
	*/
	public static double getMaxValue(double a ,double b){
		return a>b?a:b;
	} 


	/*
	��int���������������ֵ
	*/
	public static int getMaxValue(int m,int n){
		return m>n?m:n;
	}

}