package StringManipulationHM;

public class StringM1 {

public static void main(String[] args) {
		
		String inp = "computer";
		String op = "";
		int n = inp.length();
		for(int i=n-1;i>=0;i--) {
			
			op+=inp.charAt(i);
			if(i>0)
			op+='-';
		
		}
		
		
		System.out.println(op);
		
	}
	
}
