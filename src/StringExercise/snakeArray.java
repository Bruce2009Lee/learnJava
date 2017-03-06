package StringExercise;

import java.util.Scanner;

public class snakeArray {
	
	
	public static void printIncrease(int numBase ,int incBase ,int length){
		int sumInc = 0;
		int out = numBase;
		System.out.printf("%-5s",numBase);	
		for(int i = 0, rowInc = 0 ; i < length -1; i++, rowInc++ ){
			sumInc =  rowInc + incBase;
			System.out.printf("%-5s", out + sumInc);
			out += sumInc;
		}
		
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int outSum = 0;
		for(int i = 0 , colInc = 0; i < n; i++,colInc++ ){
			outSum += colInc;
			printIncrease( 1 + outSum, 2 + i ,n - i);
		}

	}

}
