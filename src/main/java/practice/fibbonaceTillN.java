package practice;

public class fibbonaceTillN {
    public static void main(String[] args) {
        fibboSerese(1);
    }

    public static final void fibboSerese(int n) {
        int prev = 0;
        int next = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(prev);
            int fibbo = prev + next;
            prev = next;
            next = fibbo;
        }
    }
}
