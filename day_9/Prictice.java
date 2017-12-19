import java.util.Scanner;
public class Prictice{
	public static void main(String[] args){
		//int[] arr = new int[]{41,52,16,62,71,42,36,76,67,3};
		//Prictice(arr);
		//Prictice1();
		//Prictice2();
		//Prictice3();
		//Prictice4();
		//Prictice5();
		//Prictice6();
		//Prictice7();
		//Prictice8();
		//Prictice9();
		//Prictice10();
		Prictice11();
	}
	public static void Prictice11(){
		int[] arr =  {10,20,30,50,42,20,10,30,70,40,10,45,51,51,22,51,66,22,552,22,65,22,12};
		/*10 2
			20 2 
			30 2
			40 1
			50 1
			42 1 
			70 1
			搞for循环
		*/
		for (int i = 0;i < arr.length ;i++ ){
			int count = 0;

			boolean flag = false;
			//排重:从第一角标看是否与当前的数一致，若一致说明前面已经统计过了，否则继续
			for (int j = 0;j < i ; j++){
				if (arr[i] == arr[j]){
					flag = true;
					break;
				}
			}
		 
			if (flag == true){
				continue;
			}
			for (int o = i;o < arr.length ;o++ ){
				if (arr[i] == arr[o]){
					count ++;
				}
			}
			System.out.println(arr[i] + "出现了" + count + "次！");
		}
	}
	
	
	public static void Prictice10(){
		//要求删除某一个位置的元素，后边元素前移。
		int[]  arr = {12,52,32,41,13,84,61,34,64,17};
		int num = 41;
		
		int index = 0;//记录角标
		for (int i = 0;i < arr.length ;i++ ){
			if (arr[i] == num){
				index = i;
			}
		}
		//空缺位补全，其实就是后面的数依次向前进
		for (int j = index;j < arr.length-1 ;j++ ){
			int temp = arr[j];
			arr[j] = arr[j + 1];
			arr[j + 1] = temp;
		}
		//赋值到新数组
		int[] arr1 =  new int[arr.length-1];
		for (int i = 0;i < arr1.length ;i++ ){
			arr1[i] = arr[i];
		}
		//旧数组制为空
		arr = null;
		for (int q  : arr1){
			System.out.print(q + "  ");
		}
	}

	/*
		选择排序
	*/
	public static void Prictice9(){
		int[]  arr = {12,52,32,41,13,84,61,34,64,17};
	
		for (int k = 0;k <  arr.length ;k++ ){
			for (int l = k;l < arr.length ;l++ ){
				if (arr[k] < arr[l]){
					int temp = arr[l];
					arr[l] = arr[k];
					arr[k] = temp;
				}
			}
		}
		for (int i : arr){
			System.out.print(i + "  ");
		}
	}

	public static void Prictice8(){
		int[]  A= {27,42,56,56,42,27};
		
		int j = 0;
		for (int i = 0; i < A.length ;i++ ){
			if (A[i] != A[A.length-1-i]){
				j = 1;
				break;
			}
		}

		if (j == 0){
			System.out.println("数组对称！");
		}else{
			System.out.println("数组不对称！");
		}
	}

	
	public static void Prictice7(){
		int[]  A= {27,42,52,23,29,53,1,53,5,3,56,29,21,63,33,2,53,53,52};
		/*
			偶数放到一个数组里，
			奇数放到一个数组里。
				先计算有多少个偶数;
				，奇数，然后在确定数组的长度。
		*/
		int i = 0;
		int j = 0;
		//求长度
		for (int k = 0; k < A.length ;k++ ){
			if (A[k] % 2 == 1){
				i++;
			}else{
				j++;
			}
		}
		//初始化数组的
		int[] B = new int[j];//存偶数
		int[] C = new int[i];//存奇数
		//存放偶数或者奇数到其他数组里
		for (int p = 0,e = 0,f = 0;p < A.length ;p++ ){
			if (A[p] % 2 == 0){
				B[e] = A[p];
				e++;
			}else{
				C[f] = A[p];
				f++;
			}
		}
		for (int q : B){
			System.out.print(q + "   ");
		}
		System.out.println();
		for (int w :C ){
			System.out.print( w + "  ");
		}
	}

	public static void Prictice6(){
		int[]  arr = {27,42,51,25,2,53,1,54,5,58,2,6,35,2,53,5,12}; 

		for (int i = 0;i < arr.length ;i++ ){
			arr[i] = arr[i]*2;
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

	public static void Prictice5(){
		int[] arr = {27,42,21,5,52,53,5,54,65,35,53,51,52};  
	
		for (int i = 0;i < arr.length ;i++ ){
			if (arr[i] % 2 == 1){ 
				System.out.println(arr[i] + "的下标为：" + i);
			}
		}
	}

	public static void Prictice4(){
		int[]  arr = {2,42,52,235,2,67,1,53,5,3,53,2,63,33,2,53,53,532};  

		int sum = 0;
		for (int i : arr){
			sum += i;
		}
		System.out.println("arr数组的和为：" +  sum);
	}
	
	public static void Prictice3(){
		int[]  arr = {2,42,52,235,2,67,1,53,5,3,53,2,63,33,2,53,53};

		// 12  21 41 25
		if (arr.length % 2 == 0){
			System.out.println("中间数为： " +  arr[arr.length / 2] +  "   和 " + arr[arr.length / 2 -1] );
		}else{
			System.out.println("中间数为： " +  arr[arr.length / 2]);
		}
	}



	public static void Prictice2(){
		Scanner sc = new Scanner(System.in);
		int[] arr  = new int[]{211,511,422,633,855,12,20,432,82,662,123,63,212};
		System.out.print("请输入要查找的数：");
		int num  = sc.nextInt();

		boolean flag  = true ;
		for (int i = 0;i < arr.length ;i++ ){
			if (arr[i] == num){
				flag  = true;
				System.out.println(num + "的下标：" + i);
				break;
			}else{
				flag  = false;
			}
		}
		if (flag  == false ){
			System.out.println(-1);
		}
	}
	
	public  static void Prictice1(){
		Scanner sc = new Scanner(System.in);
		int[] A = new int[5];
		int[] B = new int[5];
		for (int i = 0; i < 10; i++ ){
			if (i < 5){
				System.out.print("请输入第" + i + "个数：");
				A[i] = sc.nextInt();
			}else{
				System.out.print("请输入第" + i + "个数：");
				B[i % 5] = sc.nextInt();
			}
		}

		boolean flag = true;

		for (int j = 0; j < 5 ;j++ ){
			if (A[j] != B[j]){
				flag = false;
				break;
			}
		}
		if (flag == true){
			System.out.println("两个数组相等");
		}else{
			System.out.println("两个数组不相等！");
		}
	}


	public static void Prictice(int[] arr){
		int min = arr[0];
		int index = 0;
		for (int i = 0;i < arr.length ;i++ ){
			if (arr[i] < min){
				min = arr[i];
				index = i;
			}
		}
		System.out.println("最小值为:" +  min + "，和角标为：" + index);
	
	}
}