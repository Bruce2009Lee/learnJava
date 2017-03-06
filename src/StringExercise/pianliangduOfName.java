package StringExercise;

import java.util.Arrays;
import java.util.Scanner;

public class pianliangduOfName {
	
	public static void piaoliangdu(String inStr){
		int sum = 0;
		char[] in = inStr.toCharArray();
		int[] name = new int[26];
		for(int i = 0; i < in.length ;i++){
			name[i] = 0;
		}
		for(int i = 0; i < in.length ;i++){
			name[(int)(in[i]-'a')]++;
		}
		Arrays.sort(name);
		for(int count = name.length - 1; count >= 0 ;count--){
			sum += name[count]*(count+1);
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());	
		
		while(scan.hasNextLine() && n>1){
			piaoliangdu(scan.nextLine());
			n--;
		}
	}
}
