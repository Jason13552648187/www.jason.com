import java.util.Scanner;
public class DataInputDemo{
	public static void main(String[] ags){
		/*
			�Ӽ����������ݵĲ��裺
				1:�����������Ϊ����Ҫʹ��ĳһ����
					import  java.util.Scanner;
				2):����һ������
					Scanner  zhangSan = new Scanner(System.in);
				3��������������ˣ��������������飬
					
		*/
		//��������
		Scanner sc = new Scanner(System.in);

		//�ö�������������飬�Ӽ�������int�������ݣ����洢��num������ȥ
		//System.out.println("������int���͵����ݣ�");
		//int num = sc.nextInt();
		//System.out.println("�������ַ������͵����ݣ�");
		//String  str = sc.nextLine();
		//System.out.println("num=" + num);
		//System.out.println("str = " +  str);
		//int num = sc.nextInt();
		//System.out.println("num=" + num);
		

		//��̬����������֮��
		/*System.out.print("�������һ��������");
		int num1 =  sc.nextInt();
		System.out.print("������ڶ���������");
		int num2 =  sc.nextInt();
		
		int num3 = num1 + num2;
		System.out.println("����֮��Ϊ��" + num3);*/

		//�������������ֵ
		System.out.print("input first number please:");//print
		int a =  sc.nextInt();
		System.out.print("input second number please:");
		int b = sc.nextInt();
		System.out.println( a + "��" + b + "'s Maxnuim value is ��" + (a>b?a:b));



	}
} 