package practice.gettingStarted;

/*
https://www.pepcoding.com/resources/online-java-foundation/getting-started/rotate-a-number-official/ojquestion
 */
public class RotatNumber {
    public static void main(String[] args) {
        int number = 23145;

        rotate(number, 2);
        rotate(number, 6);
        rotate(number, -1);

    }

    public static int rotate(int n, int k) {

        int numberOfDigits = 0;
        int number = n;
        while (number > 0) {
            number = number / 10;
            numberOfDigits++;
        }
        int divisor = 1;
        int multiplayer = 1;

        // handle large number of rotaion, no need to iterate large number
        k = k%numberOfDigits; //example 5%5 =0, 6%5 =1 ...
        if(k<0){
            k= numberOfDigits + k;     //example: k=-1, digits=5, positive rotation = 5-4 =4
        }

        for(int i=1 ; i<=numberOfDigits; i++){

            if(i<=k){
                divisor = divisor * 10;
            }else {
                multiplayer = multiplayer * 10;
            }
        }
        int remainder = n%divisor;
        int remaining =  n/divisor;
        int result =  (remainder * multiplayer) + remaining;

        System.out.println(result);
        return result;
    }
}
