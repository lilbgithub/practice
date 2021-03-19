package interview;
/*
 * Find the pairs in a given array that form the greatest product.
 *
 * Example: given {2, 4, 1, 0, 3}, the answer is {3,4} (3x4 = 12)
 *  print the highest product combination even if it is negative
 *
 */

import java.util.Arrays;

class USBank {

    private static int[] numbers ={-5, 2, 0, -2, 3, 7, 4, -4, -100};

    private static int[] maxProduct(int[] array) {
        if(array== null || array.length <2){
            throw new IllegalArgumentException("Please provide valide array input");
        }
        int max = array[0];
        int prevMax = array[1];
        int negativeMax = array[0];
        int negativePrevMax = array[1];
        for(int i=1; i< array.length; i++){
            int currentElement = array[i];
            if(currentElement > max){
                prevMax = max;
                max = currentElement;
            }else if(currentElement > prevMax){
                prevMax = currentElement;
            }

            if(currentElement < 0){
                if(currentElement < negativeMax){
                    negativePrevMax = negativeMax;
                    negativeMax = currentElement;
                }else if(currentElement < negativePrevMax){
                    negativePrevMax = currentElement;
                }
            }

        }

        int positiveProduct = max * prevMax;
        int negativeProduct = negativeMax * negativePrevMax;

        if(positiveProduct < negativeProduct){
            return new int[]{negativeMax,negativePrevMax};
        }else{
            return new int[]{max , prevMax};
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxProduct(numbers)));
    }

}
