package StringExercise;

import java.util.Scanner;

//authour :zhonglian
//for: HuaWei Online programm
//changed in branck dev
class codeInfo{
	public String code;
	public codeInfo(){
		this.code = null;
	}
	
	public codeInfo(String code){
		this.code = code;
	}
	
	public boolean enoughLength(){
		return code.length() > 8?true:false;
	}
	
	public boolean hasUpperChar(){
		for(int i = 0 ; i < code.length() ; i++){
			if(code.charAt(i) >= 'A' && code.charAt(i) <= 'Z'){
				return true;
			}
		}
		return false;
	}
	
	public boolean hasChar(){
		for(int i = 0 ; i < code.length() ; i++){
			if((code.charAt(i) >= 'A' && code.charAt(i) <= 'Z') || (code.charAt(i) >= 'a' && code.charAt(i) <= 'z')){
				return true;
			}
		}
		return false;
	}
	
	public boolean hasLowerChar(){
		for(int i = 0 ; i < code.length() ; i++){
			if(code.charAt(i) >= 'a' && code.charAt(i) <= 'z'){
				return true;
			}
		}
		return false;
	}
	public boolean hasNum(){
		for(int i = 0 ; i < code.length() ; i++){
			if( code.charAt(i) >= '1' && code.charAt(i) <= '9'){
				return true;
			}
		}
		return false;
	}
	
	public boolean hasOtherChar(){
		for(int i = 0 ; i < code.length() ; i++){
			if( (code.charAt(i) >= 32 && code.charAt(i) <= 47) || (code.charAt(i) >= 58 && code.charAt(i) <= 64)||(code.charAt(i) >= 91 && code.charAt(i) <= 96) ||(code.charAt(i) >= 123 && code.charAt(i) <= 125)){
				return true;
			}
		}
		return false;
	}
	
	public boolean has3SubStr(){
		for(int i = 0; i < code.length() - 3; i++){
			if(code.lastIndexOf(code.substring(i,i + 3)) != i){
				return true;
			}
		}
		return false;
	}
}

public class codeCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()){
			codeInfo cI = new codeInfo(scan.nextLine().toString());
			if( cI.enoughLength() ){
				if( (!cI.hasOtherChar() && !cI.hasLowerChar()) || (!cI.hasOtherChar() && !cI.hasUpperChar()) || !cI.hasChar() || (!cI.hasOtherChar() && !cI.hasNum()) || (!cI.hasUpperChar() && !cI.hasNum()) || (!cI.hasLowerChar() && !cI.hasNum()) || cI.has3SubStr()){
					System.out.println("NG");
				}
				else{
					System.out.println("OK");
				}
			}
			else{
				System.out.println("NG");
			}
		}
	}

}
