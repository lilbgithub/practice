package leetcode.arrays;

public class Pattern11 {
    public static void main(String[] args) {
        int number = 5;
        int count = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("\t"+count++);
            }
            System.out.println();
        }
    }
}
