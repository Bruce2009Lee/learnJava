package StringExercise;

import java.util.Scanner;

public class revStringWithStringBuffer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuffer str = new StringBuffer(scan.nextLine());
		
		System.out.print(str.reverse());
	}

}
