package StringExercise;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;


/*
 * 
 * 
 * [编程题]输入n个整数，输出其中最小的k个
 * 
 * 
 * */
public class findKthNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()){
			int length = in.nextInt();
			int sum = in.nextInt();
			in.nextLine();
			int[] result = new int[length];
			for(int i = 0; i<length ;i++){
				
				result[i] = in.nextInt();
			}
			Arrays.sort(result);
			for(int index = 0 ; index < sum ;index++){
				if(index == sum - 1){
					System.out.print(result[index]);
				}
				else{
					System.out.print(result[index] + " ");
				}
				
			}
			System.out.println("");
		}

	}

}
