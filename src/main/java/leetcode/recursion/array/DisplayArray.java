package leetcode.recursion.array;

public class DisplayArray {
    public static void main(String[] args) throws Exception {
        displayArr(new int[]{1,2,3,8,9}, 5);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx == 0){
            return;
        }
        displayArr(arr, idx -1);
        System.out.println(arr[idx -1]);
    }
}
