package easy;

import java.util.HashMap;
import java.util.Map;

public class Simple {
    public static void main(String[] args) {
      //  reverseString();
        findDuplicate();
    }

    /**
     * Reverse string
     */
    private static void reverseString() {
        String str = "hello";
        char[] sArr = str.toCharArray();
        if (sArr.length > 0) {
            for (int i = 0; i < sArr.length / 2; i++) {
                char temp = sArr[i];
                sArr[i] = sArr[sArr.length - 1 - i];
                sArr[sArr.length - 1 - i] = temp;
            }
        }

        System.out.println(sArr.toString());
    }

    private static void findDuplicate() {
        String str = "aaba";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for (Character c : map.keySet()) {
            if (map.get(c) > 1) {
                System.out.println("Duplicate " + map.get(c));
            }
        }
        //        map.forEach((k,v)->{
//            if(v >1){
//                System.out.println(k +" "+ v);
//            }
//        });

    }
}
