package StringExercise;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
 * 
 * ����һ��ż��������2����������2��������ɣ����ż����2�������кܶ��������
 * ����ĿҪ��������ָ��ż��������������ֵ��С�������� 
 * 
 * 
 * */

public class minDistanceOfPrime {
	
	
	public static ArrayList<int[]> getPrime(int in){
		
		ArrayList<Integer> prime = new ArrayList<Integer>();

		ArrayList<int[]> result = new ArrayList<int[]>();
		for(int i = 0 ; i < in ; i++){
			if(primeNumInPair.isPrimeNum(i)){
				prime.add(i);
			}
		}
		for(int i = 0 ; i < prime.size() ; i++){
			for(int j = i + 1 ; j < prime.size()  ; j++){
				if(prime.get(i) + prime.get(j) == in){
					int[] pair = new int[2];
					pair[0] = prime.get(i);
					pair[1] = prime.get(j);
					result.add(pair);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<int[]> result = new ArrayList<int[]>();
		while(in.hasNextLine()){
			int num = Integer.parseInt(in.nextLine());
			result = getPrime(num);
			int max = Integer.MAX_VALUE;
			int ret1 = 0,ret2 = 0;
			for(int i = 0; i < result.size() ;i++){
				if(Math.abs(result.get(i)[0] - result.get(i)[1]) < max){
					max = Math.abs(result.get(i)[0] - result.get(i)[1]);
					ret1 = result.get(i)[0];
					ret2 = result.get(i)[1];
				}
			}
			System.out.println(ret1);
			System.out.println(ret2);
		}
	}

}
