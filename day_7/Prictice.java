import  java.util.Scanner;
public class Prictice{
	public static void main(String[] args){
		/*
		ii.	����do��whileѭ����ʵ��20���ڵ����Ľ׳ˡ���1!+2!+3!+��..+20!��




		1! = 1 
		2! = 1 * 2 = 2
		3! = 1*2*3 = 6
		4! = 1*2*3*4 = 24
		*/
		
		/*int sum1 = 0;
		int num2 = 1;
		do{
			int num = 1;
			int sum = 1;
			do{
				sum = sum * num;
				num ++;
			}
			while (num <= num2);
			num2++;
			sum1 = sum1 + sum;
		}
		while (num2 <= 4);
		System.out.println("sum1 = " + sum1);*/



		/*	
		���ó���ʵ�֣��û��Ӽ�������������ֵ�����������1��
		��������û�������ֵn����ӡn*n�ĳ˷������û�������Ǳ��2��
		��������û�������ֵm����ӡm����������Σ����û��������3��
		��������û�����4����ֵ,������4����ֵ�Ӵ�С���򲢴�ӡ��
		���û��������1,2,3,�������ֵ����ʾ���������������롣
		*/
		Scanner sc = new  Scanner(System.in);

/*
		while (true){
		
			System.out.print("��������1��2��3��");
			int num = sc.nextInt();


			if (num == 1){
				System.out.print("������Ҫ��ӡ�Ĳ���:");
				int n = sc.nextInt();
				for (int i = 1;i<= n;i++ ){
					for (int  j = 1;j<=i ;j++ ){
						System.out.print(j + "x" + i + "=" + (i*j) + "\t");
					}
					System.out.println();
				}
				break;
			}else if (num == 2){
				
				System.out.print("������Ҫ��ӡ�ĵ��������εĲ�����");
				int m = sc.nextInt();
				int count = m-1;
				for (int i = 1;i<=m ;i++ ){
					for (int j = 1;j <= count;j++ ){
						System.out.print(" ");
					}
					for (int k = 1;k <= i ; k++ ){
						System.out.print("* ");
					}
					System.out.println();
					count --;
				}
				break;
			}else if (num == 3){
				int m1 ,m2,m3 ,m4;
				System.out.print("�������һ������");
				m1 = sc.nextInt();
				System.out.print("������ڶ�������");
				m2 = sc.nextInt();
				System.out.print("���������������");
				m3 = sc.nextInt();
				System.out.print("��������ĸ�����");
				m4 = sc.nextInt();
				
				m1  m2         m3   m4
				10  9          14   20
				10  9          14   20
				10  9          20   14
				20  9          10   14
				20  14         10   9
				20  14         10   9
				
				if (m1 < m2 ){                                                               
					m1 = m1 + m2;
					m2 = m1 - m2;
					m1 = m1 - m2;
				}
				if (m3 <  m4){
					m3 = m3 + m4;
					m4 = m3 - m4;
					m3 = m3 - m4;
				}
				if (m1 < m3){
					m1 = m1 + m3;
					m3 = m1 - m3;
					m1 = m1 - m3;
				}
				if (m2 < m4 ){
					m2 = m2 + m4;
					m4 = m2 - m4;
					m2 = m2 - m4;
				}
				if (m2 < m3 ){
					m2 = m2 + m3;
					m3 = m2 - m3;
					m2 = m2 - m3;
				}
				System.out.println(m1 + " " + m2 + " " + m3 + " " + m4);
				break;
			}else  {
				System.out.println("�������󣬲��������롢");
			}
		}
		*/
		for (int i = 1;i <= 10 ;i++ ){
			if (i%2 == 0){
				continue;
			}
			else {
				System.out.print( i + " ");
			}
		}
	}
}