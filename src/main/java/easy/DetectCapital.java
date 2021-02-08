package easy;

import java.util.function.Predicate;

public class DetectCapital {
    public static void main(String[] args) {
        boolean result = detect("AAs");

        if (result) {
            System.out.println("fine");
        } else {
            System.out.println("not fine");
        }


    }

    public static boolean detect(String str) {
        if (str.length() <= 1) {
            return true;
        }

        Predicate<Character> correctCase = Character::isLowerCase;

        if (Character.isUpperCase(str.charAt(0)) && Character.isUpperCase(str.charAt(1))) {
            correctCase = Character::isUpperCase;
        }
        for (int i = 1; i < str.length(); i++) {
            if (!correctCase.test(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
