package StringExercise;

import java.util.Scanner;

public class posMove {
	private static int x = 0;
	private static int y = 0;
	
	public static void printPosition(){
		System.out.print(x + "," + y);
	}
	
	private static boolean hasWords(String str){
		for(int i = 0 ; i < str.length(); i++){
			if(str.charAt(i) < '0' || str.charAt(i) > '9' ){
				return true;
			}	
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] strArr = scan.nextLine().split(";");
		
		for(int i = 0 ;i < strArr.length; i++){
			if(strArr[i].length() == 3 ){
				switch (strArr[i].charAt(0)){
					case 'A':
						if( !hasWords(strArr[i].substring(1, strArr[i].length()))){
							x -= Integer.parseInt(strArr[i].substring(1, strArr[i].length()));
						}
						break;
					case 'D':
						if( !hasWords(strArr[i].substring(1, strArr[i].length()))){
							x += Integer.parseInt(strArr[i].substring(1, strArr[i].length()));
						}
						break;
					case 'W':
						if( !hasWords(strArr[i].substring(1, strArr[i].length()))){
							y += Integer.parseInt(strArr[i].substring(1, strArr[i].length()));
						}
						break;
					case 'S':
						if( !hasWords(strArr[i].substring(1, strArr[i].length()))){
							y -= Integer.parseInt(strArr[i].substring(1, strArr[i].length()));
						}
						break;
				}
			}
		}
		printPosition();
	}

}
