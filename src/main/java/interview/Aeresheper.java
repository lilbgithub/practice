package interview;

import java.math.BigInteger;

public class Aeresheper {

    public static void main(String[] args) {
        findFibbonace();
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

            str = String.valueOf(prev);
            if(str.length() == 1000){
                System.out.println("Index at : " + index );
                flag = false;
            }
        }
    }
}
