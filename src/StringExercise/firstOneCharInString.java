package StringExercise;

import java.util.Scanner;

/*
 * 
 * 
 * [�����]�ҳ��ַ����е�һ��ֻ����һ�ε��ַ�
 * 
 * 
 * */
public class firstOneCharInString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextLine()){
			char[] inArr = in.nextLine().toCharArray();
			int[] count = new int[26];
			for(int i = 0; i < inArr.length ;i++){
				count[inArr[i] - 'a']++; 
			}
			for(int i = 0; i < inArr.length ;i++){
				if(count[inArr[i] - 'a'] == 1){
					System.out.println(inArr[i]);
					break;
				}
				else if(i == inArr.length - 1){
					System.out.println("-1");
				}
			}
		}
	}

}
