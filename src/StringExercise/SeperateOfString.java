package StringExercise;

import java.util.Scanner;

public class SeperateOfString {
		
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while(scan.hasNext()){
			String str = scan.nextLine();
			while(count < str.length()-8){
				System.out.println(str.substring(count,count+8));
				count+=8;
			}
			if(count < str.length()){
				System.out.print((str + "00000000").substring(count,count+8));
			}
		}
		
	}
}
