package StringExercise;

import java.util.Scanner;

public class revSentHavingSymbol {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] str = scan.nextLine().toCharArray();
		StringBuffer target = new StringBuffer();
		int j = 0;
		for(int i = 0 ; i < str.length;i++){
			if( (str[i]>='A'&&str[i] <= 'Z') || (str[i]>='a'&&str[i] <= 'z') || str[i]==' '){
				target.append(str[i]);
			}
			else if(i != str.length - 1){
					target.append(" ");
			}
				
		}

		String[] buf = target.toString().split(" ");
		String result ="";
		for(int i= 0;i < buf.length ;i++){
			if(i != buf.length - 1){
				result += myStringMethod.swapOfString(buf[i]) + " ";
			}
			else{
				result += myStringMethod.swapOfString(buf[i]);
			}
		}
		System.out.println(myStringMethod.swapOfString(result));
	}

}
