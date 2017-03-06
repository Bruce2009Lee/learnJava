package StringExercise;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;


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
		String[]  strArr = scan.nextLine().split("\\");
		Queue<errFileInfo> hs = new LinkedList<errFileInfo>();
		Iterator iter = hs.iterator();
		
		for(int i = 0 ; i < strArr.length ; i ++){
			errFileInfo tmp = new errFileInfo(strArr[i].split(" ")[0],strArr[i].split(" ")[1]);
			if (hs.contains(tmp)){
		
			}
		}
	}

}
