package StringExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class insertIntoList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList alist = new ArrayList();
		while(scan.hasNextInt()){
			int num = scan.nextInt();
			int firstNode = scan.nextInt();
			alist.add(firstNode);
			for(int i = 0 ; i < num - 1 ; i++){
				int node1 = scan.nextInt();
				int node2 = scan.nextInt();
				int index = alist.indexOf(node2);
				alist.add(index + 1 ,node1);
			}
			Object delNode = scan.nextInt();
			alist.remove(delNode);
			for(int i = 0 ;i < alist.size(); i++){
				System.out.print(alist.get(i) + " ");
			}
		}

	}

}
