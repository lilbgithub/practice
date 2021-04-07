package interview;

/*
We are working on a security system for a badged-access room in our company's building.

Given an ordered list of employees who used their badge to enter or exit the room, write a function that returns two collections:

1. All employees who didn't use their badge while exiting the room - they recorded an enter without a matching exit. (All employees are required to leave the room before the log ends.)

2. All employees who didn't use their badge while entering the room - they recorded an exit without a matching enter. (The room is empty when the log begins.)

Each collection should contain no duplicates, regardless of how many times a given employee matches the criteria for belonging to it.

badge_records_1 = [
  ["Martha",   "exit"],
  ["Paul",     "enter"],
  ["Martha",   "enter"],
  ["Martha",   "exit"],
  ["Jennifer", "enter"],
  ["Paul",     "enter"],
  ["Curtis",   "exit"],
  ["Curtis",   "enter"],
  ["Paul",     "exit"],
  ["Martha",   "enter"],
  ["Martha",   "exit"],
  ["Jennifer", "exit"],
  ["Paul",     "enter"],
  ["Paul",     "enter"],
  ["Martha",   "exit"],
]

Expected output: no exit: ["Curtis", "Paul"], no enter: ["Martha", "Curtis"]

Additional test cases:

badge_records_2 = [
  ["Paul", "enter"],
  ["Paul", "enter"],
  ["Paul", "exit"],
]

Expected output: ["Paul"], []

badge_records_3 = [
  ["Paul", "enter"],
  ["Paul", "exit"],
  ["Paul", "exit"],
]

Expected output: [], ["Paul"]

badge_records_4 = [
  ["Paul", "enter"],
  ["Paul", "exit"],
  ["Paul", "exit"],
  ["Paul", "enter"],
  ["Martha", "enter"],
  ["Martha", "exit"],
]

Expected output: ["Paul"], ["Paul"]

badge_records_5 = [
  ["Paul", "enter"],
  ["Paul", "exit"],
]

Expected output: [], []

badge_records_6 = [
  ["Paul", "enter"],
  ["Paul", "enter"],
  ["Paul", "exit"],
  ["Paul", "exit"],
]

Expected output: ["Paul"], ["Paul"]

badge_records_7 = [
  ["Paul", "enter"],
  ["Paul", "exit"],
  ["Paul", "exit"],
  ["Paul", "enter"],
]

Expected output: ["Paul"], ["Paul"]


n: length of the badge records array

*/

import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] argv) {

        String badgeRecords1[][] = new String[][]{
                {"Martha", "exit"},
                {"Paul", "enter"},
                {"Martha", "enter"},
                {"Martha", "exit"},
                {"Jennifer", "enter"},
                {"Paul", "enter"},
                {"Curtis", "exit"},
                {"Curtis", "enter"},
                {"Paul", "exit"},
                {"Martha", "enter"},
                {"Martha", "exit"},
                {"Jennifer", "exit"},
                {"Paul", "enter"},
                {"Paul", "enter"},
                {"Martha", "exit"},
        };

        String badgeRecords2[][] = new String[][]{
                {"Paul", "enter"},
                {"Paul", "enter"},
                {"Paul", "exit"},
        };

        String badgeRecords3[][] = new String[][]{
                {"Paul", "enter"},
                {"Paul", "exit"},
                {"Paul", "exit"},
        };

        String badgeRecords4[][] = new String[][]{
                {"Paul", "enter"},
                {"Paul", "exit"},
                {"Paul", "exit"},
                {"Paul", "enter"},
                {"Martha", "enter"},
                {"Martha", "exit"},
        };

        String badgeRecords5[][] = new String[][]{
                {"Paul", "enter"},
                {"Paul", "exit"},
        };

        String badgeRecords6[][] = new String[][]{
                {"Paul", "enter"},
                {"Paul", "enter"},
                {"Paul", "exit"},
                {"Paul", "exit"},
        };

        String badgeRecords7[][] = new String[][]{
                {"Paul", "enter"},
                {"Paul", "exit"},
                {"Paul", "exit"},
                {"Paul", "enter"},
        };


        System.out.println(findMissingRecords(badgeRecords1));
        System.out.println(findMissingRecords(badgeRecords2));
        // System.out.println(findMissingRecords(badgeRecords3));
        // System.out.println(findMissingRecords(badgeRecords4));
        // System.out.println(findMissingRecords(badgeRecords5));
        // System.out.println(findMissingRecords(badgeRecords6));
        //System.out.println(findMissingRecords(badgeRecords7));


    }

    public static List<List<String>> findMissingRecords(String[][] records) {
        List<List<String>> missingRecords = new ArrayList<>();
        List<String> missingEntryList = new ArrayList<>();
        List<String> missingExitList = new ArrayList<>();

        Map<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < records.length; i++) {
            String[] record = records[i];
            String name = record[0];
            String status = record[1];
            if (map.containsKey(name) && map.get(name).equals("enter") && !missingExitList.contains(name)) {
                missingExitList.add(name);
            } else if (map.containsKey(name) && map.get(name).equals("exit") && !missingEntryList.contains(name)) {
                missingEntryList.add(name);
            } else if (!map.containsKey(name) && status.equals("exit") && !missingEntryList.contains(name)) {
                missingEntryList.add(name);
            }
            map.put(name, status);
        }

        missingRecords.add(missingExitList);
        missingRecords.add(missingEntryList);


        return missingRecords;
    }
}
