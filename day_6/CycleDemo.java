import java.util.Scanner;
public  class CycleDemo{
	public static void main(String[] args){
		/*
			������ѭ����while 
				1��������ѭ����
					while(//����){
						//ѭ����
					}
		
		*/
		//��12��20��һ����ӡ
		/*int num1 = 12;
		while (num1 < 20){  //true  false
			System.out.print( num1 + " ");//12 13 14 15 16 17 18 19
			//num1++;
		}*/
		

		//System.out.println("--------------------");
		//1 ~ 100����� 
		/*int num2 = 1;
		int sum = 0;
		
		while (num2 <= 100){
			
			//ִ����͵Ĺ���
			//sum += num2;
			sum = sum + num2;
			num2++;
		}
		System.out.println("sum = " + sum);
		*/
		//1 3 5 7 9.............100���
	
		//�������
		/*
		int num3 = 2;
		int sum = 0;

		while (num3 <= 100){
			sum = sum + num3;
			num3 = num3 + 2;
		}
		System.out.println("sum = " + sum);*/


		//��2 ~ 100���ڵ��������
		/*while (num3 <= 100 ){
			if (num3 % 2 == 1){
				sum = sum + num3;
			}
			num3 ++;
		}
		System.out.println("sum=" + sum);
		
		*/
		//�Ӽ���������ʼֵ����ֵֹ���������Χ�ڵ�������ż����͡�
		/*Scanner sc = new Scanner(System.in);
		System.out.print("��������ʼֵ��");
		//������ʼֵ
		int num4 = sc.nextInt();
		//��Ϊ��ʼֵ�ں����������������һ����ʱ�������洢
		int num6 = num4;
		System.out.print("��������ֵֹ��");
		//������ֵֹ
		int num5 = sc.nextInt();
		int sum1 = 0;//����һ���������洢�������������
		int sum2 = 0;//����һ���������洢�������ż����
		while (num4 <= num5){ //����ʼֵѭ������ֵֹ
			if (num4 % 2 == 1){//�ж��Ƿ�Ϊ����
				sum1 = sum1 + num4;//���������ʹ洢��sum1��
			}else{//����Ϊż��
				sum2 = sum2 + num4;//��ż���洢��sum2��
			}
			num4++;//����
		}
		System.out.println(num6 + "��" + num5 + "��������Ϊ��" + sum1 + "��ż����Ϊ��" + sum2);//��ӡ���
*/

		//99�˷���
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

		//System.out.println("--------------------ֱ����ѭ��---------------");

		/*
		do{
			//ѭ����
		}
		while (//�������ʽ)
		*/

		/*
		int num6 = 1;
		do{
			System.out.println(num6 + " ");
			num6++;
		}
		while (num6 <= 10);
*/

		//1~100�����
		/*int sum = 0;
		int  i = 1;
		do{
			sum = sum + i;
			i++;
		}
		while (i<=100);

		System.out.println("sum=" + sum);*/
		//99�˷���
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


		//forѭ��
		//System.out.println("==============");
		/*
			��ʽ��
			for�� ��ʼ�������� ���������£�{}
		*/
		//��1~9��ӡ
		/*for (int i = 1; i <= 9; i++){
			System.out.print(i + " ");// 1 2 3 4 5 6 7 8 9
		}*/
		//99�˷���
		/*for (int i = 1;i <= 9 ; i++){
			for (int j = 1; j <= i; j++ ){
				System.out.print(j + "x" + i + "=" + j*i + "\t");
			}
			System.out.println();
		}*/





/*	

����������

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
	System.out.print("�����������εĲ�����");
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