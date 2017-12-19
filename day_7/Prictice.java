import  java.util.Scanner;
public class Prictice{
	public static void main(String[] args){
		/*
		ii.	请用do…while循环来实现20以内的数的阶乘。（1!+2!+3!+…..+20!）




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
		请用程序实现：用户从键盘输入整形数值，若输入的是1，
		则继续让用户输入数值n并打印n*n的乘法表。若用户输入的是编号2，
		则继续让用户输入数值m并打印m层等腰三角形，若用户输入的是3，
		则继续让用户输入4个数值,并将这4个数值从大到小排序并打印。
		若用户输入除了1,2,3,以外的数值则提示输入有误并重新输入。
		*/
		Scanner sc = new  Scanner(System.in);

/*
		while (true){
		
			System.out.print("请输入编号1、2、3：");
			int num = sc.nextInt();


			if (num == 1){
				System.out.print("请输入要打印的层数:");
				int n = sc.nextInt();
				for (int i = 1;i<= n;i++ ){
					for (int  j = 1;j<=i ;j++ ){
						System.out.print(j + "x" + i + "=" + (i*j) + "\t");
					}
					System.out.println();
				}
				break;
			}else if (num == 2){
				
				System.out.print("请输入要打印的等腰三角形的层数：");
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
				System.out.print("请输入第一个数：");
				m1 = sc.nextInt();
				System.out.print("请输入第二个数：");
				m2 = sc.nextInt();
				System.out.print("请输入第三个数：");
				m3 = sc.nextInt();
				System.out.print("请输入第四个数：");
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
				System.out.println("输入有误，并重新输入、");
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