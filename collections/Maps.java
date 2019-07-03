package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// Implement map interfaces
		
		TreeMap<Integer,String> hmap=new TreeMap<Integer,String>();
		
		mapUtil(hmap);
		
		
		
		
		
		
		
		

	}
	
	
	public static void mapUtil(Map<Integer,String> map){
		
		//1 . Add key value pairs 
		map.put(502,"Roger");
		map.put(12,"Jessica");
		map.put(312,"Mayca");
		map.put(750,"Kelly");
		map.put(1,"Steven");
		//2 . Exposure/Access Elements
		
		System.out.println("See all the keys generated "+map.keySet());
		System.out.println("See all the keys map.value pairs "+map);
		
		
		// 3. Iterate through key-vale pair maps
		for (int key : map.keySet()){
			
			System.out.println(" KEY : "+key+" value is "+map.get(key));
			
		}
		
		
		
	}

}
