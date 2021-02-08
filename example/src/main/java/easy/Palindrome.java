package easy;

public class Palindrome {
    public static void main(String[] args) {
        String str = "hihk";
        int j = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            j--;
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("NO polindrome");
            }
        }
        System.out.println("Yes polindrome");
    }
}
