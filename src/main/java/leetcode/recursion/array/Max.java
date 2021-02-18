package leetcode.recursion.array;

public class Max {
    public static void main(String[] args) throws Exception {
        System.out.println(maxOfArray(new int[]{4,5,8,9,2}, 0));

    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == 0){
            return 0;
        }
        int next  = maxOfArray(arr, idx -1);
        int current = arr[idx];
         if( next >current ){
             current = next;
         }
        return current;
    }
}
