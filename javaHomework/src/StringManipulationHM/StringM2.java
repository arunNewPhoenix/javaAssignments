package StringManipulationHM;

public class StringM2 {
	
	public static void main(String[] args) {
	
		String inp = "abcxXXcxerxxXXwer";
		
		String parsedStr = "";
		String opstr = "";
		int count = 0;
		
		for(int i=0;i<inp.length();i++) {
		    
			if(inp.charAt(i)=='x') {
				count++;
			}
			if(inp.charAt(i)!='x') {
				parsedStr += inp.charAt(i);
			}
			
		}
		
		for(int i=0;i<count;i++) {
			parsedStr+='x';
		}
		
		
		System.out.println(parsedStr);
		
		
	}
	
}
