package recursive;
/*Write a function that computes the factorial value
Definition: n! = n*(n-1)! , where 0! = 1 */

public class factorial {
	

	public static void main(String[] args) {
	
		System.out.println(factorial(16));
		
		
		
	}
	
	
	static int factorial(int f){
		
		int factor=1;
		for (int i=1;i<=f;i++){
			
			
			factor=i*(factorial(i-1));
			
						
			
		}
		
		return factor;
		
		
		
	}
	
	
	
	
	

}
