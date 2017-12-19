public class OparatorDemo{
	public static void main(String[] agrs){

		/*
			算术运算符：
			1：+
				1):用作连接
				2):用作数值的相加
			2:-
				1):数值相减
			3：*
				1):数值的相乘
			4:/   除法取得商值
				1):数值的相除
				2):对于除数或者被除数中其中有一个为小数，那么结果也是小数。
			5：%  取商后的余数
				1):取模运算
				2):如果被除数大于除数，结果是取模运算
				3):如果被除数小于除数，结果是被除数
				4):对于取模运算：运算结果的正负只与被除数有关
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
			自增运算：
				++：
					1):++放在前面
					2):++放在后面
					3):对于++放在前面，表达是先将值进行自增，然后进行打印，或者其他操作
						对于++放在后面，表达的先把值拿出去进行操作，然后在进行自增。
				--：
					1):--放在前面
					2):--放在后面
					3):对于--放在前面，表达是先将值进行自减，然后进行打印，或者其他操作
						对于--放在后面，表达的先把值拿出去进行操作，然后在进行自减。
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

		//查询
		/*num5 += num5 %= 2;  // num5 = num5 % 2   num5 = num5 + 0 = 0
		System.out.println("num5=" + num5);//2  num5=12

		System.out.println("---------------关系运算符-------------");
		//< <= == 
		//d
		int num6 = 4;
		int num7 = 5;
		System.out.println(num6 > num7);// false  
		//System.out.println(num6++ > num7);//false
		//System.out.println(++num6 >= num7);//false  
		System.out.println(num6 == num7);
		System.out.println(num6);

		System.out.println("--------------逻辑运算符-------------");
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


		System.out.println("==============或============");
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
		System.out.println("-------------非运算符！ -------------");

		int  num12 = 5;
		int  num13 = 6;

		System.out.println(!(num12 > num13));//!false  = true
		System.out.println(!true);//false
		//System.out.println(!4);//报错： 一元运算符 '!' 的操作数类型int错误


		System.out.println("------------------");
		int num14 = 12;
		int num15 = 6;
		System.out.println(num14 & num15);
		/*
		第一步：将数值转换为二进制：
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
			~ 补码：0000 0101
		按位取反：  1111 1010
			取反后我们发现这是负数的补码形式，但是我们要看它的原码
			所以还要进行补码 --->  原码转换

			减一：  1111 1001
			取反：	1000 0110


			~9
			0000 1001：补码
			1111 0110:按位取反
			1111 0101:减一
			1000 1010：取反 -10
		*/
		int num17 = -9;
		System.out.println(~-9);
		/*
			1000 1001:原码
			1111 0110:取反
			1111 0111:加1  补码

			0000 1000：按位取反  原码、反码、补码都一样  8

			~-20
		*/



		System.out.println("---------位移运算------------");
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