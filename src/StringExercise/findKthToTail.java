package StringExercise;

import java.util.Scanner;

class Node{
	public int value;
	public Node next;
}

public class findKthToTail {
	
	public static Node getNode(Node list,int k){
		
		int length = 0; 
		Node result = list;
		while(result != null){
			length++;
			result = result.next;
		}
		if(k <= 0|| k > length){
			return null;
		}
		
		result = list;
		for(int i = 0 ;i + k < length; i++ ){
			result = result.next;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()){
			int length = scan.nextInt();
			
			Node head = new Node();
			head.next = null;
			Node tail = new Node();
			
			for(int i = 0 ;i < length; i++){
				Node in = new Node();
				in.value = scan.nextInt();
				if(i == 0){
					in.next = head.next;
					head.next = in;
					tail = in;
				}
				else{
					tail.next = in;
					tail = in;
				}
			}
			int key = scan.nextInt();
			if(getNode(head,key)!=null){
				System.out.println(getNode(head,key).value);
			}
			else{
				System.out.println("0");
			}
		}
	}

}
