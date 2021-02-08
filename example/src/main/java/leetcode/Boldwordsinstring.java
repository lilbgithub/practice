package leetcode;

import java.util.Arrays;

public class Boldwordsinstring {

    public static void main(String[] args) {
        String[] words = {"ab", "bc"};
        String s = "aabcd";
        Boldwordsinstring obj = new Boldwordsinstring();
        System.out.println(obj.demo(words, s));
    }

    /**
     * https://leetcode.com/problems/bold-words-in-string/discuss/928169/Java-beats-100
     *
     * @param words
     * @param str
     * @return
     */
    public String boldWords(String[] words, String str) {
        boolean[] flags = new boolean[str.length()];
        for (String word : words) {
            int index = str.indexOf(word);
            while (index > -1) {
                Arrays.fill(flags, index, index + word.length(), true);
                index = str.indexOf(word, index + word.length());
            }
        }
//[110011001]
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (flags[i] && (i == 0 || !flags[i - 1])) {
                result.append("<b>");
            }
            if (!flags[i] && i > 0 && flags[i - 1]) {
                result.append("</b>");
            }

            result.append(str.charAt(i));

            if (flags[str.length() - 1]) {
                result.append("</b>");
            }
        }
        return result.toString();
    }

    public String demo(String[] words, String str) {
        boolean[] flags = new boolean[str.length()];

        for (String word : words) {
            int index = str.indexOf(word);
            while (index > -1) {
                Arrays.fill(flags, index, index + word.length(), true);
                index = str.indexOf(word, index + word.length());
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
           if(flags[i] && (i==0 || !flags[i-1])){
               sb.append("<b>");
           }
           if(!flags[i] && i>0 && flags[i-1]){
               sb.append("</b>");
           }
            sb.append(str.charAt(i));

           if(flags[str.length()-1]){
                sb.append("</b>");
            }
        }

        return sb.toString();
    }

}
