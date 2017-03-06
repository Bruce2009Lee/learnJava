package StringExercise;

import java.util.HashSet;
import java.util.Scanner;

public class countOfChar2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		HashSet<String> hs = new HashSet<String>();
		for(int i =0; i<str.length();i++){
			System.out.print(String.valueOf(str.charAt(i)));
			hs.add(String.valueOf(str.charAt(i)));
		}
		System.out.print(hs.size());
	}

}
