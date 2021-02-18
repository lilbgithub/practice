package leetcode.string;

/**
 * https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/toggle-case-official/ojquestion
 */
public class ToggleCase {
    public static void main(String[] args) {
        String input = "abcDE";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                char upperChar = (char) (ch - 'a' +'A');
                result.append(upperChar);
            }else if(ch >= 'A' && ch<='Z'){
                char lowerChar = (char) (ch - 'A' + 'a');
                result.append(lowerChar);
            }
        }
        System.out.print(result.toString());
    }
}
