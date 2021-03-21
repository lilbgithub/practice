package practice.gettingStarted;

import java.math.BigInteger;

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

    public static void findFibbonace() {
        BigInteger prev = new BigInteger("0");
        BigInteger next = new BigInteger("1") ;
        BigInteger fibbo = new BigInteger("0");
        boolean flag = true;
        String str = "";
        int index = 0;
        while (flag) {
            index++;
            fibbo = prev.add(next);
            prev = next;
            next = fibbo;

            flag = length(prev, flag, index);
        }
    }

    private static boolean length(BigInteger prev, boolean flag, int index) {
        String str;
        str = String.valueOf(prev);
        if(str.length() == 1000){
            System.out.println("Index at : " + index );
            flag = false;
        }
        return flag;
    }

}

