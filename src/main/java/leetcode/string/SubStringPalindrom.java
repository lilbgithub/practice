package leetcode.string;

public class SubStringPalindrom {
    public static boolean isPalindrom(String s){
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if(ch1 != ch2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abccbc";
        for(int i = 0; i<str.length(); i++){
            for(int j= i+1; j<= str.length(); j++){
                String subStr = str.substring(i,j);
                if(isPalindrom(subStr)){
                    System.out.println(subStr);
                }
            }
        }
    }
}
