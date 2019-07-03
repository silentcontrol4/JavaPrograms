package algoryths;

public class Demo {

	
	
	
	public static void main(String[] args) {

		int[] numbers={10,9,8,7,6,5,4,3,2,1};
		int[] sortedNumbers={1,10,20,30,40,52,60,70,80,90,100,1232};
	
		
		
		// Call a function that search for specific number linear search
	//	int position=algoryths.Search.linearSearch(numbers, 132);
		//System.out.println(position);
		// Call the binary search
	//	int index=algoryths.Search.binarySearch(sortedNumbers, 60, 0,sortedNumbers.length-1 );
		//System.out.println(index);
		
		
		//Call the bubbleSort function
		
		Sort.bubbleSort(numbers);
		
		
	}

}
