public class DoubleArrayDemo{
	public static void main(String[] args){
		/*
			һά���飺
			int[]  arr = new int[6];
			�Ⱥŵ���ߣ�
				��ջ�ڴ��������һ������arr ���á�
			�Ⱥŵ��ұߣ�
				ͨ��new�ؼ����ڶ����洴����һ��6�����ȵ�����ʵ����󣬲�
				����һϵ�еĳ�ʼ��������ֵ��ʼ��Ϊ0��ͨ���ȺŽ����ڴ����ʮ�����Ƶ�ַ��ֵ��
				ջ�ڴ���arr���á�
				���ʱ��arr��ָ����ڴ��ʵ�塣
		*/
		//int[]  arr = new int[6];
		//System.out.println(arr);
		//��ά�����������ʽ
		//int[][] arr1 = new int[6][6];
		
		//int arr1[][] = new int[6][6];
		//arr1[1][2] = 5;

		/*System.out.println(arr1[1][2]);//0  ��ֵ
		System.out.println(arr1);//��ά����ĵ�ַ
		System.out.println(arr1[1]); //�ǵ�ά����ĵ�ַ
		System.out.println(arr1[1][1]);//0 ��ά����ľ���ָ
		System.out.println(arr1.length);//6  �����ж��ٸ���ά����
		System.out.println(arr1[1].length);//��ά����Ŀռ��� 6*/
		/*
			0
			[[I@5fd1358f
			[I@2013706e
			0
			6
			6
		*/

		//int[] arr2[], arr4;  arr2�Ƕ�ά���飬arr4��һά����

		/*int[] arr1[] = new int[6][6];
		arr1[0][5] = 12;
		arr1[4][4] = 21;*/

		//������ά����
		/*for (int i = 0;i < arr1.length ;i++ ){
			for (int j = 0; j < arr1[i].length; j++ ){
				System.out.print(arr1[i][j] + "  ");
			}
			System.out.println();
		}*/
		/*
			0  0  0  0  0  12
			0  0  0  0  0  0
			0  0  0  0  0  0
			0  0  0  0  0  0
			0  0  0  0  21  0
			0  0  0  0  0  0
		*/
		

		/*int[] arr2[] = new int[2][3];

		int[] arr3 = arr2[1];

		arr2[1][1] = 5;
		arr3[1] = 6;
		System.out.println(arr2[1][1]);*/
		
		/*int[][] arr4 = {
			{7,5,8},
			{11,4},
			{3,10,6,0}
		};*/

		//System.out.println(arr4[1][2]);//6   ArrayIndexOutOfBoundException;
		
		/*
			������130,600,400,150,1000
			�Ϻ���108,504,147
			���300,70,55
		*/
		int[] arr[]  = {
			{130,600,400,150,1000},
			{108,504,147},
			{300,70,55}
		};

		//�����˿�
		int sum = 0;
		for (int i = 0;i < arr.length ;i++ ){
			for (int j  = 0;j < arr[i].length ; j++ ){
				sum += arr[i][j];
			}
		}

		System.out.println("���������˿�����Ϊ��" +  sum);


		
		int[][] an = {
			{1,2, 3,  4},
			{5,6, 7,  8},
			{9,10,11,12},
			{1,2, 2,  3}
		};




		//���������⣺�����¶�ά���飬ʵ�ִ�ӡ˳��Ϊ���з�ʽ��
		int[][] arr = {
			{1, 2,  3,  4},
			{5, 6,  7,  8},
			{9, 10, 11, 12},
			{13,14, 15, 16}
		};
		//��ӡ˳��4 3 8 2 7 12 1 6 11 16 5 10 15 9 14 13

		























	}	
}