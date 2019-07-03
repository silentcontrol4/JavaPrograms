package recursive;

// Write 3 functions that take an array as a parameter
// and return the minimum, average, and maximum values of that array.
// Hint: this should be static functions with a return type of the same data type as the array declaration.



public class ArrayValues {

	static int [] values = {23,20,30,40,232,11,-2,74};
	
	public static void main(String[] args) {
		
		System.out.println("Min value of the array = : "+minValue(values));
		System.out.println("Aeverage value of the array = : "+avgValue(values));
		System.out.println("Max value of the array = : "+maxValue(values));
		
		
	
	}
	
	
	static int minValue(int[] k){
		int minValue=k[0];
		
		for (int i=0;i<k.length;i++){
			
			if (k[i]<minValue){
				
				minValue=k[i];
				
			}
			
			
		}
						
			
		return minValue;
		
	}
	
	
	
	
	static int avgValue(int[] k){
		int avGvalue=0;
		
for (int i=0;i<k.length;i++){
			
	avGvalue+=k[i];
		
}
		
		
		
		
		
		
		
		return avGvalue/k.length;
		
	}
	
	
	
	
	
	static int maxValue(int[] k){
		int maxValue=0;
		
		maxValue=k[0];
		
		for (int i=0;i<k.length;i++){
			
			if (k[i]>maxValue){
				
				maxValue=k[i];
				
			}
		
		
		}
		
		
		
		
		return maxValue;
		

	
	

	

}
}
