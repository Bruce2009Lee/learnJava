package StringExercise;

import java.util.Scanner;

public class CodeTransfer {
	public static String Transfer(char str){
		String result = "";
		switch (str){
			case '0':
				result += "0";
				break;
			case '1':
				result += "1";
				break;
			case 'a':
			case 'b':
			case 'c':
				result += "2";
				break;
			case 'd':
			case 'e':
			case 'f':
				result += "3";
				break;
			case 'g':
			case 'h':
			case 'i':
				result += "4";
				break;
			case 'j':
			case 'k':
			case 'l':
				result += "5";
				break;
			case 'm':
			case 'n':
			case 'o':
				result += "6";
				break;
			case 'p':
			case 'q':
			case 'r':
			case 's':
				result += "7";
				break;
			case 't':
			case 'u':
			case 'v':
				result += "8";
				break;
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				result += "9";
				break;
			default:
				
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String result = "";
		for(int i = 0 ; i < str.length() ; i++){
			if(str.charAt(i) >= 'A' &&  str.charAt(i) <= 'Z'){
				if(str.charAt(i) == 'Z'){
					result += 'a';
				}
				else{
					result += (char)(str.charAt(i) + 33);
				}
			}
			else if(str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z'){
				result += Transfer(str.charAt(i));
			}
			else{
				result += str.charAt(i);
			}
		}
		System.out.print(result);
	}

}
