import  java.util.Scanner;
	public static void main(String[] ags){
		Scanner sc = new Scanner(System.in);

		while (true){
		
			System.out.print("请输入编号1、2、3：");
			int num = sc.nextInt();

			if (num == 1){
				System.out.print("请输入要打印的层数:");
				int n = sc.nextInt();
				nMutilN(n);
				break;
			}else if (num == 2){
				
				System.out.print("请输入要打印的等腰三角形的层数：");
				int m = sc.nextInt();
				printSanJiao(m);
				
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
				fourNumberSort(m1,m2,m3,m4);
				/*
					m1  m2         m3   m4
					10  9          14   20
					10  9          14   20
					10  9          20   14
					20  9          10   14
					20  14         10   9
					20  14         10   9
				*/				
				break;
			}else  {
				System.out.println("输入有误，并重新输入、");
			}
		}
}


		/*
			打印n*n的乘法表
		*/
		public static void nMutilN(int n){
			for (int i = 1;i<= n;i++ ){
					for (int  j = 1;j<=i ;j++ ){
						System.out.print(j + "x" + i + "=" + (i*j) + "\t");
					}
					System.out.println();
				}
		}


		/*
		打印n层的等腰三角形
		
		*/
		public static void printSanJiao(int m ){
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
		}


		/*
			四个数的排序
		*/
		public static void fourNumberSort(int m1 ,int m2 ,int m3 ,int m4){
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
		
		}

	
}