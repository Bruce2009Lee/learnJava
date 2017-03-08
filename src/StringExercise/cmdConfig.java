package StringExercise;

import java.util.Scanner;

public class cmdConfig {

	private static String[] locCmds = {"reset","reset board","board add","board delet","reboot backplane","backplane abort"};
	private static String[] shows = {"reset what","board fault","where to add","no board at all","impossible","install first"};
	
	public static void oneCmd(String in) {
		if(!locCmds[0].contains(in)){
			System.out.println("unkown command");		
		}
		else{
			System.out.println("reset what");	
		}
	}
	//deal with two and more cmds 
	public static void twoMoreCmd(String[] in) {
		
		int index = 0,count = 0;
		String tmp = null;
		
		for(int i = 0; i < in.length ; i++){//Öð¸ö±È½Ïcmds
			for(int j = 0 ; j < locCmds.length ; j++){
				if( locCmds[j].split(" ").length > 1){
					tmp = locCmds[j].split(" ")[i];
					if(tmp.length() >= in[i].length() && tmp.contains(in[i])){
						count ++;
						if(count == 2){
							index = j;
						}
						break;
					}
				}				
			}
		}
		if(count == 2){
			System.out.println(shows[index]);
		}
		else{
			System.out.println("unkown command");	
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()){
			String[] cmds = scan.nextLine().split(" ");
			if(cmds.length > 1){
				twoMoreCmd(cmds);
			}
			else{
				oneCmd(cmds[0]);
			}	
		}
	}
}
