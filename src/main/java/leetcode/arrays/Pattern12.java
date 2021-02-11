package leetcode.arrays;

public class Pattern12 {
    public static void main(String[] args) {
        int number = 4;
        int fibbo = 0;
        int prev1 = 0;
        int prev2 = 0;

        for (int i = 1; i <= number; i++) {
            if(i==1){
                System.out.print("\t" +0);
                prev2 =1;
            }else{
                for(int j = 1;j<= i ;j++){
                    fibbo = prev1 + prev2;
                    prev1 = prev2;
                    prev2 = fibbo;
                    System.out.print("\t" + fibbo);
                }
            }
            System.out.println();
        }

        }
    }

