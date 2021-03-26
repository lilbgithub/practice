package practice.strings;

/**
 * select order.id , customer,id from oders left outer join customer customer  order.id == customer.id.
 */
public class StringsPractice {
    public static void main(String[] args) {
        // substrings();
        //  palindromSubSring();
        //stringCompression1();
       // stringCompression2();
        reverseStringExceptSpecialChar();

    }

    public static void reverseStringExceptSpecialChar() {
        String str = "a,b$c";
        char[] array =  str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right){
            if(!Character.isAlphabetic(array[left])){
                left++;
            }else if(!Character.isAlphabetic(array[right])){
                right--;
            }else {
                char ch =  array[left];
                array[left] =array[right];
                array[right] = ch;
                left++;
                right--;
            }
        }
        System.out.println("reverseStringExceptSpecialChar :"+ String.valueOf(array));
    }

    public static final void stringCompression2() {
        String str = "wwwwaaadexxxxxx";
        StringBuilder sb = new StringBuilder();
        char pre = str.charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (pre != ch) {
                sb.append(pre);
                if (count > 1) {
                    sb.append(count);
                }
                pre = ch;
                count = 1;
            } else {
                count++;
            }
        }
        sb.append(pre);
        if (count > 1) {
            sb.append(count);
        }
        System.out.println("Result " + sb.toString());
    }

    public static final void stringCompression1() {
        String str = "wwwwaaadexxxxxx";
        StringBuilder sb = new StringBuilder();
        char pre = str.charAt(0);
        sb.append(pre);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (pre != ch) {
                pre = ch;
                sb.append(ch);
            }
        }
        System.out.println("stringCompression1 : " + sb.toString());

    }

    public static final void palindromSubSring() {
        String s = "abccbc";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String subStr = s.substring(i, j);
                if (isPalindrom(subStr)) {
                    System.out.println(subStr);
                }
            }
        }
    }

    public static boolean isPalindrom(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static final void substrings() {
        String s = "abcd";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }
}
