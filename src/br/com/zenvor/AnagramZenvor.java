package br.com.zenvor;

import java.util.ArrayList;
import java.util.List;

public class AnagramZenvor {

    public static List<String> generateAnagrams(String input) {
        List<String> result = new ArrayList<>();
        // Validate input: it should not be null, empty, and should contain only letters
        // If the input is invalid, return an empty list
        if (input == null || input.isEmpty() || !input.matches("[a-zA-Z]+")) {
            System.out.println("Invalid input. Please provide a non-empty string containing only letters.");
            return result;
        }

        backtrack("", input, result);
        return result;
    }

    private static void backtrack(String prefix, String input, List<String> result) {
        if (input.isEmpty()) {
            result.add(prefix);
            return;
        }
        generateAnagram(prefix, input, result);

    }

    private static void generateAnagram(String prefix, String input, List<String> result) {
        for (int i = 0; i < input.length(); i++) {
            String prefixResult = prefix + input.charAt(i);
            String inputSubstring = input.substring(0, i) + input.substring(i + 1);
            backtrack(
                    prefixResult,
                    inputSubstring,
                    result
            );
        }
    }
}
