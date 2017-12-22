public class Prictice{
	public static void main(String[] agrs){
		int[] arr = {12,52,4,15,5,412,5,512,2,1};
		int[] arr1 = {12,52,4,15,5,412,5,512,2,1,41};
		//ArrayTool.turnOut(arr);
		//System.out.println();
		//ArrayTool.selectSort(arr);
		//ArrayTool.compare(arr,arr1);
		ArrayTool.searchElement(arr,10);
	}
}

class ArrayTool{

	public static void searchElement(int[] arr, int num){
		int index = -1;
		int count = 0;
		for (int i = 0;i < arr.length ;i++ ){
			if (arr[i] == num){
				index = i;
				count ++;
				System.out.println("找到了该数的角标为：" +  index);
			}
		}
		if (count == 0){
			System.out.println("没有找该数，-1");
		}
	}


	public static void turnOut(int[] arr){
		for (int i = 0;i <  arr.length/2 ;i++ ){
			int temp = arr[i];
			arr[i] =arr[arr.length-1-i] ;
			arr[arr.length-1-i] = temp;
		}
		for (int j : arr){
			System.out.print(j + "  ");
		}
	}

	public static void selectSort(int[] arr){
		for (int i = 0; i < arr.length ;i++ ){
			for (int j = i;j < arr.length ; j++){
				if (arr[j] > arr[i]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int k : arr){
			System.out.print(k + "  ");
		}
	}


	public static void compare(int[] arr ,int[] arr1){
		int length = arr.length;
		int length1 = arr1.length;
		boolean flag = true;
		if (length ==  length1){
			for (int i = 0;i < length ; i++){
				if (arr[i] != arr1[i]){
					flag = false;
					break;
				}
			}
			if (flag){
				System.out.println("数组的元素一样。");
			}else{
				System.out.println("数组的元素不一样。");
			}
		}else{
			System.out.println("数组长度不一样");
		}
	
	}
}