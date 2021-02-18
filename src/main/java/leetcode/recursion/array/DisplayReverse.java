package leetcode.recursion.array;

public class DisplayReverse {
    public static void main(String[] args) throws Exception {
        displayArrReverse(new int[] {1,3,5,7,8}, 5);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        idx = idx -1;
        System.out.println(arr[idx]);
        if(idx == 0){
            return;
        }
        displayArrReverse(arr, idx);
    }
}
