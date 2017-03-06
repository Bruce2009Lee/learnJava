package StringExercise;

import java.util.Scanner;

public class primeNumInPair {

	public static boolean isPrimeNum(int num){
		if (num <= 3) {
		    return num > 1;
		}
       for(int i = 2; i < Math.sqrt(num) ;i++){
           if(num%i == 0)
               return false;
       }
       return true;

	}
	
	public static void main(String[] args) {
		//Î´Íê³É
		Scanner scan = new Scanner(System.in);
		
		System.out.print(isPrimeNum(41));

	}

}
