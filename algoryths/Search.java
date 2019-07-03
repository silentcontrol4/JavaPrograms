package algoryths;

public class Search {

	
	
	public static int linearSearch(int [] dataset,int target){
		
		//Iterate through data et searching for target
		for (int i=0;i<dataset.length;i++){
			
			if (dataset[i]==target){
				
				return i;
				
				
			}
			
		}
		
		return -1;
		
		
	}
	
	public static int binarySearch(int[] dataset,int target,int start,int end){
		
		//Binary searches assumes a sorted array and and continually split our search in half
		
		
		System.out.println("Searching between "+dataset[start]+" and  "+dataset[end]);
		
		int middle=(int) (Math.floor(start+end)/2);
		int value=dataset[middle];
		

		
		
		
		if (target>value){
			System.out.println(target+" > "+value);
			return binarySearch(dataset,target,middle+1,end);
			
		}
		else if (target < value){
			System.out.println(target+" < "+value);
			return binarySearch(dataset,target,start,middle-1);
			
		}
		System.out.println(target+" = "+value);
		return middle;
		
	}
	
	
	
}
