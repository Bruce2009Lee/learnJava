package StringExercise;

import java.util.Scanner;

public class checkNetSegment {
	
	public static boolean maskCheck(String in){
		
		String[] maskArr = in.split("\\.");
		if(maskArr.length != 4){
			return false;
		}
		String mask = "";
	
		for(int i = 0; i < maskArr.length; i++ ){
			mask += Integer.toBinaryString(Integer.parseInt(maskArr[i]));
			System.out.println(mask);
		}
		String[] result = mask.split("0{1,7}");
		if(result.length > 1){
			return false;
		}
		else{
			return true;
		}
	}

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		while(scan.hasNextLine()){			
//			String[] mask = scan.nextLine().split(".");
//			String[] IP1 = scan.nextLine().split(".");
//			String[] IP2 = scan.nextLine().split(".");
//			
//			for(int i = 0 ;i < 4; i++){
//				if((mask[i] & IP1[i]) != (mask[i] & IP2[i]) ){
//					System.out.println(2);
//				}
//			}
//			System.out.println(0);
//		}
		System.out.println(maskCheck("255.123"));

	}

}
