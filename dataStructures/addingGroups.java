package dataStructures;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class addingGroups {

	public static void main(String[] args) {
	
		Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Integer [] moreints={6,7,8,9,10};
		collection.addAll(Arrays.asList(moreints));
		Collections.addAll(collection, moreints);
		Collections.addAll(collection, 11,12,13,14,15);
List<Integer> list=Arrays.asList(16,17,18,19);
		List<Integer> list2=new ArrayList<Integer>();
		list.set(1, 99);
	
	for (Integer b:list){
			System.out.println(b.toString());
			
		}
		}
	
		
		
		
	}


