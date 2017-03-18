package StringExercise;

import java.util.Scanner;

/*
 * 
 * 题目描述:
 * 把M个同样的苹果放在N个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？
 * （用K表示）5，1，1和1，5，1 是同一种分法。
 * 
 * */

public class mAppleInNPlate {
	
	//m:苹果数，n:篮子数
	public static int method(int m ,int n){
		if( m<=1 || n<=1){
			return 1;
		}
		// m < n,则必有空篮子，相当于多出n-m个篮子，method(m,m)
		if( m < n){
			return method(m,m);
		}
		else{
			// m > n,则必有空篮子，相当于多出n-m个篮子，method(m,m)
			return method(m,n - 1) + method(m - n,n);
		}	
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()){
			int apple =  in.nextInt();
			int plant =  in.nextInt();
			System.out.println(method(apple,plant));
		}
	}

}
