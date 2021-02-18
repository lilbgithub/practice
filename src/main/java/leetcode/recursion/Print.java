package leetcode.recursion;

public class Print {
    public static void main(String[] args) {
        printInt(5);
    }

    public static void printInt(int num){
        System.out.println(num);
        if(num ==0){
            return;
        }
        printInt(num -1);
    }

}
