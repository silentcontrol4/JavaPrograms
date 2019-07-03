package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// 1. Define the collection
		
		Set<String> animals=new TreeSet<String>();
		//LinkedHash - the order that they were entered ( Stack )
		//HashSet - Random Order
		//TreeSet- Alphabetic order
		
		// 2. Adding elements
		animals.add("dog");
		animals.add("pig");
		animals.add("hog");
		animals.add("cat");
		animals.add("snake");
        animals.add("hog");
        animals.add("cat");
        animals.add("goose");
System.out.println("Animals "+animals);

// 3.Create new set for comparison
Set<String> farmAnimals=new HashSet<String>();
farmAnimals.add("chicken");
farmAnimals.add("cow");
farmAnimals.add("pig");
farmAnimals.add("horse");
farmAnimals.add("dog");

System.out.println("FarmAnimals "+farmAnimals);

// 4. Intersection what's in animals thats also in farmAnimals
// a. Copy existing set into the new set
Set<String> intersection=new HashSet<String>(farmAnimals);

// b. Retain only elements in the other set farmAnimals
intersection.retainAll(animals);
System.out.println("Whats in animals thats also in farmAmimals"+intersection);

//5. What's in both ( in sets animals and farmAnimals )
Set<String> union=new HashSet<String>(animals);
union.addAll(farmAnimals);
System.out.println("Union whats in both sets "+union);

// 6.What is the difference ( in in animals 
Set<String> dif=new HashSet<String>(animals);
dif.removeAll(farmAnimals);
System.out.println("Difference between animals and farmAnimals  "+dif);




	}

}
