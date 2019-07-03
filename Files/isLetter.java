package Files;

public class isLetter {
	
	
	
	
	public static void main(String[] args) {
	
		
		String[] d={"ala","ma","kota"};
//

		System.out.println(isaLetter(d));
				
				
			
	
	}
		
	public static boolean isaLetter(String[] s){
			 String nowy=new String();
			char[] c=new char[s.length];	
					
		for (int i=0;i<3;i++){
			

		nowy+=(s[i]);
									
		}
							
		System.out.println("nowy "+nowy);
				
		
		for (int j=0;j<nowy.length();j++){
			c=nowy.toCharArray();
			System.out.println("litera "+c[j]+"   "+(int)Character.valueOf(c[j]));
			
			if ((((int)(c[j]))>=65)&&((int)(c[j]))<=90) { 
			
			}
	else if ((((int)(c[j]))>=97)&&((int)(c[j]))<=122) {
				
									
			}
			
			else {return false;}
			
			
		}
		
				
		
	return true;
			
		}
		
		
		
				
		
		
	}
	
	


