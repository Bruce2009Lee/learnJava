package StringExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class bigNumPlus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useDelimiter("\\n");
		while(in.hasNextLine()){
			String num1 = in.nextLine();
			String num2 = in.nextLine();
			int count = 0;
			int length = num1.length() > num2.length()?num1.length():num2.length();
			int[] result = new int[length + 1];
			for(int i = num1.length() - 1,j = num2.length()- 1,k = length ; k >= 0 ; i--,j--,k--){
				int left = 0,right = 0;
				if(i < 0 && j >= 0){
					left = 0;
					right = Integer.parseInt("" + num2.charAt(j));
				}
				else if(i >= 0 && j < 0){
					right = 0;
					left = Integer.parseInt("" + num1.charAt(i));
				}
				else if(i < 0 && j < 0){
					right = 0;
					left = 0;
				}
				else{
					left = Integer.parseInt("" + num1.charAt(i));
					right = Integer.parseInt("" + num2.charAt(j));
				}
					
				int tmp = left + right + count;
				if(tmp >= 10){
					tmp -= 10;
					count = 1;
				}
				else{
					count = 0;
				}
				if(k == 0 && count == 1){
					result[k] = 1;
				}
				else{
					result[k] = tmp ; 
				}		
			}
			if(result[0] == 1){
				System.out.print(result[0]);
			}
			for(int i = 1; i < result.length;i++){
				System.out.print(result[i]);
			}
			System.out.println();
		}

	}

}
