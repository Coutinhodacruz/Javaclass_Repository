package algorithm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C15Regex {
    public static void main(String[] args) {
        String cohortName = "elites";
        System.out.println(cohortName.matches("[^a-z]+[A-Z]"));

        String atoz = "weAre1234@###Lucky";

        System.out.println(atoz.matches("[A-Za-z]+"));

        String email = "native@gmail.com";
        System.out.println(email.matches("[a-z]+@gmail\\.com"));

        String number = "0808-000-7777";
        System.out.println(number.matches("\\d{4}-\\d{3}-\\d{4}"));
        System.out.println(number.matches("[0-9]{4}-[0-9]{3}-[0-9]{4}"));

        System.out.println(password("coutinhoDacruz10@"));


    }

    private static void patternMatcher(String word){
        Pattern expression = Pattern.compile("[A-Za-z\\s]+\\d");
        Matcher matcher = expression.matcher(word);
        while (matcher.matches()){

        }
    }
    private static boolean password(String password){
        return password.matches("(^?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?!.*\\s)(?=.*[@#$^&*()_+]).{8,}$");
    }
}
