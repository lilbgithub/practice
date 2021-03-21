package interview;

/**
 * You are running a classroom and suspect that some of your students are passing around the answers to multiple choice questions disguised as random strings.
 * <p>
 * Your task is to write a function that, given a list of words and a string, finds and returns the word in the list that is scrambled up inside the string, if any exists. There will be at most one matching word. The letters don't need to be contiguous.
 * <p>
 * Example:
 * words = ['cat', 'baby', 'dog', 'bird', 'car', 'ax']
 * string1 = 'tcabnihjs'
 * find_embedded_word(words, string1) -> cat
 * <p>
 * string2 = 'tbcanihjs'
 * find_embedded_word(words, string2) -> cat
 * <p>
 * string3 = 'baykkjl'
 * find_embedded_word(words, string3) -> None / null
 * <p>
 * string4 = 'bbabylkkj'
 * find_embedded_word(words, string4) -> baby
 * <p>
 * string5 = 'ccc'
 * find_embedded_word(words, string5) -> None / null
 * <p>
 * string6 = 'breadmaking'
 * find_embedded_word(words, string6) -> bird
 * <p>
 * W = number of words in `words`
 * L = maximal string length of each word
 */

public class Indeed {
    public static void main(String[] argv) {

        String[] words = new String[]{"cat", "baby", "dog", "bird", "car", "ax"};
        String string1 = "tcabnihjs";
        String string2 = "tbcanihjs";
        String string3 = "baykkjl";
        String string4 = "bbabylkkj";
        String string5 = "ccc";
        String string6 = "breadmaking";

        System.out.println(find_embedded_word(words, string1));
        System.out.println(find_embedded_word(words, string2));
        System.out.println(find_embedded_word(words, string3));
        System.out.println(find_embedded_word(words, string4));
        System.out.println(find_embedded_word(words, string5));
        System.out.println(find_embedded_word(words, string6));


    }

    public static String find_embedded_word(String[] words, String str) {
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char[] charArray = word.toCharArray();
            String s = new String(str);
            for (int j = 0; j < charArray.length; j++) {
                char ch = charArray[j];
                if (s.indexOf(ch) < 0) {
                    break;
                } else if (j == charArray.length - 1) {
                    return word;
                } else {
                    s = s.replaceFirst(String.valueOf(ch), "");
                }
            }
        }
        return null;
    }
}

