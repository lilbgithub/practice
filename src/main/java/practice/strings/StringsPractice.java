package practice.strings;

public class StringsPractice {
    public static void main(String[] args) {
       // substrings();
      //  palindromSubSring();
    }
    public static final void palindromSubSring(){
        String s = "abccbc";
       for(int i=0; i< s.length(); i++){
           for(int j=i; j< s.length();j++){
               String subStr = s.substring(i, j);
               if(isPalindrom(subStr)){
                   System.out.println(subStr);
               }
           }
       }
    }
    public static boolean isPalindrom(String s){
        int left =0;
        int right = s.length()-1;
        while (left<right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static final void substrings(){
        String s = "abcd";
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
