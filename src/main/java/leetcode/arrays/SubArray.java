package leetcode.arrays;

public class SubArray {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c'};

        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print("\t" + chars[k]);
                }
                System.out.println();
            }
        }
    }
}
