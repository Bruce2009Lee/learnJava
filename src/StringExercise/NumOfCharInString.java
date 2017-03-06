package StringExercise;

import java.util.Scanner;

public class NumOfCharInString {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count=0;
		
		String str = scan.nextLine().toUpperCase();
		char tar = scan .nextLine().toUpperCase().toCharArray()[0];
		for(int i = 0;i<str.length();i++){
			if(str.charAt(i) == tar){
				count++;
			}
		}
		System.out.println(count);
	}
	
}
