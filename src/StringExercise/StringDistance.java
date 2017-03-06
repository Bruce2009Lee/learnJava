package StringExercise;

import java.util.Scanner;

public class StringDistance {
	
	public static int addChar(String in1, String in2){
		char[] strArr1 = in1.toCharArray();
		char[] strArr2 = in2.toCharArray();
		int length = strArr1.length > strArr2.length? strArr1.length :strArr2.length ;
		
		int srt = strArr1.length < strArr2.length? strArr1.length :strArr2.length ;
		
		int[] dif = new int[length]; 
		for(int i= 0 ;i < srt; i++){
			dif[i] = strArr1[i] - strArr2[i];
		}
		for(int i= 0 ;i < srt; i++){
			if(dif[i] != 0){
				return -1;
			}
		}
		return length - srt;
	}
	
	public static int addChars(String in1, String in2){
		int[] num = new int[26];
		for(int i = 0 ;i < in1.length(); i++){
			num[in1.charAt(i) - 'a'] ++;
		}
		for(int i = 0 ;i < in2.length(); i++){
			num[in2.charAt(i) - 'a'] ++;
		}
		int result = 0;
		for(int i = 0; i < 26; i++){
				result += num[i];
		}
		return result - (in1.length()<in2.length()?in1.length():in2.length());
	}

	public static int toBeAddedChar(String in1, String in2){
		
		int result = in1.length() - in2.length() > 0?in1.length() - in2.length():in2.length() - in1.length();
		
		if(in1.length() - in2.length() > 0){
			for(int i = 0 ; i < in2.length() ; i++){
				if( !in1.contains("" + in2.toCharArray()[i])){
					return -1; 
				}
			}
		}
		else{
			for(int i = 0 ; i < in1.length() ; i++){
				if( !in1.contains("" + in1.toCharArray()[i])){
					return -1; 
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()){
			String str1 = scan.nextLine();
			String str2 = scan.nextLine();
			System.out.println(addChars(str1,str2));
		}
	}

}

