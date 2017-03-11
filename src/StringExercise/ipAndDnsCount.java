package StringExercise;

import java.util.Scanner;

public class ipAndDnsCount {

	private static boolean numIsLegal(int in){
		if( in >= 0 && in <= 255){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean ipIsLegal(String in){
		String[] arr = in.split("\\.");
		if(arr.length < 4){
			return false;
		}
		else{
			for(int i = 0 ; i < 4 ; i++){
				if(  !numIsLegal(Integer.parseInt(arr[i]))){
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean ipIsAClass(String in){
		if( !ipIsLegal(in) ){
			return false;
		}
		String[] arr = in.split("\\.");
		int[] ips = new int[4];
		for(int i = 0 ; i< 4 ; i++){
			ips[i] = Integer.parseInt(arr[i]);
		}
		if( (ips[0] >= 1 && ips[0] <= 126) && numIsLegal(ips[1]) && 
				numIsLegal(ips[2]) && numIsLegal(ips[3]) ){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean ipIsBClass(String in){
		if( !ipIsLegal(in) ){
			return false;
		}
		String[] arr = in.split("\\.");
		int[] ips = new int[4];
		for(int i = 0 ; i< 4 ; i++){
			ips[i] = Integer.parseInt(arr[i]);
		}
		if( (ips[0] >= 128 && ips[0] <= 191) && numIsLegal(ips[1]) && 
				numIsLegal(ips[2]) && numIsLegal(ips[3]) ){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean ipIsCClass(String in){
		if( !ipIsLegal(in) ){
			return false;
		}
		String[] arr = in.split("\\.");
		int[] ips = new int[4];
		for(int i = 0 ; i< 4 ; i++){
			ips[i] = Integer.parseInt(arr[i]);
		}
		if( (ips[0] >= 192 && ips[0] <= 223) && numIsLegal(ips[1]) && 
				numIsLegal(ips[2]) && numIsLegal(ips[3]) ){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean ipIsDClass(String in){
		if( !ipIsLegal(in) ){
			return false;
		}
		String[] arr = in.split("\\.");
		int[] ips = new int[4];
		for(int i = 0 ; i< 4 ; i++){
			ips[i] = Integer.parseInt(arr[i]);
		}
		if( (ips[0] >= 224 && ips[0] <= 239) && numIsLegal(ips[1]) && 
				numIsLegal(ips[2]) && numIsLegal(ips[3]) ){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean ipIsEClass(String in){
		if( !ipIsLegal(in) ){
			return false;
		}
		String[] arr = in.split("\\.");
		int[] ips = new int[4];
		for(int i = 0 ; i< 4 ; i++){
			ips[i] = Integer.parseInt(arr[i]);
		}
		if( (ips[0] >= 240 && ips[0] <= 255) && numIsLegal(ips[1]) && 
				numIsLegal(ips[2]) && numIsLegal(ips[3]) ){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean isPrivateIp(String in){
		if( !ipIsLegal(in) ){
			return false;
		}
		String[] arr = in.split("\\.");
		int[] ips = new int[4];
		if( ((ips[0] == 10) && numIsLegal(ips[1]) && numIsLegal(ips[2]) && numIsLegal(ips[3]))|| 
				(ips[0] == 172) && (ips[1] >= 16 && ips[1] <= 31) && numIsLegal(ips[2]) && numIsLegal(ips[3])||
				(ips[0] == 192) && (ips[1] == 168) && numIsLegal(ips[2]) && numIsLegal(ips[3])){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean isMaskLegal(String in){
		if( !ipIsLegal(in) ){
			return false;
		}
		String[] arr = in.split("\\.");
		String result = Integer.toBinaryString(Integer.parseInt(arr[0])) + 
				Integer.toBinaryString(Integer.parseInt(arr[1])) +
				Integer.toBinaryString(Integer.parseInt(arr[2])) +
				Integer.toBinaryString(Integer.parseInt(arr[3]));
		return result.split("00*").length == 1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ipAs = 0, ipBs = 0 , ipCs = 0, ipDs = 0, ipEs = 0, err = 0, ipPs = 0;
		
		while(scan.hasNextLine()){
			String in = scan.nextLine();
			String ip =  in.split("~")[0];
			String mask =  in.split("~")[1];
			if(ipIsAClass(ip)){
				ipAs++;
				if(isPrivateIp(ip)){
					ipPs++;
				}
			}
			else if(ipIsBClass(ip) ){
				ipBs++;
			}
			else if(ipIsCClass(ip)){
				ipCs++;
			}
			else if(ipIsDClass(ip) ){
				ipDs++;
			}
			else if(ipIsEClass(ip) ){
				ipEs++;
			}
			else{
				err++;
			}
			if(!isMaskLegal(mask)){
				err++;
			}
			
		}
		System.out.println(ipAs + " " + ipBs + " "+ ipCs + " "+ ipDs + 
				" "+ ipEs + " "+ err + " "+ ipPs + " ");
		scan.close();
	}

}
