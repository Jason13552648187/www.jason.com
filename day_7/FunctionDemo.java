public class FunctionDemo{
	public static void main(String[] args){
		/*
		������
			���ǽ��һ������Ĵ��뼯�ϡ�
			{1����
			2����
			3�����
			4�ҵ�
			5����}
			�����ĸ�ʽ��
			[���η�]  [����ֵ����]  [����������]������Ĳ����б�{
					//���崦��Ĵ����
					return  [����ֵ];
			}  
		*/
		int a = 5;
		int b = 3;
		System.out.println("׼������show������");
		show(); 
		System.out.println("show ����ִ����ϣ�������show������");
		
		
		//int num  = getMaxValue( a , b);

		//int sum = getSum(a ,b );
		//System.out.println("max value = " + num);
		//System.out.println(a + "��" + b  + "�ĺ�Ϊ ��" + sum);
	}
	/*
	��ʾ���������й���
	*/
	public static void show(){
		System.out.println("������show ������");
		for (int i = 1;i <= 9 ;i++ ){
			for (int j = 1 ; j <= i ; j++){
				System.out.print(i + "x" +  j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}

		System.out.println("showִ����ϣ�׼������");
	
	}



	/**
		���������ĺ�
	*/

	public static int getSum(int a,int b){

		int c = a + b;
		return c;
	}








	/**
		һ����������������ܽ�������������ֵ���⡣
	*/
	public  static  int  getMaxValue(int  a , int b ){
		if (a > b){
			return a;
		}else{
			return b;
		}
	}
}