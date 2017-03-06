package StringExercise;

import java.util.Scanner;

public class reverseSentence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = scan.nextLine().split(" ");
		for(int i = str.length-1 ;i >= 0;i--){
			if(i!=0){
				System.out.print(str[i]+" ");
			}
			else{
				System.out.print(str[i]);
			}
		}

	}

}
