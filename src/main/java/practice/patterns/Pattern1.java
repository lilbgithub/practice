package practice.patterns;

/**
 * 1. You are given a number n.
 * 2. You've to create a pattern of * and separated by tab as shown in output format.
 *
 *
 *	*
 *	*	*
 *	*	*	*
 *	*	*	*	*
 */
public class Pattern1 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int number){
        for(int i = 1 ; i<= number;i++){//5
            int spaces = number-i; //4, 3
            int stars = i; //1,2

            while (stars > 0){
                System.out.print("*\t");
                stars--;
            }
            while (spaces > 0){
                System.out.print("\t");
                spaces--;
            }
            System.out.println();
        }
    }
}
