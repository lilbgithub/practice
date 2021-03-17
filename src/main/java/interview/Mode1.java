package interview;/*
We are building a word processor and we would like to implement a "word-wrap" functionality.

Given a list of words followed by a maximum number of characters in a line, return a collection of strings where each string element represents a line that contains as many words as possible, with the words in each line being concatenated with a single '-' (representing a space, but easier to see for testing). The length of each string must not exceed the maximum character length per line.

Your function should take in the maximum characters per line and return a data structure representing all lines in the indicated max length.

Examples:

words1 = [ "The", "day", "began", "as", "still", "as", "the",
          "night", "abruptly", "lighted", "with", "brilliant",
          "flame" ]

wrapLines(words1, 13) "wrap words1 to line length 13" =>

  [ "The-day-began",
    "as-still-as",
    "the-night",
    "abruptly",
    "lighted-with",
    "brilliant",
    "flame" ]

wrapLines(words1, 20) "wrap words1 to line length 20" =>

  [ "The-day-began-as",
    "still-as-the-night",
    "abruptly-lighted",
    "with-brilliant-flame" ]

words2 = [ "Hello" ]

wrapLines(words2, 5) "wrap words2 to line length 5" =>

  [ "Hello" ]

words3 = [ "Hello", "world" ]

wrapLines(words3, 5) "wrap words3 to line length 5" =>

  [ "Hello",
  "world" ]

words4 = ["Well", "Hello", "world" ]

wrapLines(words4, 5) "wrap words4 to line length 5" =>

  [ "Well",
  "Hello",
  "world" ]

words5 = ["Hello", "HelloWorld", "Hello", "Hello"]

wrapLines(words5, 20) "wrap words 5 to line length 20 =>

  [ "Hello-HelloWorld",
    "Hello-Hello" ]

*/

import java.io.*;
import java.util.*;
class Mode1 {
    public static void main(String[] argv) {
        String[] words1 = {"The","day","began","as","still","as","the","night","abruptly","lighted","with","brilliant","flame"};
        int lineLength1_1 = 13;
        int lineLength1_2 = 20;
        format(words1,lineLength1_1);

        String[] words2 = {"Hello"};
        int lineLength2_1 = 5;

        String[] words3 = {"Hello", "world"};
        int lineLength3_1 = 5;

        String[] words4 = {"Well", "Hello", "world"};
        int lineLength4_1 = 5;

        String[] words5 = {"Hello", "HelloWorld", "Hello", "Hello"};
        int lineLength5_1 = 20;



    }
    public static void format3(String[] words, int maxLenght){
        List<String> result = new ArrayList<>();
        StringBuilder element = new StringBuilder();
        String current =words[0];
        for (int i=1; i< words.length;  i++){
            String next = words[i];
             current = concat(current, next);

            if(!checkLength(current, maxLenght)){
                result.add(current);
            }else {

            }
        }

    }

    public static String concat(String current, String next){
        return  current + "_"+ next;
    }

    public static boolean checkLength(String s, int k){
        if(s.length()> k) return false;
        return true;
    }
    public static String[] format(String[] words, int maxLenght){


        List<String> list = new ArrayList<>();
        int remainingSpace = maxLenght;
        StringBuilder sb = new StringBuilder();
        boolean firstWord = true;
        int i = 0;
        while(i<words.length){
            if(firstWord && words[i].length() <= remainingSpace){
                sb.append(words[i]);
                remainingSpace = remainingSpace- words[i].length();
                firstWord = false;
                i++;
            }else if( words[i].length() < remainingSpace){
                sb.append("-");
                sb.append(words[i]);
                remainingSpace = remainingSpace - (words[i].length()+1);
                i++;
            }
            else{
                list.add(sb.toString());
                firstWord =true;
                remainingSpace = maxLenght ;
                sb = new StringBuilder();
            }

        }
        list.forEach(System.out::println);
        String[] result = new String[list.size()];
        for(int j =0;i< list.size();i++){
            result[j] = list.get(j);

        }

        return result;
    }
}
