package dataStructures;
import java.util.*;
import java.util.Collection;
public class PrintingContainers {
	static Collection fill(Collection<String> collection){
		collection.add("Szczur");
		collection.add("Mysz");
		collection.add("Kot");
		collection.add("Pies");
		collection.add("Pies");
		return collection;
		
	}
	
	static Map fill(Map<String,String> map){
		map.put("Szczur","Gonek");
		map.put("Mysz", "Jolanta");
		map.put("Kot", "Pusia");
		map.put("Pies", "Tofik");
		map.put("Pies", "Kaki");
		
		return map;
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		System.out.println("ArrayList " +fill(new ArrayList<String>()));
		System.out.println("LinkedList "+fill(new LinkedList<String>()));
		System.out.println("HashSet "+fill(new HashSet<String>()));
		System.out.println("TreeSet " +fill(new TreeSet<String>()));
		System.out.println("LinkedHashSet "+fill(new LinkedHashSet<String>()));
		System.out.println("HashMap "+fill(new HashMap<String,String>()));
		System.out.println("TreeMap "+fill(new TreeMap<String,String>()));
		System.out.println("LinkedHashMap "+fill(new LinkedHashMap<String,String>()));
		
		
		
		
		
		
		
		

	}

}
