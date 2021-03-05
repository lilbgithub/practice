package leetcode.string;

public class StringCompression {
    public static void main(String[] args) {
         compression1("aabbbccabbffffg");
        //compression2("aabbbccabbffffg");

    }

    public static String compression1(String str) {
        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (current != prev) {
                result.append(current);
            }
        }
        System.out.println(result.toString());
        return result.toString();
    }

    public static final String compression2(String str) {
        StringBuilder result = new StringBuilder(str.charAt(0));
        int count = 1;
        char current = str.charAt(1);
        for (int i = 1; i < str.length(); i++) {
            current = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (current == prev) {
                count++;
            } else {
                result.append(prev);
                if (count > 1) {
                    result.append(count);
                }
                count = 1;
            }
        }
            result.append(current);
            if (count > 1) {
                result.append(count);
            }

        System.out.println(result.toString());
        return result.toString();
    }
}
