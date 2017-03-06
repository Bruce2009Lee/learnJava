package StringExercise;
import java.util.Scanner;
import java.lang.Integer;
public class deleLeastCharOfString {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		while(scan.hasNextLine()){
			String str = scan.nextLine();
			int[] num = new int[26];
			for(int i = 0 ; i <  str.length() ; i++){
				int n = (int)(str.charAt(i) - 'a');
				num[n]++; 
			}
			
			int min = Integer.MAX_VALUE;
			for(int i = 0 ; i < 26; i++){
				if(num[i] != 0 && num[i] < min ){
					min = num[i];
				}
			}
			
			for(int i = 0 ; i <  str.length() ; i++){
				int n = str.charAt(i) - 'a';
				if(num[n] != min){
					System.out.print(str.charAt(i));
				} 
			}
			
			
		}
	}

}
