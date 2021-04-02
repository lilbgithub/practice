package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

/**
 * https://www.geeksforgeeks.org/java-program-to-find-common-elements-between-two-arrays/
 * Given two arrays and our task is to find their common elements.
 * Examples:
 * <p>
 * Input:  Array1 = ["Article", "for", "Geeks", "for", "Geeks"],
 * Array2 = ["Article", "Geeks", "Geeks"]
 * Output: [Article,Geeks]
 * <p>
 * Input:  Array1 = ["a", "b", "c", "d", "e", "f"],
 * Array2 = ["b", "d", "e", "h", "g", "c"]
 * Output: [b, c, d, e]
 */
public class FeildWire {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = new int[]{1, 3, 4, 5, 6, 9, 8};
        HashSet<Integer> set = new HashSet<>();

        Arrays.stream(arr1).forEach(set::add);

        int[] result = Arrays.stream(arr2)
                .filter(item -> set.contains(item)).
                toArray();

        System.out.println(Arrays.toString(result));

    }
}
