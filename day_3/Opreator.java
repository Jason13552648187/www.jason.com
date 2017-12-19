public class Opreator{
	public static void main(String[] agrs){

		//隐式转换
		int num = 5; // 0000 0000 0000 0000 0000 0000 0000 0101  
		byte num2 = 3;//0000 0000 0000 0000 0000 0000 0000 0011  int num2
		System.out.println(num + num2);


		int num3 = 6;//0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0110
		long  num4 = 8;//0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 1000
		System.out.println(num3 + num4);

		int num5= 9;
		byte num6 = 2;
		byte num7 = (byte)(num5 + num6);//byte num7 =  int 11   错误: 可能损失精度
		//0000 1011
		//0000 0000
		System.out.println("num7=" + num7);




		int num8 = 3;
		byte num9 = 127;
		byte num10 = (byte)(num8 + num9);
		//num8 与 num9做相加的时候num9会自动提升到int类型
		//130  num10=-126   -127~128  -2^7+1 ~ 2^7
		//int  -2^31+1 ~ 2^31
		System.out.println("num10=" + num10);
		System.out.println((byte)130);
		System.out.println("------------------------");
		char a = 'b';
		System.out.println(a + 3);//  101
		System.out.println("b" + 3);// b3

		System.out.println("----------------");

		int num11 = 10;
		//num11 += 1;
		num11 = num11 + 1; 
		System.out.println("num11= " + num11);
		System.out.println("----------------");

		byte num12 = 12;
		//num12 += 1;  隐式转换 
		num12 = (byte)(num12 + 1);// 错误: 可能损失精度
		System.out.println("num12= " + num12);
		System.out.println("--------------");
		short  num13 = 12;
		//num13 += 1;
		//num13 = num13 + 1;
		
		System.out.println("num13= " + num13);

		System.out.println("----------------");
		System.out.println((char)('a' + 1));
		char c = '我';
		char d = '打';
		System.out.println((int)c + "" + (int)d);

		System.out.println("------二进制-------");
		int num14 = 0b0110;//6
		int num15 = 0b0101;//5
		System.out.println("num14 + num15 =" + (num14 + num15));
		System.out.println("------八进制------");
		int num16 = 01235;
		//5*8^0+3*8^1+2*8^2+1*8^3=5+24+128+512=669
		System.out.println("num16= " + num16);
		System.out.println("-------十六进制-----------");
		int num17 = 0xd2;//0123456789 a10  b11  c12  f15
		//2*16^0 + 13*16^1=2+208=210
		System.out.println("num17= " + num17);

		System.out.println("------------------");
		int num18 = 0b011101;
		//1+0+4+8+16=29
		System.out.println("num18 = " + num18);
		/*
		59/16----3.....b
		0x3b
		
		
		
		*/
		/*8：0000 1000:原码,实际计算机存储是补码。
			反码：0000 1000
			补码：0000 1000
			正数，的原码、反码、补码都是一样的。
		12：
			原码：0000 1100
			反码：0000 1100
			补码：0000 1100
		0                                      000 0000
		符号位：是0就表示是正数。是1就是负数              实际的表示值
		-8：原码：1   000 1000
			反码：1   111 0111
			补码：1   111 1000
		正数的原、反、补都是一样的。
		负数的反码是在原码基础上取反，补码又在反码基础上加1。
			1）：补码就是在原码基础上取反加1.

		-6:
			6：   1 000 0110 
			原码：1 000 0110
			反码：1 111 1001
			补码：1 111 1010
			36=32+4
			-36：
				原码：1 010 0100
				反码：1 101 1011
				补码：1 101 1100 

		*/


			
	}
}