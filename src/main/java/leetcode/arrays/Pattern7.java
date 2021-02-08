package leetcode.arrays;

public class Pattern7 {
    public static void main(String[] args) {
        int number = 5;
        int spaces =0;
        for(int i=1; i<= number; i++){

            for (int j=0;j<=spaces;j++){
                System.out.print("\t");
            }
            System.out.print("\t*");
            System.out.println();
            spaces++;
        }
    }
}
