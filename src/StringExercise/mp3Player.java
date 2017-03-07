package StringExercise;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
//changed in 2017.03.06
//to use list in 2017.03.07
public class mp3Player {

	public static void printLessThan4Songs(int[] arr,String str){

		char[] cmd = str.toCharArray();
		int head = 0, tail = arr.length -1 ;
		int current = 0 ;
		for(int i = 0; i < cmd.length ; i++){
			if(cmd[i] == 'D'){
				if( current == tail){
					current = 0;
				}
				else{
					current ++;
				}
			}
			else{//cmd[i] == 'U'
				if( current == head){
					current = tail;
				}
				else{
					current --;
				}
			}
		}
		for(int i = 0 ; i < arr.length ; i++){
			if( i != arr.length -1 ){
				System.out.print(arr[i] + " ");
			}
			else{
				System.out.print(arr[i]);
			}
		}
		System.out.println("");
		System.out.println(arr[current]);
	}
	public static void printMoreThan4Songs(int[] arr,String str){

		char[] cmd = str.toCharArray();
		ArrayList list = new ArrayList<Integer>();
		int current = 0;
		for(int i = 0 ; i < 4 ; i++){
			list.add(i, i + 1);
		}
		for(int i = 0 ; i < cmd.length ; i++){
			if(cmd[i] == 'D'){
				if(current == arr.length - 1){
					current = 0;
					for(int j= 0 ; j < 4; j++){
						list.set(j, j+1);
					}
				}
				else{
					current ++;
					if( !list.contains(arr[current]) ){
						for(int j=1; j < 4 ; j++){
							list.set(j-1, list.get(j));
						}
						list.set(3,arr[current]);
					}
				}
			}
			else{//cmd[i] == 'U'
				if(current == 0){
					current = arr.length - 1;
					for(int k = 0 ; k < 4; k++){
						list.set(k, arr[arr.length - 4 + k ] );
					}
				}
				else{
					current --;
					if( !list.contains(arr[current]) ){
						for(int j = 3; j > 0 ; j++){
							list.set(j, list.get( j-1 ));
						}
						list.set(0,arr[current]);
					}
				}
			}
		}
		for(int i = 0 ; i < list.size() ; i++){
			if( i != list.size() -1 ){
				System.out.print(list.get(i) + " ");
			}
			else{
				System.out.print(list.get(i) );
			}
		}
		System.out.println("");
		System.out.println(arr[current]);
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()){
			int sum = Integer.parseInt(scan.nextLine());
			int[] songs = new int[sum];
			for(int i = 0 ;i < sum; i++){
				songs[i] = i + 1;
			}
			String  cmds = scan.nextLine();
			if(sum < 5){
				printLessThan4Songs(songs,cmds);
			}
			else{
				printMoreThan4Songs(songs,cmds);
			}	
		}
	}

}
