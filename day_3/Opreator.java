public class Opreator{
	public static void main(String[] agrs){

		//��ʽת��
		int num = 5; // 0000 0000 0000 0000 0000 0000 0000 0101  
		byte num2 = 3;//0000 0000 0000 0000 0000 0000 0000 0011  int num2
		System.out.println(num + num2);


		int num3 = 6;//0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0110
		long  num4 = 8;//0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 1000
		System.out.println(num3 + num4);

		int num5= 9;
		byte num6 = 2;
		byte num7 = (byte)(num5 + num6);//byte num7 =  int 11   ����: ������ʧ����
		//0000 1011
		//0000 0000
		System.out.println("num7=" + num7);




		int num8 = 3;
		byte num9 = 127;
		byte num10 = (byte)(num8 + num9);
		//num8 �� num9����ӵ�ʱ��num9���Զ�������int����
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
		//num12 += 1;  ��ʽת�� 
		num12 = (byte)(num12 + 1);// ����: ������ʧ����
		System.out.println("num12= " + num12);
		System.out.println("--------------");
		short  num13 = 12;
		//num13 += 1;
		//num13 = num13 + 1;
		
		System.out.println("num13= " + num13);

		System.out.println("----------------");
		System.out.println((char)('a' + 1));
		char c = '��';
		char d = '��';
		System.out.println((int)c + "" + (int)d);

		System.out.println("------������-------");
		int num14 = 0b0110;//6
		int num15 = 0b0101;//5
		System.out.println("num14 + num15 =" + (num14 + num15));
		System.out.println("------�˽���------");
		int num16 = 01235;
		//5*8^0+3*8^1+2*8^2+1*8^3=5+24+128+512=669
		System.out.println("num16= " + num16);
		System.out.println("-------ʮ������-----------");
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
		/*8��0000 1000:ԭ��,ʵ�ʼ�����洢�ǲ��롣
			���룺0000 1000
			���룺0000 1000
			��������ԭ�롢���롢���붼��һ���ġ�
		12��
			ԭ�룺0000 1100
			���룺0000 1100
			���룺0000 1100
		0                                      000 0000
		����λ����0�ͱ�ʾ����������1���Ǹ���              ʵ�ʵı�ʾֵ
		-8��ԭ�룺1   000 1000
			���룺1   111 0111
			���룺1   111 1000
		������ԭ������������һ���ġ�
		�����ķ�������ԭ�������ȡ�����������ڷ�������ϼ�1��
			1�������������ԭ�������ȡ����1.

		-6:
			6��   1 000 0110 
			ԭ�룺1 000 0110
			���룺1 111 1001
			���룺1 111 1010
			36=32+4
			-36��
				ԭ�룺1 010 0100
				���룺1 101 1011
				���룺1 101 1100 

		*/


			
	}
}