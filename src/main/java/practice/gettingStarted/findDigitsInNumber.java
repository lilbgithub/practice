package practice.gettingStarted;

public class findDigitsInNumber {
    public static void main(String[] args) {
        int number = 9876;
        int digits = 0;
        while (number > 0) {
            number = number / 10;
            digits++;
        }
        System.out.println("Total digits : " + digits);
    }
}
