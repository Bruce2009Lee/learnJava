package StringExercise;

import java.util.Scanner;

/*
 * 
 * ��Ŀ����:
 * ��M��ͬ����ƻ������N��ͬ��������������е����ӿ��Ų��ţ��ʹ��ж����ֲ�ͬ�ķַ���
 * ����K��ʾ��5��1��1��1��5��1 ��ͬһ�ַַ���
 * 
 * */

public class mAppleInNPlate {
	
	//m:ƻ������n:������
	public static int method(int m ,int n){
		if( m<=1 || n<=1){
			return 1;
		}
		// m < n,����п����ӣ��൱�ڶ��n-m�����ӣ�method(m,m)
		if( m < n){
			return method(m,m);
		}
		else{
			// m > n,����п����ӣ��൱�ڶ��n-m�����ӣ�method(m,m)
			return method(m,n - 1) + method(m - n,n);
		}	
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()){
			int apple =  in.nextInt();
			int plant =  in.nextInt();
			System.out.println(method(apple,plant));
		}
	}

}
