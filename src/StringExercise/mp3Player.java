package StringExercise;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class mp3Player {

	public static void printCurrent(int[] arr,int begin ,int num){

		for(int i = 0 ; i < num; i++){
			System.out.print(arr[begin + i]+ " ");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()){
			int sum = Integer.parseInt(scan.nextLine());
			int[] songs = new int[sum];
			for(int i = 0 ;i < sum; i++){
				songs[i] = i + 1;
			}
			
			char[]  cmd = scan.nextLine().toCharArray();
			int head = 0,current = 0;
			int end = head + sum;
			for(int i = 0 ; i < cmd.length; i++){
				if(cmd[i] == 'D'){
					if(i == end){
						printCurrent(songs, head,1);
					}
					else{
						printCurrent(songs, current,1);
						current++;
					}
				}
				else{
					
				}
			}
			System.out.print("Done");                              
			
//			printCurrent(list.iterator(),list.size()+5);
		}
	}

}
