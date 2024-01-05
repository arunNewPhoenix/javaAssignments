package StringManipulationHM;

public class StringM6 {
	public static void main(String[] args) {
        String input = "hello java";

        String output = getNextCharacters(input);

        System.out.println("Sample output: " + output);
    }

    public static String getNextCharacters(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            
            if (Character.isLetter(ch)) {
               
                char nextChar = (char) (ch + 1);
                result.append(nextChar);
            } else {
               
                result.append(ch);
            }
        }

        return result.toString();
    }
}
