public class ArrayDemo{
	public static void main(String[] args){
		/*
			����Ķ����ʽ��
				[��������] [���������] = new  [��������]([�ռ�Ĵ�С]);
				
	*/

		/*int[] arr  = new int[5];
		
		//������һ��1024���ռ��int���͵�����

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
		//��int���͵����飬���㴴���������ϵͳ��ʼ��Ϊ0��

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


		//���ֶ�̬��ʼ����ʽ
		//��̬��ʼ���ĵ�һ�ַ�ʽ
		/*int[] arr1 = new int[6];
		arr1[1] = 45;
		arr1[2] = 12;

		//��̬��ʼ���Ķ��ַ�ʽ
		


		//��̬��ʼ����ʽ
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
		
		//forѭ��ʵ������ı���
		System.out.println(arr.length);

		for (int i = 0;i <= arr.length-1 ;i++ ){
			System.out.println("arr[" + i + "]=" + arr[i]);
		}

		//��ӡ�Ǳ�Ϊż����ֵ
		for (int i  = 0; i <  arr.length; i++ ){
			if (i % 2 == 0){
				System.out.println("arr[" + i + "]=" + arr[i]);
			}
		}
		System.out.println("------------------");
		//��ӡ��������ֵΪż����
		for (int j  = 0 ; j < arr.length ; j++ ){
			if (arr[j] % 2 ==0 ){
				System.out.println("arr[" + j + "]=" + arr[j]);
			}
		}*/


		/*int[] arr = new int[6];
		arr[1] = 45;


		int[] arr1 ;
		arr1 = arr;//��arr�����е�ַ��arr1

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
		//ջ��������ò�ָ����ڴ�������ʵ�����ʱ��ǿ�Ʋ����ᱨ��ָ���쳣��
		//�������ջ��ƣ�java���Զ�C++���Ե��ڴ�����˺ܺõ��Ż����ڶ��������������и�GC��������
		//��ʱ��������Щ�����������˳���Ա�ֶ�ȥ�������ڴ������
		*/


		//�����������ֵ
		
		/*
		int[] arr1 = new int[]{50,31,52,102,63,82,42,12,38};
		int[] arr2 = new int[]{50,31,52,102,63,82,42,12,38};
		
		String str = compareArray(arr1,arr2);
		System.out.println(str);*/




		/*�Ƚ���������
			�ȱȽ���������ĳ����Ƿ�һ��
				���һ�������Ƚ�
					�����������Ԫ��һ��һ���ó����Ƚ�
						���������Ԫ�ز���ͬ������������ӡ�������鲻һ��
						��������������ͬ
				�����һ������ӡ�������鳤�Ȳ�һ��
		*/
		


		//int num = getMaxValue(arr);
		
		//System.out.println("max value is :" +  num);




		System.out.println("------------------");
		/*
		����ķ�ת
		15 42 85 26 12 6 34 25 82 10
		0  1  2  3  4  5 6  7  8  9
		1  arr.length-1-1

		
		*/
		int[] arr = new int[]{15,42,85,26,12,6,34,25,82,10};
		int[] arr1 = trans(arr) ; //���÷�ת����������arr1�������洢
		for (int i : arr1){  //��һ����ǿforѭ������ÿ�ζ���������ȡһ����ֵ
			System.out.print(i + " "); //��ӡi��ֵ
		}

	}

	/*
	һ�����������鷭ת

	*/
	public static int[]/*��ʶҪ���ص���һ���������͵�*/ trans(int[] arr){
		for (int i = 0; i < arr.length/2 ;i++ ){
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-i-1] = temp;
		}
		return arr;//�����鷵��
	}
	
	

	/*
	һ���Ƚ���������ķ���
	*/
	public static String compareArray(int[] arr1 ,int[] arr2){
		int length1 = arr1.length;
		int length2 = arr2.length;
		boolean flag = true;
		if (length1 != length2){
			return "��ӡ�������鳤�Ȳ�һ��";
		}else{
			for (int i = 0;i < length1 ; i++ ){
				if (arr1[i] != arr2[i]){
					flag = false;
					break;
				}
			}
			if (flag == true){
				return "����������ȣ�";
			}else{
				return "�������鲻��ͬ";
			}
		}
	}

	/*
		һ������������������ֵ
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