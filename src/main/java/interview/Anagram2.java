package interview;

import java.util.*;

public class Anagram2 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Rat");
        words.add("Car");
        words.add("Below");
        words.add("Tast");
        words.add("Cried");
        words.add("Study");
        words.add("Thing");
        words.add("Chin");
        words.add("Grab");
        words.add("Act");
        words.add("Robed");
        words.add("Vase");
        words.add("Glean");
        words.add("Desserts");
        words.add("Tar");
        words.add("Arc");
        words.add("Elbow");
        words.add("State");
        words.add("Cider");
        words.add("Dusty");
        words.add("Night");
        words.add("Inch");
        words.add("Brag");
        words.add("Cat");
        words.add("Bored");
        words.add("Save");
        words.add("Angel");
        words.add("Streseed");
        Map<String, List<String>> map = new HashMap<>();

        for (String orgKey : words) {
            String sortedKey = sorted(orgKey);
            List<String> list = new ArrayList<>();
            if (map.containsKey(sortedKey)) {
                list = map.get(sortedKey);
                list.add(orgKey);
                map.put(sortedKey, list);
            } else {
                list.add(orgKey);
                map.put(sortedKey, list);
            }
        }

        for (String key : map.keySet()) {
            List<String> list = map.get(key);
            if (list.size() > 1) {
                System.out.println(list);
            }
        }


    }

    public static String sorted(String str) {
        char[] array = str.toLowerCase().toCharArray();
        Arrays.sort(array);
        return Arrays.toString(array);
    }
}
