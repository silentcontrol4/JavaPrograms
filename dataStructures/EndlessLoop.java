package dataStructures;

import java.util.Random;

public class EndlessLoop {

	public static void main(String[] args) {
	
		 boolean endless=true;
		 int[] liczby=new int[100];
		 Random rand=new Random();
		
	
		while (endless){
			for (int i=0;i<100;i++){
				   liczby[i]=rand.nextInt(100);
						 
						
					}
		
			// System.out.println(rand.nextInt(101));
			for (int i:liczby){
				System.out.println(i);
				
			
				
			}
			
			
		}
		
		
	
		 
		
		
		
		
		
		
		
		
		
		

	}

}
