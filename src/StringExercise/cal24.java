package StringExercise;

import java.util.Scanner;

public class cal24 {
	public static int add(int num1 ,int num2){
		return num1 + num2 ;
	}

	public static int minus(int num1 ,int num2){
		return num1 > num2 ?num1 - num2:num2 - num1;
	}
	
	public static int multi(int num1 ,int num2){
		return num1 * num2;
	}
	
	public static int div(int num1 ,int num2){
		if( num2 != 0){
			return num1/num2;
		}
		else{
			return 0;
		}
	}
	public static int doCal(int count , int num1 ,int num2){
		int result = -1;
		if( count == 1){
			result = add(num1 ,num2);
		}
		else if( count == 2 ){
			result = minus(num1 ,num2);
		}
		else if( count == 3){
			result = minus(num1 ,num2);
		}
		else{
			result = div(num1 ,num2);
		}
		return result;
	}
	
	public static void cal24() {
		
		//not finished
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()){
			int[] arr = new int[4];
			for(int i = 0 ; i<4 ; i++){
				arr[i] = scan.nextInt();
			}
		}
	}
}
