package StringExercise;

public class myStringMethod {
	
	//��һ��String�е��ַ�����
	public static String swapOfString(String str){
		char[]  carray = str.toCharArray();
		String result = "";
		for(int i = carray.length-1;i >= 0;i--){
			result +=  carray[i];
		}
		return result;
	}
	
	//����������������
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
	
	//ð��������������
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
	
	//����˼��
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
	
	//���������������飬�õ��˷���˼��
	public static void fastSort(int[] a, int low, int high){
		printArray(a);
		if(low >= high){
			return ;
		}
		int index = partition(a, low, high);
		fastSort(a,low,index - 1);
		fastSort(a,index + 1,high);
		
	}
	
	//��ӡ����
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
	
	//����һ�� arr����������Ϊnum1 �� num2 ��ֵ
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
