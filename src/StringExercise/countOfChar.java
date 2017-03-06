package StringExercise;

import java.util.Scanner;

public class countOfChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] cs = scan.nextLine().toCharArray();
		int[] tab = new int[127];
		int count = 0;
		for(int i=0 ;i < cs.length;i++){
			if(tab[cs[i]] == 0){
				tab[cs[i]]++;
			}
		}
		for(int i = 0;i<tab.length;i++){
			if(tab[i] != 0){
				count++;
			}
		}
		System.out.print(count);
	}
}
