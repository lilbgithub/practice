package interview;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

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
        String[] arr1 = new String[]{"a", "b", "c", "d", "e", "f"};
        String[] arr2 = new String[]{"b", "d", "e", "h", "g", "c"};

       List<String> list = Arrays.stream(arr1).distinct().collect(Collectors.toList());

        List<String> result = Arrays.stream(arr2).distinct()
                .filter(item -> list.contains(item)).sorted().collect(Collectors.toList());

        //System.out.println(Arrays.toString(result.toArray()));

        //mergeTwoArraysAvoidDuplicate();
        mergeTwoArraysAvoidDuplicateSolution2();

    }
    public static void mergeTwoArraysAvoidDuplicate(){

        String[] arr1 = new String[]{"a", "b", "c", "d", "e", "f"};
        String[] arr2 = new String[]{"b", "d", "e", "h", "g", "c"};

        List<String>  result = Arrays.stream(arr1).distinct().collect(Collectors.toList());
        Arrays.stream(arr2).distinct().filter(i-> !result.contains(i)).forEach(i-> result.add(i));

        Collections.sort(result);
        System.out.println(result);
    }
    public static void mergeTwoArraysAvoidDuplicateSolution2(){

        String[] arr1 = new String[]{"a", "b", "c", "d", "e", "f"};
        String[] arr2 = new String[]{"b", "d", "e", "h", "g", "c"};

        Set<String>  set = new LinkedHashSet<>(Arrays.asList(arr1));
        set.addAll(Arrays.asList(arr2));

        List<String> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
