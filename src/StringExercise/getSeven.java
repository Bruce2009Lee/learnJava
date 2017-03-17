package StringExercise;

import java.util.Scanner;

public class getSeven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()){
			
			int num = scan.nextInt();
			int count = 0;
			for(int i = 0 ; i < num ; i++){
				if( (i+1)%7 == 0){
					count++;
				}
				else{
					String str = "" + (i+1);
					for(int j = 0 ; j<str.length() ; j++){
						if(str.charAt(j) == '7'){
							count++;
							break;
						}
					}
				}
			}
			System.out.println(count);
		}
	}

}
