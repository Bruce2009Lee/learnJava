package StringExercise;

import java.util.Scanner;

public class lengthOfCommonInStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNextLine()){
			String in1 = scan.nextLine();
			String in2 = scan.nextLine();
			
			String less = in1.length()>in2.length()? in2 : in1;
			String more = in1.length()>in2.length()? in1 : in2;
			String result = null;
			int max = 0;
			for(int i = 0 ; i<less.length() ; i++){
				for(int j = i ; j < less.length() ; j++){
					if(more.contains(less.substring(i, j))&& j > i ){
						if(j-i > max){
							result = less.substring(i,j);
							max = j - i;
						}
					}
				}
			}
			System.out.println(result);			
		}

	}

}
