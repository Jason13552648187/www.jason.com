public class OparatorDemo{
	public static void main(String[] args){
		//��Ŀ�����
		//��ʽ��   �������ʽ?���ʽ1�����ʽ2
		int num1 = 45;
		int num2 = 56;
		int num3 = num1 > num2?num1:num2; // 56
		//ʵ����һ�������������ֵ
		/*
			���ȶ��������ʽ����ִ�У���ִ�еĽ��Ϊtrue���棩,��ô��ִ�б��ʽ1,
			����ִ�з��ر��ʽ2.
		*/
		System.out.println("num3= " + num3);
		System.out.println("----------------------");
		int num4 = 12;
		int num5 = 13;
		int num6 = 10;
		//ʵ�ֶ������������ֵ
		/*
			�ȱȽ������������ֵ���õ����ֵ֮���ø�ֵ��
			���������У�Ȼ��ó����ֵ��
		*/
		//int num7 = num4 > num5 ? num4 : num5;
		//ʵ����num4 ��num5 �ıȽϲ������ֵ���ز���ֵ��num7,��ônum7�ʹ洢����
		//�����������ֵ��
		//int num8 = num7 > num6?num7 : num6;
		//����ʵ���������������ֵ
		//System.out.println("num4,num5,num6֮������ֵΪ��" +  num8);
		System.out.println("-------�����������ֵ���Ż�------");

		int num7 = num4 > num5 ? (num4 > num6 ?num4:num6 ):(num5 > num6 ? num5:num6);
		/*
			���Ƚ�num4��num5���бȽϣ�������Ϊtrue��˵��num4 ���� num5 ,Ȼ������
			�õ�num4 �͵����������бȽ�,ͬ���������ֱȽ�Ҳ�������������������Ԫ
			�������Ƕ�ס�
		z
		*/
		System.out.println("num4,num5,num6֮������ֵΪ��" +  num7);
		System.out.println("-------------------");
		int a = 45;
		int b = 34;
		int c = 36;
		int d = a > b ?( b < c ?b : c ) :  (a > c ? c : a);
		System.out.println("d= " + d);
		/*
			����������Сֵ
			
		*/
		System.out.println("---------------------");

		
		 
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}