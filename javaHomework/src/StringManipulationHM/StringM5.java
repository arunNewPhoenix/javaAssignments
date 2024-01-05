package StringManipulationHM;

public class StringM5 {
	
	public static void main(String[] args) {
        String input = "Softra Services Limited";

        String abbreviation = generateAbbreviation(input);

        System.out.println("Output: " + abbreviation);
    }

    public static String generateAbbreviation(String input) {
        StringBuilder abbreviation = new StringBuilder();

        // Split the input into words
        String[] words = input.split(" ");

      
        for (String word : words) {
            if (!word.isEmpty()) {
                abbreviation.append(word.charAt(0));
            }
        }

        return abbreviation.toString();
    }

}
