import java.util.*;

public class Launcher {

	
	public static void main(String[] args){
		
		Launcher l = new Launcher();
		
		l.launch("ew");
	
	
	}
	
	public void launch(int newElement) {
		
		List<Integer> list = new ArrayList<Integer>();
	
		try {
				

			list.add(newElement);
			 
		
		
		} catch (NullPointerException ex) {
			
			ex.printStackTrace();
		
		} catch (Exception ex) {
			
			ex.printStackTrace();
		
		}
	} 
 }
 
 
 

 
 
 