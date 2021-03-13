package interview;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramFinder {

    public static void main(String[] args) throws IOException {
        if (greet(args)) return;
        String fileName = args[0];

        while (true) {
            System.out.println("Enter the string to search: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            runAnagramFinder(fileName, input);
        }
    }

    /**
     * Greet the user on application start up, check if the file name is provided.
     *
     * @param args name of the dictionary file.
     * @return boolean flag to stop/continue program execution.
     */
    private static boolean greet(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the dictionary file");
            return true;
        }

        System.out.println("Welcome to the Anagram Finder");
        System.out.println("-----------------------------");
        return false;
    }

    /**
     * Run anagram finder.
     *
     * @param fileName name of the directory file to load
     * @param input    user input string
     * @throws IOException
     */
    private static void runAnagramFinder(String fileName, String input) throws IOException {
        Instant timerStart = Instant.now();
        List<String> results = find(fileName, input).get();
        Instant timerStop = Instant.now();
        long anagramSearchDuration = ChronoUnit.MILLIS.between(timerStart, timerStop);

        if (results.size() == 0) {
            System.out.println("No anagrams found for " + input + " in " + anagramSearchDuration + "ms");
        } else {
            System.out.println(results.size() + " anagrams found for " + input + " in " + anagramSearchDuration + "ms");
            System.out.println(String.join(",", results));
        }
    }

    /**
     * Find the anagram of a given input string using file stream.
     *
     * @param fileName file name
     * @param input    user input string
     * @return list of anagram strings
     * @throws IOException
     */
    private static Optional<List<String>> find(String fileName, String input) {

        Optional<List<String>> result = Optional.empty();
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            result = Optional.of(lines.filter(word -> isAnagram(word, input))
                    .collect(Collectors.toList()));
        } catch (IOException e) {
            //Note: I usually have logger here to capture error info, however given the scope of assignment, skipping it.
            System.out.println("Unable to load dictionary file: " + fileName);
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Find if the strings are anagram.
     *
     * @param str1 string 1
     * @param str2 string 2
     * @return boolean result
     */
    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        int[] letters = new int[256];
        for (Character ch : str1.toCharArray()) {
            letters[ch]++;
        }
        for (Character ch : str2.toCharArray()) {
            letters[ch]--;
        }
        for (int i : letters) {
            if (i != 0) return false;
        }
        return true;
    }

}



