package StringExercise;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
//changed in 2017.03.06
public class mp3Player {

	public static void printCurrent(int[] arr,int begin ,int num){

		for(int i = 0 ; i < num; i++){
			System.out.print(arr[begin + i]+ " ");
		}
		System.out.println("");
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
			int end = head + sum -1;
			for(int i = 0 ; i < cmd.length; i++){
				if(sum <= 4){
					printCurrent(songs, head,sum);
					if(cmd[i] == 'D'){
						if(i == end){
							
							current = 0 ;
							if(i == cmd.length - 1){
								printCurrent(songs, head,1);
							}
						}
						else{
							
							current++;
							if(i == cmd.length - 1){
								printCurrent(songs, current,1);
							}
						}
					}
					else{	//cmd[i] == 'U'
						
						if(i == head){
							if(i == cmd.length - 1){
								printCurrent(songs, end,1);
							}
							current = sum -1 ;
						}
						else{
							current--;
							if(i == cmd.length - 1){
								printCurrent(songs, current,1);
							}
						}
					}
				}
				else{//cmd.length > 4
					if(cmd[i] == 'D'){
						if(i == end){
							current = 0 ;
							if(i == cmd.length - 1){
								printCurrent(songs, head,4);
								printCurrent(songs, head,1);
							}
							
						}
						else{							
							current++;
							for(int j = 0 ; j < sum/4; j++){
								if( current>=(4*j +1)&&(current <=4*j + 4) ){
									if(i == cmd.length - 1){
										if( sum%4 != 0 && j + 1 ==sum/4){
											printCurrent(songs, 4*j,4);
										}
										else{
											printCurrent(songs, 4*j,4);
										}
										printCurrent(songs, current,1);
									}
								}
							}

						}
					}
					else{	//cmd[i] == 'U'
						
						if(i == head){
							if(i == cmd.length - 1){
								printCurrent(songs, end,1);
								printCurrent(songs, end-3,4);
							}
							current = sum -1 ;
						}
						else{
							current--;
							for(int j = 0 ; j < sum/4; j++){
								if(( current>=(4*j +1))&&(current <=(4*j + 4)) ){
									if(i == cmd.length - 1){
										if( sum%4 != 0 && j + 1 ==sum/4){
											printCurrent(songs, 4*j,4);
										}
										else{
											printCurrent(songs, 4*j,4);
										}
											printCurrent(songs, current,1);
									}
								}
							}
						}
					}
				}
			}
			System.out.print("Done");                              
			
//			printCurrent(list.iterator(),list.size()+5);
		}
	}

}
