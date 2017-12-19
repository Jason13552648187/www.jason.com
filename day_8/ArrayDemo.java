public class ArrayDemo{
	public static void main(String[] args){
		/*
			数组的定义格式：
				[数据类型] [数组的名称] = new  [数据类型]([空间的大小]);
				
	*/

		/*int[] arr  = new int[5];
		
		//创建了一个1024个空间的int类型的数组

		arr[2] = 5;
		//arr[3] = 3.1;
		arr[5] = 36;
		//[0]  [1]  [2] [3] [4]
		
	
		System.out.println(arr[2]);
		//System.out.println(arr[5]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		System.out.println("==================");
		boolean[] arr1 =  new boolean[5];

		arr1[2] = true;
		arr1[3] = false;
		System.out.println("arr1[3]=" + arr1[3]);
		System.out.println("=========================");

		char[] arr2 = new char[6];
		 
		arr2[2] = 'a';
		System.out.println(arr2[2]);

*/

/*
		int[] arr = new int[6];

		
		[0] [1] [2] [3] [4] [5] 
		 0   0   5   0   0   0
		
		arr[2] = 5;

		System.out.println(arr[2]);
		//对int类型的数组，当你创建该数组后，系统初始化为0；

		System.out.println("------------------");
		char[] arr1 = new char[6];
		System.out.println("arr1[1]" + arr1[1]);//null  \u0000
		System.out.println("===============");
		float[] arr2 = new float[6];
		System.out.println("arr2[2]" + arr2[2]);
		System.out.println("===========");
		boolean[] arr3 = new boolean[6];
		System.out.println("arr3[2]" + arr3[2]);
 */


		//两种动态初始化方式
		//动态初始化的第一种方式
		/*int[] arr1 = new int[6];
		arr1[1] = 45;
		arr1[2] = 12;

		//静态初始化的二种方式
		


		//静态初始化方式
		System.out.println("=============");

		int[] arr2 = new int[]{1,2,5,6,3,8,5,6};
		System.out.println("arr2[0]" + arr2[0]);

		int[] arr3 = {
			5,6,8,12,54,6,5,5,5
		};
		System.out.println(arr3[5]);  //6
		System.out.println(arr3[2]);  //8*/

		/*int[] arr = new int[5];
		arr[0] = 45;
		arr[1] = 12;
		arr[2] = 13;
		arr[3] = 46;
		arr[4] = 41;
		
		//System.out.println("arr[0]" + arr[0]);
		
		//for循环实现数组的遍历
		System.out.println(arr.length);

		for (int i = 0;i <= arr.length-1 ;i++ ){
			System.out.println("arr[" + i + "]=" + arr[i]);
		}

		//打印角标为偶数的值
		for (int i  = 0; i <  arr.length; i++ ){
			if (i % 2 == 0){
				System.out.println("arr[" + i + "]=" + arr[i]);
			}
		}
		System.out.println("------------------");
		//打印数组里数值为偶数的
		for (int j  = 0 ; j < arr.length ; j++ ){
			if (arr[j] % 2 ==0 ){
				System.out.println("arr[" + j + "]=" + arr[j]);
			}
		}*/


		/*int[] arr = new int[6];
		arr[1] = 45;


		int[] arr1 ;
		arr1 = arr;//将arr所持有地址给arr1

		System.out.println(arr1[1]);//45

		System.out.println(arr[1]);

		System.out.println("---------------");
		int[] arr2 = new int[5];
		arr2[3] = 14;
		System.out.println(arr2[3]);*/



		/*int[] arr = new int[6];
		arr[1] = 45;
		int[] arr1 ;
		arr1 = arr;
		System.out.println(arr + "  " + arr1 );//[I@2013706e
		//System.out.println("arr[1] = " + arr[1]);
		//java.lang.NullPointerException
		//栈里面的引用不指向堆内存中任意实体对象时，强制操作会报空指针异常。
		//垃圾回收机制：java语言对C++语言的内存进行了很好的优化，在堆里若有垃圾会有个GC处理器不
		//定时来回收这些垃圾。避免了程序员手动去清除造成内存崩溃。
		*/


		//数组里找最大值
		
		/*
		int[] arr1 = new int[]{50,31,52,102,63,82,42,12,38};
		int[] arr2 = new int[]{50,31,52,102,63,82,42,12,38};
		
		String str = compareArray(arr1,arr2);
		System.out.println(str);*/




		/*比较两个数组
			先比较两个数组的长度是否一样
				如果一样继续比较
					将两个数组的元素一个一个拿出来比较
						如果有两个元素不相同，则跳出并打印两个数组不一样
						否则两个数组相同
				如果不一样，打印两个数组长度不一样
		*/
		


		//int num = getMaxValue(arr);
		
		//System.out.println("max value is :" +  num);




		System.out.println("------------------");
		/*
		数组的翻转
		15 42 85 26 12 6 34 25 82 10
		0  1  2  3  4  5 6  7  8  9
		1  arr.length-1-1

		
		*/
		int[] arr = new int[]{15,42,85,26,12,6,34,25,82,10};
		int[] arr1 = trans(arr) ; //调用翻转方法，并用arr1数组来存储
		for (int i : arr1){  //这一个增强for循环，会每次都从数组里取一个数值
			System.out.print(i + " "); //打印i的值
		}

	}

	/*
	一个方法，数组翻转

	*/
	public static int[]/*标识要返回的是一个数组类型的*/ trans(int[] arr){
		for (int i = 0; i < arr.length/2 ;i++ ){
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-i-1] = temp;
		}
		return arr;//将数组返回
	}
	
	

	/*
	一个比较两个数组的方法
	*/
	public static String compareArray(int[] arr1 ,int[] arr2){
		int length1 = arr1.length;
		int length2 = arr2.length;
		boolean flag = true;
		if (length1 != length2){
			return "打印两个数组长度不一样";
		}else{
			for (int i = 0;i < length1 ; i++ ){
				if (arr1[i] != arr2[i]){
					flag = false;
					break;
				}
			}
			if (flag == true){
				return "两个数组相等！";
			}else{
				return "两个数组不相同";
			}
		}
	}

	/*
		一个方法，求数组的最大值
	*/
	public static int getMaxValue(int[] arr){
		int num = arr[0];
		for (int i = 1;i < arr.length ;i++ ){
			if (num < arr[i]){
				num = arr[i];
			}
		}
		return num;
	}






}