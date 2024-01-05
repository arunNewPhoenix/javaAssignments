package StringManipulationHM;

public class StringM4 {
	
	
	    public static void main(String[] args) {
	        String input = "Hi How are you";

	        String maxLengthSubstring = findMaxLengthSubstring(input);

	        System.out.println("Sample output: " + maxLengthSubstring);
	    }

	    public static String findMaxLengthSubstring(String input) {
	        String[] words = input.split(" ");
	        String maxLengthSubstring = "";

	        for (String word : words) {
	            if (word.length() > maxLengthSubstring.length()) {
	                maxLengthSubstring = word;
	            }
	        }

	        return maxLengthSubstring;
	    }
	

}
