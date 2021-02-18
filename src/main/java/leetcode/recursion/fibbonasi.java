package leetcode.recursion;

public class fibbonasi {
    public static void main(String[] args) {
        System.out.println(fibbo(4));
    }
    public static final int fibbo(int n){
        if(n<=2){
            return 1;
        }else {
            return fibbo(n -1) + fibbo(n-2);
        }
    }
}
