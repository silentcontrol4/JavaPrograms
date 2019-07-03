package recursive;

//Write a function that takes a value n returns the sum of numbers 1 to n


public class SumofN {

	public static void main(String[] args) {
		
		sum(52);
		
		
		
		

	}
	
	public static void sum(int n){
		
		
		int sum=0;
		for (int i =1;i<=n;i++){
			
			sum+=i;
		}
		
		System.out.println("Sum of numbers less the n : "+n+" is "+sum);
		
		
	}

}
