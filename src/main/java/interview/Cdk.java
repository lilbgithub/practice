package interview;

public class Cdk {
    /**
     * Given a binary array, find the maximum number of consecutive 1s in this array.
     * <p>
     * Input: [1,1,0,1,1,1]
     * <p>
     * Output: 3
     */
    public static void main(String[] args) {
        test();
        //test2();
    }

    private static void test2() {
        int[] array = {1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0};
        int count = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count; //3
                }
                count = 0;
            }
            if (count > max) {
                max = count; //3
            }

        }

        System.out.println("max count is " + max);
        String srt = "tew";
        srt.indexOf("t");
    }

    /**
     * You are given a license key represented as a string S which consists only alphanumeric character and dashes. The string is separated into N+1 groups by N dashes.
     * <p>
     * Given a number K, we would want to reformat the strings such that each group contains exactly K characters, except for the first group which could be shorter than K, but still must contain at least one character.
     * <p>
     * Furthermore, there must be a dash inserted between two groups and all lowercase letters should be converted to uppercase.
     * <p>
     * Given a non-empty string S and a number K, format the string according to the rules described above.
     * <p>
     * <p>
     * Input: S = "5F3Z-2e-9-w", K = 4
     * <p>
     * Output: "5F3Z-2E9W"
     * <p>
     * 5F-3Z-2E-9W  //2
     */
    public static void test() {
        int k = 2;
        String str = "5F3Z-2e-9-w".replaceAll("-", "");
        int firstGroupLength = str.length() % k;
        StringBuilder sb = new StringBuilder();
        int start = 0;
        while (start < firstGroupLength) {
            sb.append(str.charAt(start));
            start++;
        }

        int nextGroupStartIndex =0;
        if(firstGroupLength > 0){
            nextGroupStartIndex = str.length() - firstGroupLength;
        }

        while (nextGroupStartIndex < str.length()) {
            int upToIndex = nextGroupStartIndex + k;
            while (nextGroupStartIndex < upToIndex) {
                Character ch = Character.toUpperCase(str.charAt(nextGroupStartIndex));
                sb.append(ch);
                nextGroupStartIndex++;
            }
            if(nextGroupStartIndex < str.length()){
                sb.append("-");
            }
        }

        System.out.println("Result############ " + sb.toString());
    }

}
