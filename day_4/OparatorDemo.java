public class OparatorDemo{
	public static void main(String[] agrs){

		/*
			�����������
			1��+
				1):��������
				2):������ֵ�����
			2:-
				1):��ֵ���
			3��*
				1):��ֵ�����
			4:/   ����ȡ����ֵ
				1):��ֵ�����
				2):���ڳ������߱�������������һ��ΪС������ô���Ҳ��С����
			5��%  ȡ�̺������
				1):ȡģ����
				2):������������ڳ����������ȡģ����
				3):���������С�ڳ���������Ǳ�����
				4):����ȡģ���㣺������������ֻ�뱻�����й�
		*/	
		/*System.out.println("hello world" + 35);
		System.out.println(36 + 25);


		System.out.println(63 - 25);

		System.out.println(12 * 3);

		System.out.println(15 / 3);
		System.out.println(16 / 3);//5

		System.out.println(16.0 / 3.0);//5.333333333333333
		System.out.println(16 / 3.0);//5.333333333333333
		System.out.println(16.0 / 3);//5.333333333333333


		System.out.println(16 % 3);//1
		//16 / 3 = 5.....1
		System.out.println(3 % 16);

		System.out.println(-16 % 3);//-1
		System.out.println(16 % -3);//1
*/


		/*
			�������㣺
				++��
					1):++����ǰ��
					2):++���ں���
					3):����++����ǰ�棬������Ƚ�ֵ����������Ȼ����д�ӡ��������������
						����++���ں��棬�����Ȱ�ֵ�ó�ȥ���в�����Ȼ���ڽ���������
				--��
					1):--����ǰ��
					2):--���ں���
					3):����--����ǰ�棬������Ƚ�ֵ�����Լ���Ȼ����д�ӡ��������������
						����--���ں��棬�����Ȱ�ֵ�ó�ȥ���в�����Ȼ���ڽ����Լ���
		*/

		/*int num1 = 5;
		//System.out.println(++num1);//6
		System.out.println(num1++);//6
		System.out.println("--------------------");
		int num2 = 6;
		//System.out.println(num2--);
		//System.out.println(num2);

		System.out.println(--num2);
		System.out.println(num2);
		

		System.out.println("----------------");
		int num3 = 5;
		num3 += 2;//num3 = num3 + 2

		System.out.println("num3=" + num3);

		System.out.println("----------------");
		int num4 = 4;
		num4 -= 2;//num4 = num4 - 2
		System.out.println("num4=" + num4);

		System.out.println("---------------------");
		int num5 = 12;
		//num5 %= 5;// num5 = num5 % 5   12 % 5 = 2.......2
*/

		//��ѯ
		/*num5 += num5 %= 2;  // num5 = num5 % 2   num5 = num5 + 0 = 0
		System.out.println("num5=" + num5);//2  num5=12

		System.out.println("---------------��ϵ�����-------------");
		//< <= == 
		//d
		int num6 = 4;
		int num7 = 5;
		System.out.println(num6 > num7);// false  
		//System.out.println(num6++ > num7);//false
		//System.out.println(++num6 >= num7);//false  
		System.out.println(num6 == num7);
		System.out.println(num6);

		System.out.println("--------------�߼������-------------");
		int num8 = 5;
		int num9 = 4;
		
		//&&
		System.out.println((num8 > 4) && (num9 < 2));//false
		//true  &&  false  = false
		//System.out.println((num8++ > 5)  && (num9-- > 3));
		//false  &&   true =  false
		//System.out.println((++num8 > 5)  && (--num9 > 3));
		// true &&   false  == false
		
		//System.out.println((++num8 > 5)  && (num8 > 6));
		//true &&  false = false
		//System.out.println((++num8 > 6)  && (num9-- > 6));
		//System.out.println(num9);//4
		//false  
		//&
		System.out.println((++num8 > 6)  & (num9-- > 6));
		System.out.println(num9);//3


		System.out.println("==============��============");
		int num10 = 12;
		int num11 = 14;
		//System.out.println(num10 > 10 ||  num11 > 15);
		//true   false = true 
		//System.out.println(num10 > 13 || num11 < 15); 
		//false   ||  true  =true  

		//System.out.println(num10 > 10 || num11-- < 15);
		//true 
		//System.out.println(num11);//14
		
		System.out.println(num10 > 10 | num11-- < 15);
		//true 
		System.out.println(num11);//13*/
		System.out.println("-------------��������� -------------");

		int  num12 = 5;
		int  num13 = 6;

		System.out.println(!(num12 > num13));//!false  = true
		System.out.println(!true);//false
		//System.out.println(!4);//���� һԪ����� '!' �Ĳ���������int����


		System.out.println("------------------");
		int num14 = 12;
		int num15 = 6;
		System.out.println(num14 & num15);
		/*
		��һ��������ֵת��Ϊ�����ƣ�
			0000 1100
		&   0000 0110
		----------------
			0000 0100  = 4 
		*/

		System.out.println("=-------------------");
		System.out.println(num14 | num15);
		/*
			0000 1100
		|   0000 0110
		----------------
			0000 1110 = 14
		
		*/

		System.out.println("---------------");
		System.out.println(num14 ^ num15);
		/*
			0000 1100
		^   0000 0110
		----------------
			0000 1010  = 10
		*/


		System.out.println("----------------");
		int num16 = 5;
		System.out.println(~num16);//-6
		/*
			~ ���룺0000 0101
		��λȡ����  1111 1010
			ȡ�������Ƿ������Ǹ����Ĳ�����ʽ����������Ҫ������ԭ��
			���Ի�Ҫ���в��� --->  ԭ��ת��

			��һ��  1111 1001
			ȡ����	1000 0110


			~9
			0000 1001������
			1111 0110:��λȡ��
			1111 0101:��һ
			1000 1010��ȡ�� -10
		*/
		int num17 = -9;
		System.out.println(~-9);
		/*
			1000 1001:ԭ��
			1111 0110:ȡ��
			1111 0111:��1  ����

			0000 1000����λȡ��  ԭ�롢���롢���붼һ��  8

			~-20
		*/



		System.out.println("---------λ������------------");
		int num18 = 5;
		System.out.println(num18 >> 3);
		/*
			000000 0000 0000 0000 0000 0000 0000 01  =  1
			56
		
		
		*/
		
		System.out.println("-------------------");
		
		int num19 = -8;
		System.out.println(num19 >> 1);
		/*
		100000 0000 0000 0000 0000 0000 0010 00
		1111111 1111 1111 1111 1111 1111 1110 0

		1000000 0000 0000 0000 0000 0000 0001 1
		1000000 0000 0000 0000 0000 0000 0010 0



		
		
		*/

		int num20 = 5;
		System.out.println(num20 >>> 2);
		int num21 = -6;
		System.out.println(num21 >>> 2);
		/*
			1000 0000 0000 0000 0000 0000 0000 0110 
			1111 1111 1111 1111 1111 1111 1111 1001
			001111 1111 1111 1111 1111 1111 1111 10
		*/



		System.out.println("-------------------");
		int num22 = 6;
		System.out.println(num22  << 3);
		/*
			0 0110000
		*/
		int num23 = -3;
		System.out.println(num23 << 2);
		



	}
}