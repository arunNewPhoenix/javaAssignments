package StringManipulationHM;

public class StringM3 {
	
	public static void main(String[] args) {
		
		String input = "Hello World";

        
        if (input.length() >= 2) {
           
            char[] charArray = input.toCharArray();

            // Swap the first and last characters using a temporary variable
            char temp = charArray[0];
            charArray[0] = charArray[input.length() - 1];
            charArray[input.length() - 1] = temp;

            
            String output = new String(charArray);

            System.out.println("Sample output: " + output);
        } else {
            System.out.println("String should have at least two characters.");
        }
	
		
		
		
		
		
	}

}
