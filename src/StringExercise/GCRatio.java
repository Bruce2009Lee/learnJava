package StringExercise;

import java.util.Scanner;


/*
 * DNA序列
 * 找出GC比例最高的子串,如果有多个输出第一个的子串
 * 
 * 
 * */
public class GCRatio {
	
	public static int getGCNum(String in){
		int count = 0;
		for(int i = 0; i < in.length() ; i++){
			if(in.charAt(i) == 'G'||in.charAt(i) == 'C'){
				count++;
			}
		}
		return count;
	}

	public static void getHighRatio(String in,int boud){
		 
		String tmp = null,result = null;
		double min = Float.MIN_VALUE;
		for(int i = 0; i < in.length() - boud ; i++){
			for(int j = boud; j < in.length() - i + 1; j++){
				tmp = in.substring(i,i + j);
				double count = getGCNum(tmp) + 0.0;
				if( count/tmp.length() > min){
					min = count/tmp.length();
					result = tmp;
				}
				
			}
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextLine()){
			String src = in.nextLine();
			int boundary = Integer.parseInt(in.nextLine());
			getHighRatio(src,boundary);
		}
		

	}

}
