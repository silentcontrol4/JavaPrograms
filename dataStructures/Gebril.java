package dataStructures;
import java.util.ArrayList;



// przyk³adowe inicjowanie funcji na elementach wybranych z ArrayList
public class Gebril {
private int gebrilNumber;

	public Gebril(int gebrilNumber){
	this.gebrilNumber =	gebrilNumber;
		
	
		
	}
	
	public int hop(){
		
		System.out.println(" HOP "+gebrilNumber);
		return gebrilNumber;
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	

		ArrayList<Gebril> skoczki=new ArrayList<Gebril>();
		
		for (int i=0;i<3;i++){
			
			skoczki.add(new Gebril(i));
		
		}
		for ( Gebril b:skoczki){
		skoczki.get(b.hop());
			
			
			
			
		}
		
		
		
		
		
		
	}

}
