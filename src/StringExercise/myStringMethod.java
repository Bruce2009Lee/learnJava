package StringExercise;

public class myStringMethod {
	
	//将一个String中的字符反序
	public static String swapOfString(String str){
		char[]  carray = str.toCharArray();
		String result = "";
		for(int i = carray.length-1;i >= 0;i--){
			result +=  carray[i];
		}
		return result;
	}
	
	//插入排序：整数数组
	public static void insertSort(int[] a){
		int tmp,j;
		for(int i = 1;i < a.length; i++){
			tmp = a[i];
			for(j = i-1; j>=0 && tmp < a[j];j--){
				a[j+1] = a[j];
			}
			a[j+1] = tmp; 
		}
	}
	
	//冒泡排序：整数数组
	public static void bubbletSort(int[] a){
		int tmp;
		for(int i = 0;i < a.length - 1; i++){
			for(int j = 0; j < a.length - i- 1;j++){
				if(a[j] > a[j+1]){
					tmp = a[j+1];
					a[j+1] = a[j];
					a[j] = tmp;
				}
			}
		}
	}
	
	//分制思想
	private static int partition(int[] arr, int low, int hi){
		
		int key = arr[low];
		while(low < hi){
			while(key <= arr[hi] && low < hi){
				hi--;
			}
			arr[low] = arr[hi];
			
			while(key >= arr[low] && low < hi){
				low++;
			}
			arr[hi] = arr[low]; 
		}
		arr[hi] =  key;
		return hi;
	}
	
	//快速排序：整数数组，用到了分制思想
	public static void fastSort(int[] a, int low, int high){
		printArray(a);
		if(low >= high){
			return ;
		}
		int index = partition(a, low, high);
		fastSort(a,low,index - 1);
		fastSort(a,index + 1,high);
		
	}
	
	//打印数组
	public static void printArray(int[] a){
		for(int i = 0 ; i < a.length ;i++ ){
			if(i != a.length - 1){
				System.out.print(a[i] + " ");
			}
			else{
				System.out.print(a[i]);
			}
		}
		System.out.println();
	}
	
	//交换一个 arr数组中索引为num1 和 num2 的值
	public static void swapData(int[] arr, int num1, int num2){
		int tmp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = tmp;		
	}
	
	public static void deleteChar(StringBuffer str,String ch){
		boolean flag = true;
		while(flag){
			if( str.indexOf(ch) >= 0 ){
				str.deleteCharAt( str.indexOf(ch) );
			}
			else{
				flag = false;
			}
		}
	}
}
