package dataStructures;

import java.util.ArrayList;

//ilustruje mo¿liwoœæ wpakowywania obiektów klas ró¿nych typów do kontenera bez typu generycznego.
public class ApllesAndOranges {

	
	
	
	
	
	
	
//	@SuppressWarnings("unchecked") wylacza ostzezenia kompilatora typu "unechecked"
	//@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

	
		ArrayList<Apple> apples=new ArrayList<Apple>();
for (int i=0;i<3;i++){
	
	apples.add(new Apple());
	//apples.add(new Orange());
}
/*for (int i=0;i<apples.size();i++){
		
		
	System.out.println(((Apple)(apples.get(i))).id());
	} */

for ( Apple a:apples){
	
	System.out.println((a.id()));
	
}
}		

	}


class Apple{
	
	private static long Counter;
	private final long id=Counter++;
	
	public long id(){
		
		return id;
	}
	
}

class Orange{
	
	
	
	
	
}