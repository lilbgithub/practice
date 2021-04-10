package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/subdomain-visit-count/
 */
public class DomainVisitCount {

    public static void main(String[] args) {
        String[] list = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        Map<String, Integer> map = new HashMap<>();

        for (String domain : list) {
            int hits = Integer.parseInt(domain.substring(0, domain.indexOf(" ")));
            String domains = domain.substring(domain.indexOf(" ") + 1);

            while (!domains.isEmpty()) {
                map.put(domains, map.getOrDefault(domains,0) + hits);
                int index = domains.indexOf(".");

                if (index != -1) {
                    domains = domains.substring(index +1);
                } else {
                    domains = "";
                }
            }

        }

        List<String> outPut = new ArrayList<>();
        for (String key: map.keySet()){
            outPut.add(map.get(key) + " "+  key);
            System.out.println(map.get(key) + " "+  key);
        }
    }
}
