package collections;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {

		//1.Define the collections
		
		ArrayList<String> cities=new ArrayList<String>();
		
		//2. Add some elements
		
		cities.add("Cleveland");
		cities.add("Toronto");
		cities.add("Vancuver");
		cities.add("Dallas");
		 //3.Iterate through collection
		
		for (String city : cities){
			System.out.println(city);
			
			
		}
		//4.Get the size of the collection
		int size=cities.size();
		System.out.println("There are : "+size+" elements in the collection");
		
		//5.Get the specific element of the collection 
		System.out.println(cities.get(2));
		
		//6. Remove
		cities.remove(1);
		size=cities.size();
		System.out.println("Now There are : "+size+" elements in the collection");
		for (String city : cities){
			System.out.println(city);
			
			
		}
	}

}
