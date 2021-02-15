package leetcode.arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arrayI = {10, 30, 50};
        int[] arrayJ = {20, 40, 60, 70, 80};
        int i = 0;
        int j = 0;
        int[] resultArray = new int[arrayI.length + arrayJ.length];
        for (int k = 0; k < resultArray.length; k++) {
            if (i < arrayI.length && j < arrayJ.length) {
                if (arrayI[i] > arrayJ[j]) {
                    resultArray[k] = arrayJ[j];
                    j++;
                } else {
                    resultArray[k] = arrayI[i];
                    i++;
                }
            } else if (i < arrayI.length) {
                resultArray[k] = arrayI[i];
                i++;
            } else if (j < arrayJ.length) {
                resultArray[k] = arrayJ[j];
                j++;
            }
        }
        for (int item : resultArray) {
            System.out.println(item);
        }
    }
}
