package practice.gettingStarted;

public class ReverseTheNumber {
    public static void main(String[] args) {
        int number = 4878;
        int reverse = 0;
        while (number > 0) {
            int remainder = number % 10;//4 9
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("The reverse of number is : " + reverse);
    }
}
