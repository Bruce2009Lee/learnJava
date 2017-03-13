package StringExercise;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 
 

请实现如下接口    /* 功能：四则运算     
 			  * 输入：strExpression：字符串格式的算术表达式，如: "3+2*{1+2*[-4/(8-6)+7]}"   
		      * 返回：算术表达式的计算结果     
 * 
 * */
public class arithmeticOfJava {
	String in ;
	Stack<Integer> opt = new Stack<Integer>();
	Stack<Integer> number = new Stack<Integer>();
	public arithmeticOfJava(){
		this.in = null;
	}
	
	public arithmeticOfJava(String str){
		this.in = str;
		for(int i = 0, tmp = 0; i < in.length() ; i++){
			if((in.charAt(i) >= '0'&&in.charAt(i) <= '9')){
				tmp = i;
				while(in.charAt(i) >= '0' && in.charAt(i) <= '9'){
					i++;
					if(i == in.length()){
						break;
					}
				}
				if(tmp != 0 &&(in.charAt(tmp - 1) == '-')){
					number.push(-Integer.parseInt(in.substring(tmp,i)));
				}
				else{
					number.push(Integer.parseInt(in.substring(tmp,i)));
				}
			}
		}
	}
	
	public boolean isNumber(int i){
		char tmp = in.charAt(i);
		if( tmp >= '0' && tmp <= '9' ){
			return true;
		}
		else{
			return false;
		}	
	}
	
	public void operators(){
		String str = "3+2*{1+2*[-4/(8-6)+7]}";
		//将（-23+54）匹配出来
		Pattern pattern1 = Pattern.compile( "[\\{\\(\\[][+\\-]*?[1-9][0-9]*[\\-+\\*/][1-9][0-9]*[\\)\\]\\}]");
  
		Matcher matcher1 = pattern1.matcher(str);
		
		//将（-23+54*2）匹配出来
		Pattern pattern2 = Pattern.compile( "[\\{\\(\\[][+\\-]*?[1-9][0-9]*[\\-+\\*/][1-9][0-9]*[\\-+\\*/][1-9][0-9]*[\\)\\]\\}]");

		String tmp = null;
		while(matcher1.find()) {  
			tmp = matcher1.replaceFirst("" + computerOfTwoNum(matcher1.group()));
			Matcher matcher2 = pattern2.matcher(tmp);
			while(matcher2.find()){
				tmp = matcher2.replaceFirst("" + computerOfThreeNum(matcher2.group()));
				matcher2 = pattern2.matcher(tmp);
			}
			matcher1 = pattern1.matcher(tmp);	    
		}
		System.out.print("result:" +  computerOfThreeNum(tmp));
	}
	
	//只能计算（82+7）之类的表达式
	public int computerOfTwoNum(String in){
	
		Pattern pattern1 = Pattern.compile( "[+\\-]*?[1-9][0-9]*");
		Pattern pattern2 = Pattern.compile( "[\\-+\\*/]");
		
		Matcher matcher1 = pattern1.matcher(in);
		Matcher matcher2;
		if(in.charAt(0) <= '0'||in.charAt(0) >= '9'){
			matcher2 = pattern2.matcher(in.substring(2,in.length()));
		}
		else{
			matcher2 = pattern2.matcher(in.substring(1,in.length()));
		}
		
		int num1 = 0,num2 = 0,result = 0;
		if(matcher1.find()) {  
			num1 = Integer.parseInt(matcher1.group());	
		}
		if(matcher1.find()) {  

			num2 = Integer.parseInt(matcher1.group());		  
		}
		if(matcher2.find()) { 
			System.out.println(matcher2.group());
			switch(matcher2.group().charAt(0)){
				case '+':
					result = num1 + num2;
					break;
				case '-':
					if((matcher2.group().charAt(0) == '-' && num2 < 0)){
						result = num1 + num2;
					}
					else{
						result = num1 - num2;
					}
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num1 / num2;
					break;
			}	    
		}
		return result;
	}
	//计算（82+7*2）之类的表达式
	public int computerOfThreeNum(String in){
		//*/模式
		Pattern pattern1 = Pattern.compile( "[\\-]*?[1-9][0-9]*[\\*/][+\\-]*?[1-9][0-9]*");
		//+-模式
		Pattern pattern2 = Pattern.compile( "[+\\-]*?[1-9][0-9]*[+\\-][+\\-]*?[1-9][0-9]*");
		
		Matcher matcher1 = pattern1.matcher(in);
		Matcher matcher2 ;
		
		int num1 = 0,result = 0;
		String str = null;
		while(matcher1.find()) {  
			str = matcher1.replaceFirst("" + computerOfTwoNum(matcher1.group()));
			matcher2 = pattern2.matcher(str);
			if(matcher2.find()){
				result = computerOfTwoNum(matcher2.group());
			}
		}	
		return result;
	}
	
//	public void print(){
//		for(Integer num:number){
//			System.out.print(num + " ");
//		}
//	}
//	
	public static void main(String[] args) {
		arithmeticOfJava input = new arithmeticOfJava("3+2*{1+2*[-4/(8-6)+7]}");
		input.operators();
	}

}
