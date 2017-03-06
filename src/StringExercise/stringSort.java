package StringExercise;

import java.util.Arrays;
import java.util.Scanner;

public class stringSort {

	private static void sortString(String[] arr){
		String tmp = new String("");
		for(int i = 0; i < arr.length -1;i++){
			for(int j = i + 1; j < arr.length;j++){
				if(arr[i].compareTo(arr[j]) > 0){
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] strarr = new String[n];
		for(int i = 0; i < n ; i++){
			strarr[i] = scan.next();
 		}
		sortString(strarr);
		
		for(int i = 0; i < n ; i++){
			System.out.println(strarr[i]);
 		}
	}

}
