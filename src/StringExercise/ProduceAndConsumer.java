package StringExercise;

import java.util.Scanner;

class Bread{  
    int id;
    Bread(int id){  
        this.id = id;  
    }  
    public String toString(){  
        return "Bread:"+id;  
    }  
}

class basketOfBread{
	int index = 0;
	Bread[] stb = new Bread[6];
	
	public synchronized void breadAdd(Bread br){
		
		while(index == stb.length){
			 try{  
	                this.wait();
	            } catch (InterruptedException e) {  
	                e.printStackTrace();  
	            } 
		}
		this.notify();
		stb[index] = br;
		index ++;
	}
	
	public synchronized Bread breadDecline(){
		
		while(index == 0){
			 try{  
	                this.wait();
	            } catch (InterruptedException e) {  
	                e.printStackTrace();  
	            } 
		}
		this.notify();
		index --;
		return stb[index];
	}
}


class Producer implements Runnable{
	basketOfBread bB = null;
	public Producer(basketOfBread boB){
		this.bB = boB; 
	}
	
	public void run(){
		int i = 0;
		while(i < 1000){
			Bread newB = new Bread(i);
			bB.breadAdd(newB);
			System.out.println("生产了" + newB);  
			try {  
	                Thread.sleep(200);//每生产一个馒头，睡觉10毫秒  
	            } catch (InterruptedException e) {   
	                e.printStackTrace();  
	            }   
			i++;
		}
		
	}
}

class Consumer implements Runnable{
	basketOfBread bB = null;
	public Consumer(basketOfBread boB){
		this.bB = boB; 
	}
	
	public void run(){
		int i = 0;
		while(true){
			Bread newB = new Bread(i);
			newB = bB.breadDecline();
			System.out.println("消费了" + newB);  
			try	{			
	                Thread.sleep(1000);//每生产一个馒头，睡觉10毫秒  
	            } catch (InterruptedException e) {   
	                e.printStackTrace();  
	            }   
		}
	}
}

public class ProduceAndConsumer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		basketOfBread basket = new basketOfBread();
		
		Producer pro = new Producer(basket);
		Consumer con = new Consumer(basket);

		Thread produce = new Thread(pro);
		Thread consume = new Thread(con);
		produce.start();
		consume.start();
	}

}
