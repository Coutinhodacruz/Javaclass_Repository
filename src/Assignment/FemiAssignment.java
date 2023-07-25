package Assignment;

public class FemiAssignment {

    public static void main(String[] args) {
        String element1 = "ab##d";
        String element2 = "e#df##eab#";

        System.out.println(hashForSpace(element1));
        System.out.println(hashForSpace(element2));

    }

    public static String hashForSpace(String userInput) {
        char check ='#';

        String[] characters = new String[userInput.length()];

        for (int i = 0; i < userInput.length(); i++) {
            if(userInput.charAt(i) == check) {
                for (int j = characters.length-1; j >= 0; j--) {
                    if (characters[j] != null) {
                        characters[j] = null;
                        break;
                    }
                }
                continue;
            }

            characters[i] = "" +userInput.charAt(i);
        }

        StringBuilder result = new StringBuilder();
        for (String letter : characters) {
            if(letter != null) result.append(letter);
        }
        return result.toString();
    }
}
