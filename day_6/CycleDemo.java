import java.util.Scanner;
public  class CycleDemo{
	public static void main(String[] args){
		/*
			条件型循环：while 
				1）：当型循环：
					while(//条件){
						//循环体
					}
		
		*/
		//从12到20的一个打印
		/*int num1 = 12;
		while (num1 < 20){  //true  false
			System.out.print( num1 + " ");//12 13 14 15 16 17 18 19
			//num1++;
		}*/
		

		//System.out.println("--------------------");
		//1 ~ 100的求和 
		/*int num2 = 1;
		int sum = 0;
		
		while (num2 <= 100){
			
			//执行求和的过程
			//sum += num2;
			sum = sum + num2;
			num2++;
		}
		System.out.println("sum = " + sum);
		*/
		//1 3 5 7 9.............100求和
	
		//奇数求和
		/*
		int num3 = 2;
		int sum = 0;

		while (num3 <= 100){
			sum = sum + num3;
			num3 = num3 + 2;
		}
		System.out.println("sum = " + sum);*/


		//求2 ~ 100以内的奇数求和
		/*while (num3 <= 100 ){
			if (num3 % 2 == 1){
				sum = sum + num3;
			}
			num3 ++;
		}
		System.out.println("sum=" + sum);
		
		*/
		//从键盘输入起始值，终止值，求这个范围内的奇数和偶数求和。
		/*Scanner sc = new Scanner(System.in);
		System.out.print("请输入起始值：");
		//输入起始值
		int num4 = sc.nextInt();
		//因为起始值在后面会自增，所以用一个临时变量来存储
		int num6 = num4;
		System.out.print("请输入终止值：");
		//输入终止值
		int num5 = sc.nextInt();
		int sum1 = 0;//定义一个变量来存储后面求得奇数和
		int sum2 = 0;//定义一个变量来存储后面求得偶数和
		while (num4 <= num5){ //从起始值循环到终止值
			if (num4 % 2 == 1){//判断是否为奇数
				sum1 = sum1 + num4;//若是奇数就存储到sum1里
			}else{//否则为偶数
				sum2 = sum2 + num4;//将偶数存储到sum2里
			}
			num4++;//自增
		}
		System.out.println(num6 + "到" + num5 + "的奇数和为：" + sum1 + "，偶数和为：" + sum2);//打印结果
*/

		//99乘法表：
		/*
		1x1=1
		1x2=2 2x2=4
		1x3=3 2x3=6 3x3=9
		........

		1x9=9 2x9=18 ......................9x9=81
		*/

		/*int i = 1;
		while (i <= 9){ // i =1 i =2 i=3
			int j = 1;
			while (j <= i){ // j = 3 
				System.out.print(j + "x" + i + "=" + i*j + "\t");
				j++;
			}
			System.out.println();
			i++;// i =2  i =3
		}*/

		/*
			1x1=1 
			1x2=2 2x2=4
			.....

			1x9=9......... 9x9=81
		*/

		//System.out.println("--------------------直到型循环---------------");

		/*
		do{
			//循环体
		}
		while (//条件表达式)
		*/

		/*
		int num6 = 1;
		do{
			System.out.println(num6 + " ");
			num6++;
		}
		while (num6 <= 10);
*/

		//1~100的求和
		/*int sum = 0;
		int  i = 1;
		do{
			sum = sum + i;
			i++;
		}
		while (i<=100);

		System.out.println("sum=" + sum);*/
		//99乘法表
		/*int i = 1;

		do{
			int  j = 1;
			do{
				System.out.print(j + "x" + i + "=" + i*j  + "\t");
				j++;
			}
			while (j<=i);
			i++;
			System.out.println();
		}
		while (i <= 9);*/

		//


		//for循环
		//System.out.println("==============");
		/*
			格式：
			for（ 初始化；条件 ；参数更新）{}
		*/
		//从1~9打印
		/*for (int i = 1; i <= 9; i++){
			System.out.print(i + " ");// 1 2 3 4 5 6 7 8 9
		}*/
		//99乘法表
		/*for (int i = 1;i <= 9 ; i++){
			for (int j = 1; j <= i; j++ ){
				System.out.print(j + "x" + i + "=" + j*i + "\t");
			}
			System.out.println();
		}*/





/*	

等腰三角形

		*
	   * *
	  * * *
	 * * * *
	* * * * *
   * * * * * *
  * * * * * * * 
 * * * * * * * *
* * * * * * * * *

*/

	/*Scanner sc = new Scanner(System.in);
	System.out.print("请输入三角形的层数：");
	int level = sc.nextInt();
	int count = level - 1;
	for ( int i = 1;i <= level;i++ ){
		for (int j = 1; j <= count;j++ ){
			System.out.print(" ");
		}
		for (int k = 1; k <= i;k++ ){
			System.out.print("* ");
		}
		System.out.println();
		count--;
	}*/

	/*for (int i = 1 ; i <= 10;i++ ){
		if (i == 5){
			break;
		}
		System.out.println( i + " ");
		
	}*/
	/*
1
2
3
4
	*/
	for (int i = 1 ;i <= 10 ; i++ ){
		if (i%2 == 0){
			continue;
		}
		System.out.println( i + " " );
	}
/*
1
3
5
7
9
*/

	}
}