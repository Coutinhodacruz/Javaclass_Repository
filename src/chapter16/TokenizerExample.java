package chapter16;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class TokenizerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();


        String[] tokens = input.split("\\s+");


        TreeSet<String> tokenSet = new TreeSet<>();


        Collections.addAll(tokenSet, tokens);

        System.out.println("Tokens in ascending order:");
        for (String token : tokenSet) {
            System.out.println(token);
        }
    }
}
