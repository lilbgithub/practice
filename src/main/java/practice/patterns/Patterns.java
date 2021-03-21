package practice.patterns;


import jdk.nashorn.internal.parser.JSONParser;

public class Patterns {
    public static void main(String[] args) {
        //  printPattern2(5);
       // printPattern3(5);
       // printPattern5(5);
        printPatternTrangle(4);

        //Patterns.pattern11(5);
       // pattern6(5);
      //  pattern7(5);
    }

    /**
     * *	*	*	*	*
     * *	*	*	*
     * *	*	*
     * *	*
     * *
     */
    public static final void printPattern2(int n) {
        for (int i = 0; i < n; i++) {
            int spaces = i;
            int stars = n - spaces;

            while (stars > 0) {
                System.out.print("*\t");
                stars--;
            }

            while (spaces > 0) {
                System.out.print("\t");
                spaces--;
            }
            System.out.println();
        }
    }


    /**
     * *
     * *	*
     * *	*	*
     * *	*	*	*
     * *	*	*	*	*
     */
    public static final void printPattern3(int n) {
        for (int i = 0; i <= n; i++) {
            int space = n - i;
            int stars = i;

            while (space > 0) {
                System.out.print("\t");
                space--;
            }
            while (stars > 0) {
                System.out.print("*\t");
                stars--;
            }
            System.out.println();
        }
    }

    /**
     *
     * 		*
     * 	*	*	*
     * *	*	*	*
     * 	*	*	*
     * 		*
     * @param n
     */
    public static final void printPattern5(int n) {

        int spaces = n/2;
        int stars = 1;

        for (int i=0; i<n; i++){
            for (int j=0; j< spaces; j++){
                System.out.print("\t");
            }
            for (int k=0; k<stars; k++){
                System.out.print("*\t");
            }

            System.out.println();

            if(i < n/2) {  //5/2 = 2
                spaces = spaces - 1;
                stars = stars + 2;
            }else {
                spaces = spaces + 1;
                stars = stars - 2;
            }
        }
    }

    /**
     * *	*	*		*	*	*
     * *	*				*	*
     * *						*
     * *	*				*	*
     * *	*	*		*	*	*
     * @param n
     */

    public static final void pattern6(int n) {
        int star = n/2 +1;
        int space = 1;

        for(int i=1; i<=n; i++){
           // System.out.println(star +","+ space);
            for (int j=0; j<star; j++){
                System.out.print("*\t");
            }
            for (int j=0; j<space; j++){
                System.out.print("\t");
            }
            for (int j=0; j<star; j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i <= n/2){
                star--;
                space= space+2;
            }else {
                star++;
                space= space-2;
            }

        }
    }
    /**
     *       *
     *      * *
     *     * * *
     *    * * * *
     */
    public static final void printPatternTrangle(int n) {//4

        int spaces = n-1;
        int stars =1;
        for(int i=1; i<= n; i++){

            for (int j=0; j< spaces; j++){
                System.out.print("\t");
            }
            for (int k=0; k<stars; k++){
                System.out.print("*\t");
            }
            System.out.println();

             stars = stars + 2;
             spaces = spaces -1;


        }
    }

    /**
     * https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-11-official/ojquestion
     */
    public static final void pattern11(int n){
        int count = 1 ;
        for(int i=1; i<=n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print( count + "\t");
                count++;
            }
            System.out.println();
        }

    }
    public static final void pattern7(int n){
        for(int i=0; i<n; i++){
         for(int j=0; j<i;j++){
             System.out.print("\t");
         }
         System.out.print("*\t");
            System.out.println();
        }
    }
}
