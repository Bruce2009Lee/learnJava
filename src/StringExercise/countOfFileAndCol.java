package StringExercise;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import java.util.HashMap;  

class errFileInfo{
	public String fName;
	public String colum;
	public int count = 1;
	
	public void setCount(){
		count++;
	}
	public errFileInfo(String name, String col){
		this.fName = name;
		this.colum = col;
	}
	public boolean isRepeated(errFileInfo in){
		return in.fName.equals(this.fName) && in.colum.equals(this.colum);
	}
}

public class countOfFileAndCol {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		while(scan.hasNextLine()){
			String[]  in = scan.nextLine().split(" ");
			String[] fileName = in[0].split("\\\\");
			String tmp = null;
			String head = null;
			if(fileName[fileName.length - 1].length() > 16){
				tmp = fileName[fileName.length - 1].substring(fileName.length - 16) + " " + in[1];
			}
			else{
				tmp = fileName[fileName.length - 1] + " " + in[1];
			}
			if( !hm.containsKey(tmp) ){
				hm.put(tmp, 1);
			}
			else{
				hm.replace(tmp,hm.get(tmp),hm.get(tmp) + 1);
			}
			int count = 0;
			for(String string:hm.keySet()){
				count++;
				if(count>(hm.keySet().size() - 8))
					System.out.println(string+" "+hm.get(string));
			}	
		}
			
	}

}
