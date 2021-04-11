package practice.easy;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(basicIsPrime(3));
    }
    public static boolean basicIsPrime(int number){
        if(number == 1){
            return true;
        }
        if(number == 2){
            return true;
        }
        for (int i=2; i < Math.sqrt(number); i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}
