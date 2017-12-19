public class DoubleArrayDemo{
	public static void main(String[] args){
		/*
			一维数组：
			int[]  arr = new int[6];
			等号的左边：
				在栈内存里，申明了一个数组arr 引用。
			等号的右边：
				通过new关键字在堆里面创建了一个6个长度的数组实体对象，并
				进行一系列的初始化，将数值初始化为0，通过等号将堆内存的中十六进制地址赋值给
				栈内存中arr引用。
				这个时候arr就指向堆内存的实体。
		*/
		//int[]  arr = new int[6];
		//System.out.println(arr);
		//二维数组的申明方式
		//int[][] arr1 = new int[6][6];
		
		//int arr1[][] = new int[6][6];
		//arr1[1][2] = 5;

		/*System.out.println(arr1[1][2]);//0  数值
		System.out.println(arr1);//二维数组的地址
		System.out.println(arr1[1]); //是低维数组的地址
		System.out.println(arr1[1][1]);//0 低维数组的具体指
		System.out.println(arr1.length);//6  计数有多少个低维数组
		System.out.println(arr1[1].length);//低维数组的空间数 6*/
		/*
			0
			[[I@5fd1358f
			[I@2013706e
			0
			6
			6
		*/

		//int[] arr2[], arr4;  arr2是二维数组，arr4是一维数组

		/*int[] arr1[] = new int[6][6];
		arr1[0][5] = 12;
		arr1[4][4] = 21;*/

		//遍历二维数组
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
			北京：130,600,400,150,1000
			上海：108,504,147
			天津：300,70,55
		*/
		int[] arr[]  = {
			{130,600,400,150,1000},
			{108,504,147},
			{300,70,55}
		};

		//求总人口
		int sum = 0;
		for (int i = 0;i < arr.length ;i++ ){
			for (int j  = 0;j < arr[i].length ; j++ ){
				sum += arr[i][j];
			}
		}

		System.out.println("三个城市人口总数为：" +  sum);


		
		int[][] an = {
			{1,2, 3,  4},
			{5,6, 7,  8},
			{9,10,11,12},
			{1,2, 2,  3}
		};




		//美团面试题：有以下二维数组，实现打印顺序为下列方式。
		int[][] arr = {
			{1, 2,  3,  4},
			{5, 6,  7,  8},
			{9, 10, 11, 12},
			{13,14, 15, 16}
		};
		//打印顺序：4 3 8 2 7 12 1 6 11 16 5 10 15 9 14 13

		























	}	
}